package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements org.telegram.ui.ActionBar.o0, zf.b, org.telegram.messenger.bb, org.telegram.messenger.db, org.telegram.messenger.eb, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ mk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // org.telegram.messenger.eb
    public void a(org.telegram.messenger.fa faVar) {
        bl blVar = this.b;
        ImageView imageView = blVar.n;
        if (faVar.b() instanceof al) {
            blVar.Q.setVisibility(4);
            if (!blVar.r0) {
                int i10 = org.telegram.ui.ActionBar.t6.ij;
                org.telegram.ui.ActionBar.a7.t(imageView, i10, blVar.a, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                blVar.r0 = true;
            }
            yk ykVar = blVar.D;
            ykVar.getClass();
            HashMap hashMap = ykVar.a;
            al alVar = (al) faVar.b();
            bl blVar2 = ykVar.b;
            al alVar2 = blVar2.f0;
            org.telegram.ui.ActionBar.p6 p6Var = blVar2.a;
            if (alVar2 == alVar) {
                return;
            }
            blVar2.g0(false);
            org.telegram.messenger.fa faVar2 = blVar2.e0;
            if (faVar2 != null) {
                View view = (View) hashMap.get(faVar2);
                if (view != null) {
                    ykVar.removeView(view);
                    hashMap.remove(faVar2);
                }
                blVar2.e0 = null;
            }
            blVar2.f0 = alVar;
            blVar2.e0 = faVar;
            Context context = ykVar.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            ykVar.addView(frameLayout, w7.b6.c(114.0f, -2));
            FrameLayout frameLayout2 = new FrameLayout(context);
            blVar2.g0 = frameLayout2;
            frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
            FrameLayout frameLayout3 = blVar2.g0;
            org.telegram.ui.ActionBar.a7.y(frameLayout3, frameLayout3.getBackground(), org.telegram.ui.ActionBar.t6.h5, p6Var, PorterDuff.Mode.MULTIPLY);
            frameLayout.addView(blVar2.g0, w7.b6.c(71.0f, -2));
            blVar2.g0.setAlpha(0.0f);
            blVar2.g0.setOnClickListener(new org.telegram.ui.ud(23, ykVar, alVar));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            TextView l4 = org.telegram.ui.Cells.f1.l(blVar2.g0, textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
            l4.setTextSize(1, 14.0f);
            l4.setMaxLines(1);
            l4.setEllipsize(truncateAt);
            l4.setSingleLine(true);
            org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.A6, p6Var);
            l4.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
            blVar2.g0.addView(l4, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(alVar.c.title);
            l4.setText(org.telegram.messenger.cd.L0(2131744280, null));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(36.0f), org.telegram.ui.Cells.x4.a(alVar.a)));
            frameLayout.addView(frameLayout4, w7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            g9 g9Var = new g9(context);
            g9Var.h(a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), alVar.c.venue_type, "_64.png"), null, null);
            frameLayout4.addView(g9Var, w7.b6.e(30, 30, 17));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xk(ykVar, frameLayout4));
            ofFloat.setDuration(360L);
            ofFloat.start();
            hashMap.put(faVar, frameLayout);
            blVar2.F.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(faVar.a()), org.telegram.messenger.zs.X4);
        }
    }

    @Override // zf.b
    public void b(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                bl blVar = this.b;
                ArrayList arrayList2 = blVar.c0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((al) arrayList2.get(i10)).b.c();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            org.telegram.messenger.ab onCreateMarkerOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            l2.f fVar = (l2.f) onCreateMarkerOptions;
                            ((j8.f) fVar.b).a = new LatLng(geoPoint.lat, geoPoint._long);
                            ((j8.f) fVar.b).d = v7.n8.a(blVar.Z(i11));
                            fVar.e(0.5f);
                            String str = tL_messageMediaVenue.title;
                            j8.f fVar2 = (j8.f) fVar.b;
                            fVar2.b = str;
                            fVar2.c = tL_messageMediaVenue.address;
                            al alVar = new al();
                            alVar.a = i11;
                            org.telegram.messenger.fa a2 = blVar.F.a(fVar);
                            alVar.b = a2;
                            alVar.c = tL_messageMediaVenue;
                            a2.f(alVar);
                            arrayList2.add(alVar);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    break;
                }
                break;
            default:
                bl blVar2 = this.b;
                blVar2.k0 = false;
                blVar2.i0();
                break;
        }
    }

    @Override // org.telegram.messenger.bb
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ja jaVar) {
        MotionEvent motionEvent2;
        bl blVar = this.b;
        if (blVar.I != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-blVar.I) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = jaVar.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override // org.telegram.messenger.db
    public void d(int i10) {
        View childAt;
        bl blVar = this.b;
        ag.b1 b1Var = blVar.N;
        if (i10 == 1) {
            blVar.g0(true);
            if (blVar.e0 != null) {
                blVar.Q.setVisibility(0);
                yk ykVar = blVar.D;
                org.telegram.messenger.fa faVar = blVar.e0;
                HashMap hashMap = ykVar.a;
                View view = (View) hashMap.get(faVar);
                if (view != null) {
                    ykVar.removeView(view);
                    hashMap.remove(faVar);
                }
                blVar.e0 = null;
                blVar.f0 = null;
                blVar.g0 = null;
            }
            if (blVar.J || b1Var.getChildCount() <= 0 || (childAt = b1Var.getChildAt(0)) == null) {
                return;
            }
            View F = b1Var.F(childAt);
            s4.c1 T = F == null ? null : b1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int L = blVar.v0 == 0 ? 0 : org.telegram.messenger.i0.L(66.0f);
            int top = childAt.getTop();
            if (top < (-L)) {
                jg.c0 d = blVar.F.d();
                blVar.H = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.b, d.c);
                b1Var.w0(0, top + L, null);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        bl.W(this.b);
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        org.telegram.messenger.ga gaVar = this.b.F;
        if (gaVar == null) {
            return;
        }
        if (i10 == 2) {
            gaVar.k(0);
        } else if (i10 == 3) {
            gaVar.k(1);
        } else if (i10 == 4) {
            gaVar.k(2);
        }
    }
}
