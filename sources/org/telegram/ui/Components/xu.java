package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xu extends FrameLayout {
    public final j80 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ug.r0 e;
    public final org.telegram.ui.ActionBar.q0 f;
    public final boolean h;
    public final bi.e9 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ bv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(bv bvVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.y = bvVar;
        this.n = new bi.e9(this, 7);
        final int i7 = 0;
        this.s = false;
        this.w = 0.0f;
        this.h = z10;
        final int i10 = 1;
        if (z10) {
            f10 = 32.0f;
        } else {
            Pattern pattern = bv.Q1;
            float f13 = 8.0f;
            if (org.telegram.messenger.i10.i(bvVar.a).q()) {
                f11 = 28.0f;
                f12 = 16.0f;
            } else {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(4.0f), context, bvVar.J0, false);
                this.e = r0Var;
                r0Var.b(org.telegram.messenger.gd.N0(2131743629, null), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                    public final /* synthetic */ xu b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = i7;
                        xu xuVar = this.b;
                        switch (i11) {
                            case 0:
                                bv bvVar2 = xuVar.y;
                                bvVar2.L1 = SystemClock.elapsedRealtime();
                                bvVar2.N0();
                                break;
                            case 1:
                                bv.K0(xuVar.n, xuVar.r, true, null, null);
                                xuVar.a(true, true);
                                break;
                            case 2:
                                bi.e9 e9Var = xuVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.r;
                                lo loVar = new lo(xuVar, 13);
                                Pattern pattern2 = bv.Q1;
                                if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                    org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                                }
                                xuVar.a(false, true);
                                break;
                            default:
                                xuVar.f.V(null, null);
                                break;
                        }
                    }
                }, false);
                r0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                r0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(r0Var, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                r0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30));
                f13 = (org.telegram.messenger.g0.L(16.0f) + r0Var.getMeasuredWidth()) / org.telegram.messenger.g0.p;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, bvVar.J0);
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i11, bvVar.J0), 14.0f);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i11);
            org.telegram.ui.ActionBar.i6 i6Var = bvVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.u6.j(textView, e10, M, e11, i6Var);
            textView.setText(org.telegram.messenger.gd.N0(2131754483, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                public final /* synthetic */ xu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i10;
                    xu xuVar = this.b;
                    switch (i112) {
                        case 0:
                            bv bvVar2 = xuVar.y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            break;
                        case 1:
                            bv.K0(xuVar.n, xuVar.r, true, null, null);
                            xuVar.a(true, true);
                            break;
                        case 2:
                            bi.e9 e9Var = xuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.r;
                            lo loVar = new lo(xuVar, 13);
                            Pattern pattern2 = bv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                            }
                            xuVar.a(false, true);
                            break;
                        default:
                            xuVar.f.V(null, null);
                            break;
                    }
                }
            });
            addView(textView, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView2, i11, bvVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, bvVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i11, 15);
            org.telegram.ui.ActionBar.i6 i6Var2 = bvVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.u6.j(textView2, a02, null, g10, i6Var2);
            textView2.setText(org.telegram.messenger.gd.N0(2131744614, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            final int i12 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                public final /* synthetic */ xu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i12;
                    xu xuVar = this.b;
                    switch (i112) {
                        case 0:
                            bv bvVar2 = xuVar.y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            break;
                        case 1:
                            bv.K0(xuVar.n, xuVar.r, true, null, null);
                            xuVar.a(true, true);
                            break;
                        case 2:
                            bi.e9 e9Var = xuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.r;
                            lo loVar = new lo(xuVar, 13);
                            Pattern pattern2 = bv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                            }
                            xuVar.a(false, true);
                            break;
                        default:
                            xuVar.f.V(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.na.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.p);
        }
        float f15 = f10;
        Pattern pattern2 = bv.Q1;
        j80 j80Var = new j80(context, bvVar.J0);
        this.a = j80Var;
        j80Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        j80Var.setEllipsize(truncateAt);
        j80Var.setSingleLine(true);
        j80Var.setLines(1);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, bvVar.J0);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.j5, bvVar.J0);
        if (z10) {
            j80Var.setTextSize(1, 20.0f);
            addView(j80Var, c8.na.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            j80Var.setTextSize(1, 17.0f);
            addView(j80Var, c8.na.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.q5, bvVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.na.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Aj, bvVar.J0), false, bvVar.J0);
            this.f = q0Var;
            q0Var.setLongClickEnabled(false);
            q0Var.setSubMenuOpenSide(2);
            q0Var.setIcon(R.drawable.ic_ab_other);
            int i13 = org.telegram.ui.ActionBar.n6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, bvVar.J0), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i13);
            org.telegram.ui.ActionBar.i6 i6Var3 = bvVar.J0;
            q0Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(q0Var, h02, null, M2, i6Var3);
            addView(q0Var, c8.na.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (bvVar.u0 / org.telegram.messenger.g0.p), 0.0f));
            q0Var.e(1, R.drawable.msg_share, org.telegram.messenger.gd.N0(2131744605, null));
            q0Var.e(2, R.drawable.msg_link, org.telegram.messenger.gd.N0(2131751750, null));
            final int i14 = 3;
            q0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vu
                public final /* synthetic */ xu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i14;
                    xu xuVar = this.b;
                    switch (i112) {
                        case 0:
                            bv bvVar2 = xuVar.y;
                            bvVar2.L1 = SystemClock.elapsedRealtime();
                            bvVar2.N0();
                            break;
                        case 1:
                            bv.K0(xuVar.n, xuVar.r, true, null, null);
                            xuVar.a(true, true);
                            break;
                        case 2:
                            bi.e9 e9Var = xuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xuVar.r;
                            lo loVar = new lo(xuVar, 13);
                            Pattern pattern22 = bv.Q1;
                            if (e9Var != null && tL_messages_stickerSet != null && e9Var.getFragmentView() != null) {
                                org.telegram.messenger.ri.d0(e9Var.getCurrentAccount()).l2(e9Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, e9Var, null, true, true, loVar, true);
                            }
                            xuVar.a(false, true);
                            break;
                        default:
                            xuVar.f.V(null, null);
                            break;
                    }
                }
            });
            q0Var.setDelegate(new b0(bvVar, 28));
            q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        }
    }

    public final void a(boolean z10, boolean z11) {
        TextView textView;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x = null;
        }
        TextView textView2 = this.c;
        if (textView2 == null || (textView = this.d) == null) {
            return;
        }
        textView2.setClickable(!z10);
        textView.setClickable(z10);
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new w(this, 19));
            this.x.setInterpolator(kr.h);
            this.x.setDuration(250L);
            this.x.start();
            return;
        }
        this.w = z10 ? 1.0f : 0.0f;
        textView2.setScaleX(z10 ? 0.0f : 1.0f);
        textView2.setScaleY(z10 ? 0.0f : 1.0f);
        textView2.setAlpha(z10 ? 0.0f : 1.0f);
        textView.setScaleX(z10 ? 1.0f : 0.0f);
        textView.setScaleY(z10 ? 1.0f : 0.0f);
        textView.setAlpha(z10 ? 1.0f : 0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
