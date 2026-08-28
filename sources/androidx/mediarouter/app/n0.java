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
import f2.q1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 extends f2.r0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public l0 r;
    public final int s;
    public final AccelerateDecelerateInterpolator v;
    public final /* synthetic */ p0 w;

    public n0(p0 p0Var) {
        this.w = p0Var;
        Context context = p0Var.y;
        this.d = LayoutInflater.from(context);
        this.e = f7.d0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = f7.d0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = f7.d0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = f7.d0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.v = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // f2.r0
    public final void A(q1 q1Var) {
        this.w.H.values().remove(q1Var);
    }

    public final void D(int i9, View view) {
        o oVar = new o(view, i9, view.getLayoutParams().height, 1);
        oVar.setAnimationListener(new l(this, 2));
        oVar.setDuration(this.s);
        oVar.setInterpolator(this.v);
        view.startAnimation(oVar);
    }

    public final Drawable E(c2.a0 a0Var) {
        Uri uri = a0Var.f;
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
        int i9 = a0Var.n;
        return i9 != 1 ? i9 != 2 ? a0Var.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        c2.p pVar;
        p0 p0Var = this.w;
        ArrayList arrayList = p0Var.x;
        arrayList.clear();
        ArrayList arrayList2 = p0Var.v;
        ArrayList arrayList3 = new ArrayList();
        c2.z zVar = p0Var.r.a;
        zVar.getClass();
        c2.c0.b();
        for (c2.a0 a0Var : DesugarCollections.unmodifiableList(zVar.b)) {
            fa.c b10 = p0Var.r.b(a0Var);
            if (b10 != null && (pVar = (c2.p) b10.b) != null && pVar.d) {
                arrayList3.add(a0Var);
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
        p0 p0Var = this.w;
        ArrayList arrayList2 = p0Var.w;
        Context context = p0Var.y;
        ArrayList arrayList3 = p0Var.v;
        this.r = new l0(p0Var.r, 1);
        ArrayList arrayList4 = p0Var.s;
        boolean z10 = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new l0(p0Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList4.get(i9);
                i9++;
                arrayList.add(new l0((c2.a0) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                c2.a0 a0Var = (c2.a0) obj2;
                if (!arrayList4.contains(a0Var)) {
                    if (!z11) {
                        p0Var.r.getClass();
                        c2.q a2 = c2.a0.a();
                        String j10 = a2 != null ? a2.j() : null;
                        if (TextUtils.isEmpty(j10)) {
                            j10 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new l0(j10, 2));
                        z11 = true;
                    }
                    arrayList.add(new l0(a0Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                c2.a0 a0Var2 = (c2.a0) obj3;
                c2.a0 a0Var3 = p0Var.r;
                if (a0Var3 != a0Var2) {
                    if (!z10) {
                        a0Var3.getClass();
                        c2.q a3 = c2.a0.a();
                        String k10 = a3 != null ? a3.k() : null;
                        if (TextUtils.isEmpty(k10)) {
                            k10 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new l0(k10, 2));
                        z10 = true;
                    }
                    arrayList.add(new l0(a0Var2, 4));
                }
            }
        }
        F();
    }

    @Override // f2.r0
    public final int h() {
        return this.c.size() + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        l0 l0Var;
        if (i9 == 0) {
            l0Var = this.r;
        } else {
            l0Var = (l0) this.c.get(i9 - 1);
        }
        return l0Var.b;
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        fa.c b10;
        c2.p pVar;
        ArrayList arrayList = this.c;
        int i10 = (i9 == 0 ? this.r : (l0) arrayList.get(i9 - 1)).b;
        l0 l0Var = i9 == 0 ? this.r : (l0) arrayList.get(i9 - 1);
        p0 p0Var = this.w;
        int i11 = 0;
        if (i10 == 1) {
            p0Var.H.put(((c2.a0) l0Var.a).c, (h0) q1Var);
            j0 j0Var = (j0) q1Var;
            View view = j0Var.a;
            p0 p0Var2 = j0Var.B.w;
            if (p0Var2.e0 && DesugarCollections.unmodifiableList(p0Var2.r.v).size() > 1) {
                i11 = j0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i11;
            view.setLayoutParams(layoutParams);
            c2.a0 a0Var = (c2.a0) l0Var.a;
            j0Var.t(a0Var);
            j0Var.z.setText(a0Var.d);
            return;
        }
        if (i10 == 2) {
            ((k0) q1Var).v.setText(l0Var.a.toString());
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            i0 i0Var = (i0) q1Var;
            View view2 = i0Var.v;
            c2.a0 a0Var2 = (c2.a0) l0Var.a;
            i0Var.A = a0Var2;
            ImageView imageView = i0Var.w;
            imageView.setVisibility(0);
            i0Var.x.setVisibility(4);
            n0 n0Var = i0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(n0Var.w.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == a0Var2) ? i0Var.z : 1.0f);
            view2.setOnClickListener(new y(i0Var, 2));
            imageView.setImageDrawable(n0Var.E(a0Var2));
            i0Var.y.setText(a0Var2.d);
            return;
        }
        p0Var.H.put(((c2.a0) l0Var.a).c, (h0) q1Var);
        m0 m0Var = (m0) q1Var;
        float f10 = m0Var.F;
        y yVar = m0Var.H;
        ImageView imageView2 = m0Var.A;
        View view3 = m0Var.z;
        CheckBox checkBox = m0Var.E;
        c2.a0 a0Var3 = (c2.a0) l0Var.a;
        n0 n0Var2 = m0Var.I;
        p0 p0Var3 = n0Var2.w;
        if (a0Var3 == p0Var3.r && DesugarCollections.unmodifiableList(a0Var3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(a0Var3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c2.a0 a0Var4 = (c2.a0) it.next();
                if (!p0Var3.v.contains(a0Var4)) {
                    a0Var3 = a0Var4;
                    break;
                }
            }
        }
        m0Var.t(a0Var3);
        imageView2.setImageDrawable(n0Var2.E(a0Var3));
        m0Var.C.setText(a0Var3.d);
        checkBox.setVisibility(0);
        boolean v = m0Var.v(a0Var3);
        boolean z10 = !p0Var3.x.contains(a0Var3) && (!m0Var.v(a0Var3) || DesugarCollections.unmodifiableList(p0Var3.r.v).size() >= 2) && (!m0Var.v(a0Var3) || ((b10 = p0Var3.r.b(a0Var3)) != null && ((pVar = (c2.p) b10.b) == null || pVar.c)));
        checkBox.setChecked(v);
        m0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z10);
        checkBox.setEnabled(z10);
        m0Var.w.setEnabled(z10 || v);
        m0Var.x.setEnabled(z10 || v);
        view3.setOnClickListener(yVar);
        checkBox.setOnClickListener(yVar);
        RelativeLayout relativeLayout = m0Var.D;
        if (v && !m0Var.v.e()) {
            i11 = m0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i11;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z10 || v) ? 1.0f : f10);
        checkBox.setAlpha((z10 || !v) ? 1.0f : f10);
    }

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflater = this.d;
        if (i9 == 1) {
            return new j0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i9 == 2) {
            return new k0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i9 == 3) {
            return new m0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i9 == 4) {
            return new i0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
