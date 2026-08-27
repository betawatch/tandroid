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
import f2.o1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n0 extends f2.q0 {
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
        this.e = g7.b0.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = g7.b0.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = g7.b0.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = g7.b0.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.v = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // f2.q0
    public final void A(o1 o1Var) {
        this.w.H.values().remove(o1Var);
    }

    public final void D(int i10, View view) {
        m mVar = new m(view, i10, view.getLayoutParams().height, 1);
        mVar.setAnimationListener(new o(this, 2));
        mVar.setDuration(this.s);
        mVar.setInterpolator(this.v);
        view.startAnimation(mVar);
    }

    public final Drawable E(c2.z zVar) {
        Uri uri = zVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.w.y.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e9) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e9);
            }
        }
        int i10 = zVar.n;
        return i10 != 1 ? i10 != 2 ? zVar.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        c2.p pVar;
        p0 p0Var = this.w;
        ArrayList arrayList = p0Var.x;
        arrayList.clear();
        ArrayList arrayList2 = p0Var.v;
        ArrayList arrayList3 = new ArrayList();
        c2.y yVar = p0Var.r.a;
        yVar.getClass();
        c2.b0.b();
        for (c2.z zVar : DesugarCollections.unmodifiableList(yVar.b)) {
            ae.b b10 = p0Var.r.b(zVar);
            if (b10 != null && (pVar = (c2.p) b10.b) != null && pVar.d) {
                arrayList3.add(zVar);
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList.add(new l0((c2.z) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z11 = false;
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                c2.z zVar = (c2.z) obj2;
                if (!arrayList4.contains(zVar)) {
                    if (!z11) {
                        p0Var.r.getClass();
                        c2.q a2 = c2.z.a();
                        String j10 = a2 != null ? a2.j() : null;
                        if (TextUtils.isEmpty(j10)) {
                            j10 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new l0(j10, 2));
                        z11 = true;
                    }
                    arrayList.add(new l0(zVar, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                c2.z zVar2 = (c2.z) obj3;
                c2.z zVar3 = p0Var.r;
                if (zVar3 != zVar2) {
                    if (!z10) {
                        zVar3.getClass();
                        c2.q a3 = c2.z.a();
                        String k10 = a3 != null ? a3.k() : null;
                        if (TextUtils.isEmpty(k10)) {
                            k10 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new l0(k10, 2));
                        z10 = true;
                    }
                    arrayList.add(new l0(zVar2, 4));
                }
            }
        }
        F();
    }

    @Override // f2.q0
    public final int h() {
        return this.c.size() + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        l0 l0Var;
        if (i10 == 0) {
            l0Var = this.r;
        } else {
            l0Var = (l0) this.c.get(i10 - 1);
        }
        return l0Var.b;
    }

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        ae.b b10;
        c2.p pVar;
        ArrayList arrayList = this.c;
        int i11 = (i10 == 0 ? this.r : (l0) arrayList.get(i10 - 1)).b;
        l0 l0Var = i10 == 0 ? this.r : (l0) arrayList.get(i10 - 1);
        p0 p0Var = this.w;
        int i12 = 0;
        if (i11 == 1) {
            p0Var.H.put(((c2.z) l0Var.a).c, (g0) o1Var);
            j0 j0Var = (j0) o1Var;
            View view = j0Var.a;
            p0 p0Var2 = j0Var.B.w;
            if (p0Var2.e0 && DesugarCollections.unmodifiableList(p0Var2.r.v).size() > 1) {
                i12 = j0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
            c2.z zVar = (c2.z) l0Var.a;
            j0Var.t(zVar);
            j0Var.z.setText(zVar.d);
            return;
        }
        if (i11 == 2) {
            ((k0) o1Var).v.setText(l0Var.a.toString());
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            i0 i0Var = (i0) o1Var;
            View view2 = i0Var.v;
            c2.z zVar2 = (c2.z) l0Var.a;
            i0Var.A = zVar2;
            ImageView imageView = i0Var.w;
            imageView.setVisibility(0);
            i0Var.x.setVisibility(4);
            n0 n0Var = i0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(n0Var.w.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == zVar2) ? i0Var.z : 1.0f);
            view2.setOnClickListener(new f0(i0Var, 3));
            imageView.setImageDrawable(n0Var.E(zVar2));
            i0Var.y.setText(zVar2.d);
            return;
        }
        p0Var.H.put(((c2.z) l0Var.a).c, (g0) o1Var);
        m0 m0Var = (m0) o1Var;
        float f10 = m0Var.F;
        f0 f0Var = m0Var.H;
        ImageView imageView2 = m0Var.A;
        View view3 = m0Var.z;
        CheckBox checkBox = m0Var.E;
        c2.z zVar3 = (c2.z) l0Var.a;
        n0 n0Var2 = m0Var.I;
        p0 p0Var3 = n0Var2.w;
        if (zVar3 == p0Var3.r && DesugarCollections.unmodifiableList(zVar3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(zVar3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c2.z zVar4 = (c2.z) it.next();
                if (!p0Var3.v.contains(zVar4)) {
                    zVar3 = zVar4;
                    break;
                }
            }
        }
        m0Var.t(zVar3);
        imageView2.setImageDrawable(n0Var2.E(zVar3));
        m0Var.C.setText(zVar3.d);
        checkBox.setVisibility(0);
        boolean v = m0Var.v(zVar3);
        boolean z10 = !p0Var3.x.contains(zVar3) && (!m0Var.v(zVar3) || DesugarCollections.unmodifiableList(p0Var3.r.v).size() >= 2) && (!m0Var.v(zVar3) || ((b10 = p0Var3.r.b(zVar3)) != null && ((pVar = (c2.p) b10.b) == null || pVar.c)));
        checkBox.setChecked(v);
        m0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z10);
        checkBox.setEnabled(z10);
        m0Var.w.setEnabled(z10 || v);
        m0Var.x.setEnabled(z10 || v);
        view3.setOnClickListener(f0Var);
        checkBox.setOnClickListener(f0Var);
        RelativeLayout relativeLayout = m0Var.D;
        if (v && !m0Var.v.e()) {
            i12 = m0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i12;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z10 || v) ? 1.0f : f10);
        checkBox.setAlpha((z10 || !v) ? 1.0f : f10);
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.d;
        if (i10 == 1) {
            return new j0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i10 == 2) {
            return new k0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i10 == 3) {
            return new m0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i10 == 4) {
            return new i0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
