package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import f2.n1;
import h7.e5;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 extends f2.p0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public i0 r;
    public final int s;
    public final AccelerateDecelerateInterpolator v;
    public final /* synthetic */ m0 w;

    public k0(m0 m0Var) {
        this.w = m0Var;
        Context context = m0Var.y;
        this.d = LayoutInflater.from(context);
        this.e = e5.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = e5.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = e5.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = e5.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.v = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // f2.p0
    public final void A(n1 n1Var) {
        this.w.H.values().remove(n1Var);
    }

    public final void D(int i10, View view) {
        l lVar = new l(view, i10, view.getLayoutParams().height, 1);
        lVar.setAnimationListener(new i(this, 2));
        lVar.setDuration(this.s);
        lVar.setInterpolator(this.v);
        view.startAnimation(lVar);
    }

    public final Drawable E(c2.b0 b0Var) {
        Uri uri = b0Var.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.w.y.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e10) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e10);
            }
        }
        int i10 = b0Var.n;
        return i10 != 1 ? i10 != 2 ? b0Var.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        c2.q qVar;
        m0 m0Var = this.w;
        ArrayList arrayList = m0Var.x;
        arrayList.clear();
        ArrayList arrayList2 = m0Var.v;
        ArrayList arrayList3 = new ArrayList();
        c2.a0 a0Var = m0Var.r.a;
        a0Var.getClass();
        c2.d0.b();
        for (c2.b0 b0Var : DesugarCollections.unmodifiableList(a0Var.b)) {
            za.c b10 = m0Var.r.b(b0Var);
            if (b10 != null && (qVar = (c2.q) b10.b) != null && qVar.d) {
                arrayList3.add(b0Var);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        l();
    }

    public final void G() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        m0 m0Var = this.w;
        ArrayList arrayList2 = m0Var.w;
        Context context = m0Var.y;
        ArrayList arrayList3 = m0Var.v;
        this.r = new i0(m0Var.r, 1);
        ArrayList arrayList4 = m0Var.s;
        boolean z10 = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new i0(m0Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList.add(new i0((c2.b0) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z11 = false;
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                c2.b0 b0Var = (c2.b0) obj2;
                if (!arrayList4.contains(b0Var)) {
                    if (!z11) {
                        m0Var.r.getClass();
                        c2.r a2 = c2.b0.a();
                        String j10 = a2 != null ? a2.j() : null;
                        if (TextUtils.isEmpty(j10)) {
                            j10 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new i0(j10, 2));
                        z11 = true;
                    }
                    arrayList.add(new i0(b0Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                c2.b0 b0Var2 = (c2.b0) obj3;
                c2.b0 b0Var3 = m0Var.r;
                if (b0Var3 != b0Var2) {
                    if (!z10) {
                        b0Var3.getClass();
                        c2.r a10 = c2.b0.a();
                        String k9 = a10 != null ? a10.k() : null;
                        if (TextUtils.isEmpty(k9)) {
                            k9 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new i0(k9, 2));
                        z10 = true;
                    }
                    arrayList.add(new i0(b0Var2, 4));
                }
            }
        }
        F();
    }

    @Override // f2.p0
    public final int h() {
        return this.c.size() + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        i0 i0Var;
        if (i10 == 0) {
            i0Var = this.r;
        } else {
            i0Var = (i0) this.c.get(i10 - 1);
        }
        return i0Var.b;
    }

    @Override // f2.p0
    public final void v(n1 n1Var, int i10) {
        za.c b10;
        c2.q qVar;
        ArrayList arrayList = this.c;
        int i11 = (i10 == 0 ? this.r : (i0) arrayList.get(i10 - 1)).b;
        i0 i0Var = i10 == 0 ? this.r : (i0) arrayList.get(i10 - 1);
        m0 m0Var = this.w;
        int i12 = 0;
        if (i11 == 1) {
            m0Var.H.put(((c2.b0) i0Var.a).c, (e0) n1Var);
            g0 g0Var = (g0) n1Var;
            View view = g0Var.a;
            m0 m0Var2 = g0Var.B.w;
            if (m0Var2.e0 && DesugarCollections.unmodifiableList(m0Var2.r.v).size() > 1) {
                i12 = g0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
            c2.b0 b0Var = (c2.b0) i0Var.a;
            g0Var.t(b0Var);
            g0Var.z.setText(b0Var.d);
            return;
        }
        if (i11 == 2) {
            ((h0) n1Var).v.setText(i0Var.a.toString());
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            f0 f0Var = (f0) n1Var;
            View view2 = f0Var.v;
            c2.b0 b0Var2 = (c2.b0) i0Var.a;
            f0Var.A = b0Var2;
            ImageView imageView = f0Var.w;
            imageView.setVisibility(0);
            f0Var.x.setVisibility(4);
            k0 k0Var = f0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(k0Var.w.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == b0Var2) ? f0Var.z : 1.0f);
            view2.setOnClickListener(new v(f0Var, 2));
            imageView.setImageDrawable(k0Var.E(b0Var2));
            f0Var.y.setText(b0Var2.d);
            return;
        }
        m0Var.H.put(((c2.b0) i0Var.a).c, (e0) n1Var);
        j0 j0Var = (j0) n1Var;
        float f9 = j0Var.F;
        v vVar = j0Var.H;
        ImageView imageView2 = j0Var.A;
        View view3 = j0Var.z;
        CheckBox checkBox = j0Var.E;
        c2.b0 b0Var3 = (c2.b0) i0Var.a;
        k0 k0Var2 = j0Var.I;
        m0 m0Var3 = k0Var2.w;
        if (b0Var3 == m0Var3.r && DesugarCollections.unmodifiableList(b0Var3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(b0Var3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c2.b0 b0Var4 = (c2.b0) it.next();
                if (!m0Var3.v.contains(b0Var4)) {
                    b0Var3 = b0Var4;
                    break;
                }
            }
        }
        j0Var.t(b0Var3);
        imageView2.setImageDrawable(k0Var2.E(b0Var3));
        j0Var.C.setText(b0Var3.d);
        checkBox.setVisibility(0);
        boolean v = j0Var.v(b0Var3);
        boolean z10 = !m0Var3.x.contains(b0Var3) && (!j0Var.v(b0Var3) || DesugarCollections.unmodifiableList(m0Var3.r.v).size() >= 2) && (!j0Var.v(b0Var3) || ((b10 = m0Var3.r.b(b0Var3)) != null && ((qVar = (c2.q) b10.b) == null || qVar.c)));
        checkBox.setChecked(v);
        j0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z10);
        checkBox.setEnabled(z10);
        j0Var.w.setEnabled(z10 || v);
        j0Var.x.setEnabled(z10 || v);
        view3.setOnClickListener(vVar);
        checkBox.setOnClickListener(vVar);
        RelativeLayout relativeLayout = j0Var.D;
        if (v && !j0Var.v.e()) {
            i12 = j0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i12;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z10 || v) ? 1.0f : f9);
        checkBox.setAlpha((z10 || !v) ? 1.0f : f9);
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 == 1) {
            return new g0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i10 == 2) {
            return new h0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i10 == 3) {
            return new j0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i10 == 4) {
            return new f0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
