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
import b8.d1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 extends u4.h0 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public k0 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final /* synthetic */ o0 x;

    public m0(o0 o0Var) {
        this.x = o0Var;
        Context context = o0Var.E;
        this.d = LayoutInflater.from(context);
        this.e = d1.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = d1.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = d1.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = d1.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        this.x.M.values().remove(d1Var);
    }

    public final void D(int i3, View view) {
        m mVar = new m(view, i3, view.getLayoutParams().height, 1);
        mVar.setAnimationListener(new g0(this, 0));
        mVar.setDuration(this.s);
        mVar.setInterpolator(this.w);
        view.startAnimation(mVar);
    }

    public final Drawable E(r4.w wVar) {
        Uri uri = wVar.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.x.E.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e10) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e10);
            }
        }
        int i3 = wVar.n;
        return i3 != 1 ? i3 != 2 ? wVar.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        r4.o oVar;
        o0 o0Var = this.x;
        ArrayList arrayList = o0Var.y;
        arrayList.clear();
        ArrayList arrayList2 = o0Var.w;
        ArrayList arrayList3 = new ArrayList();
        r4.v vVar = o0Var.r.a;
        vVar.getClass();
        r4.y.b();
        for (r4.w wVar : DesugarCollections.unmodifiableList(vVar.b)) {
            y00 b10 = o0Var.r.b(wVar);
            if (b10 != null && (oVar = (r4.o) b10.a) != null && oVar.d) {
                arrayList3.add(wVar);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        f();
    }

    public final void G() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        o0 o0Var = this.x;
        ArrayList arrayList2 = o0Var.x;
        Context context = o0Var.E;
        ArrayList arrayList3 = o0Var.w;
        this.r = new k0(o0Var.r, 1);
        ArrayList arrayList4 = o0Var.s;
        boolean z10 = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new k0(o0Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList4.get(i3);
                i3++;
                arrayList.add(new k0((r4.w) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                r4.w wVar = (r4.w) obj2;
                if (!arrayList4.contains(wVar)) {
                    if (!z11) {
                        o0Var.r.getClass();
                        r4.p a10 = r4.w.a();
                        String j10 = a10 != null ? a10.j() : null;
                        if (TextUtils.isEmpty(j10)) {
                            j10 = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new k0(j10, 2));
                        z11 = true;
                    }
                    arrayList.add(new k0(wVar, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                r4.w wVar2 = (r4.w) obj3;
                r4.w wVar3 = o0Var.r;
                if (wVar3 != wVar2) {
                    if (!z10) {
                        wVar3.getClass();
                        r4.p a11 = r4.w.a();
                        String k10 = a11 != null ? a11.k() : null;
                        if (TextUtils.isEmpty(k10)) {
                            k10 = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new k0(k10, 2));
                        z10 = true;
                    }
                    arrayList.add(new k0(wVar2, 4));
                }
            }
        }
        F();
    }

    @Override // u4.h0
    public final int b() {
        return this.c.size() + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        k0 k0Var;
        if (i3 == 0) {
            k0Var = this.r;
        } else {
            k0Var = (k0) this.c.get(i3 - 1);
        }
        return k0Var.b;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        y00 b10;
        r4.o oVar;
        ArrayList arrayList = this.c;
        int i10 = (i3 == 0 ? this.r : (k0) arrayList.get(i3 - 1)).b;
        k0 k0Var = i3 == 0 ? this.r : (k0) arrayList.get(i3 - 1);
        o0 o0Var = this.x;
        int i11 = 0;
        if (i10 == 1) {
            o0Var.M.put(((r4.w) k0Var.a).c, (f0) d1Var);
            i0 i0Var = (i0) d1Var;
            View view = i0Var.a;
            o0 o0Var2 = i0Var.B.x;
            if (o0Var2.j0 && DesugarCollections.unmodifiableList(o0Var2.r.v).size() > 1) {
                i11 = i0Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i11;
            view.setLayoutParams(layoutParams);
            r4.w wVar = (r4.w) k0Var.a;
            i0Var.t(wVar);
            i0Var.z.setText(wVar.d);
            return;
        }
        if (i10 == 2) {
            ((j0) d1Var).v.setText(k0Var.a.toString());
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            h0 h0Var = (h0) d1Var;
            View view2 = h0Var.v;
            r4.w wVar2 = (r4.w) k0Var.a;
            h0Var.A = wVar2;
            ImageView imageView = h0Var.w;
            imageView.setVisibility(0);
            h0Var.x.setVisibility(4);
            m0 m0Var = h0Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(m0Var.x.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == wVar2) ? h0Var.z : 1.0f);
            view2.setOnClickListener(new w(h0Var, 2));
            imageView.setImageDrawable(m0Var.E(wVar2));
            h0Var.y.setText(wVar2.d);
            return;
        }
        o0Var.M.put(((r4.w) k0Var.a).c, (f0) d1Var);
        l0 l0Var = (l0) d1Var;
        float f10 = l0Var.F;
        w wVar3 = l0Var.H;
        ImageView imageView2 = l0Var.A;
        View view3 = l0Var.z;
        CheckBox checkBox = l0Var.E;
        r4.w wVar4 = (r4.w) k0Var.a;
        m0 m0Var2 = l0Var.I;
        o0 o0Var3 = m0Var2.x;
        if (wVar4 == o0Var3.r && DesugarCollections.unmodifiableList(wVar4.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(wVar4.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r4.w wVar5 = (r4.w) it.next();
                if (!o0Var3.w.contains(wVar5)) {
                    wVar4 = wVar5;
                    break;
                }
            }
        }
        l0Var.t(wVar4);
        imageView2.setImageDrawable(m0Var2.E(wVar4));
        l0Var.C.setText(wVar4.d);
        checkBox.setVisibility(0);
        boolean v = l0Var.v(wVar4);
        boolean z10 = !o0Var3.y.contains(wVar4) && (!l0Var.v(wVar4) || DesugarCollections.unmodifiableList(o0Var3.r.v).size() >= 2) && (!l0Var.v(wVar4) || ((b10 = o0Var3.r.b(wVar4)) != null && ((oVar = (r4.o) b10.a) == null || oVar.c)));
        checkBox.setChecked(v);
        l0Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z10);
        checkBox.setEnabled(z10);
        l0Var.w.setEnabled(z10 || v);
        l0Var.x.setEnabled(z10 || v);
        view3.setOnClickListener(wVar3);
        checkBox.setOnClickListener(wVar3);
        RelativeLayout relativeLayout = l0Var.D;
        if (v && !l0Var.v.e()) {
            i11 = l0Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i11;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z10 || v) ? 1.0f : f10);
        checkBox.setAlpha((z10 || !v) ? 1.0f : f10);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        LayoutInflater layoutInflater = this.d;
        if (i3 == 1) {
            return new i0(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i3 == 2) {
            return new j0(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i3 == 3) {
            return new l0(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i3 == 4) {
            return new h0(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }
}
