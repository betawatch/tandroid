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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yu extends FrameLayout {
    public final p80 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final kg.x0 e;
    public final org.telegram.ui.ActionBar.t0 f;
    public final boolean h;
    public final kg.q1 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ cv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(cv cvVar, Context context, boolean z10) {
        super(context);
        float f7;
        float f10;
        this.y = cvVar;
        this.n = new kg.q1(this, 3);
        final int i10 = 0;
        this.s = false;
        this.w = 0.0f;
        this.h = z10;
        final int i11 = 1;
        if (z10) {
            f7 = 32.0f;
        } else {
            Pattern pattern = cv.M1;
            float f11 = 8.0f;
            if (org.telegram.messenger.d20.i(cvVar.a).q()) {
                f10 = 28.0f;
            } else {
                f10 = 28.0f;
                kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(4.0f), context, cvVar.I0, false);
                this.e = x0Var;
                x0Var.b(org.telegram.messenger.cd.L0(2131743901, null), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wu
                    public final /* synthetic */ yu b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i10;
                        yu yuVar = this.b;
                        switch (i12) {
                            case 0:
                                cv cvVar2 = yuVar.y;
                                cvVar2.H1 = SystemClock.elapsedRealtime();
                                cvVar2.M0();
                                break;
                            case 1:
                                cv.J0(yuVar.n, yuVar.r, true, null, null);
                                yuVar.a(true, true);
                                break;
                            case 2:
                                kg.q1 q1Var = yuVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                                ho hoVar = new ho(yuVar, 13);
                                Pattern pattern2 = cv.M1;
                                if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                    org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                                }
                                yuVar.a(false, true);
                                break;
                            default:
                                yuVar.f.U(null, null);
                                break;
                        }
                    }
                }, false);
                x0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
                int L = org.telegram.messenger.i0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
                x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                addView(x0Var, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                x0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28.0f), TLObject.FLAG_30));
                f11 = (org.telegram.messenger.i0.L(16.0f) + x0Var.getMeasuredWidth()) / org.telegram.messenger.i0.p;
            }
            float f12 = f11;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, cvVar.I0);
            int i12 = org.telegram.ui.ActionBar.t6.Ci;
            org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i12, cvVar.I0), 14.0f);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            org.telegram.ui.ActionBar.w6 f13 = org.telegram.ui.ActionBar.a7.f(i12);
            org.telegram.ui.ActionBar.p6 p6Var = cvVar.I0;
            textView.setBackground(e);
            org.telegram.ui.ActionBar.a7.k(textView, e, N, f13, p6Var);
            textView.setText(org.telegram.messenger.cd.L0(2131754486, null));
            textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wu
                public final /* synthetic */ yu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i11;
                    yu yuVar = this.b;
                    switch (i122) {
                        case 0:
                            cv cvVar2 = yuVar.y;
                            cvVar2.H1 = SystemClock.elapsedRealtime();
                            cvVar2.M0();
                            break;
                        case 1:
                            cv.J0(yuVar.n, yuVar.r, true, null, null);
                            yuVar.a(true, true);
                            break;
                        case 2:
                            kg.q1 q1Var = yuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                            ho hoVar = new ho(yuVar, 13);
                            Pattern pattern2 = cv.M1;
                            if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                            }
                            yuVar.a(false, true);
                            break;
                        default:
                            yuVar.f.U(null, null);
                            break;
                    }
                }
            });
            addView(textView, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), TLObject.FLAG_30));
            float max = Math.max(f12, (org.telegram.messenger.i0.L(16.0f) + textView.getMeasuredWidth()) / org.telegram.messenger.i0.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView2, i12, cvVar.I0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, cvVar.I0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 15);
            org.telegram.ui.ActionBar.p6 p6Var2 = cvVar.I0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.a7.k(textView2, a02, null, h, p6Var2);
            textView2.setText(org.telegram.messenger.cd.L0(2131744873, null));
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
            textView2.setGravity(17);
            final int i13 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wu
                public final /* synthetic */ yu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i13;
                    yu yuVar = this.b;
                    switch (i122) {
                        case 0:
                            cv cvVar2 = yuVar.y;
                            cvVar2.H1 = SystemClock.elapsedRealtime();
                            cvVar2.M0();
                            break;
                        case 1:
                            cv.J0(yuVar.n, yuVar.r, true, null, null);
                            yuVar.a(true, true);
                            break;
                        case 2:
                            kg.q1 q1Var = yuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                            ho hoVar = new ho(yuVar, 13);
                            Pattern pattern2 = cv.M1;
                            if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                            }
                            yuVar.a(false, true);
                            break;
                        default:
                            yuVar.f.U(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, w7.b6.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f10), TLObject.FLAG_30));
            f7 = Math.max(max, (org.telegram.messenger.i0.L(16.0f) + textView2.getMeasuredWidth()) / org.telegram.messenger.i0.p);
        }
        float f14 = f7;
        Pattern pattern2 = cv.M1;
        p80 p80Var = new p80(context, cvVar.I0);
        this.a = p80Var;
        p80Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        p80Var.setLines(1);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, cvVar.I0);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.j5, cvVar.I0);
        if (z10) {
            p80Var.setTextSize(1, 20.0f);
            addView(p80Var, w7.b6.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f14, 0.0f));
        } else {
            p80Var.setTextSize(1, 17.0f);
            addView(p80Var, w7.b6.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f14, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q5, cvVar.I0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, w7.b6.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f14, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xj, cvVar.I0), false, cvVar.I0);
            this.f = t0Var;
            t0Var.setLongClickEnabled(false);
            t0Var.setSubMenuOpenSide(2);
            t0Var.setIcon(R.drawable.ic_ab_other);
            int i14 = org.telegram.ui.ActionBar.t6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i14, cvVar.I0), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
            org.telegram.ui.ActionBar.p6 p6Var3 = cvVar.I0;
            t0Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N2, p6Var3);
            addView(t0Var, w7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (cvVar.t0 / org.telegram.messenger.i0.p), 0.0f));
            t0Var.e(1, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131744864, null));
            t0Var.e(2, R.drawable.msg_link, org.telegram.messenger.cd.L0(2131751762, null));
            final int i15 = 3;
            t0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wu
                public final /* synthetic */ yu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i15;
                    yu yuVar = this.b;
                    switch (i122) {
                        case 0:
                            cv cvVar2 = yuVar.y;
                            cvVar2.H1 = SystemClock.elapsedRealtime();
                            cvVar2.M0();
                            break;
                        case 1:
                            cv.J0(yuVar.n, yuVar.r, true, null, null);
                            yuVar.a(true, true);
                            break;
                        case 2:
                            kg.q1 q1Var = yuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yuVar.r;
                            ho hoVar = new ho(yuVar, 13);
                            Pattern pattern22 = cv.M1;
                            if (q1Var != null && tL_messages_stickerSet != null && q1Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(q1Var.getCurrentAccount()).g2(q1Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, q1Var, null, true, true, hoVar, true);
                            }
                            yuVar.a(false, true);
                            break;
                        default:
                            yuVar.f.U(null, null);
                            break;
                    }
                }
            });
            t0Var.setDelegate(new t(cvVar, 29));
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
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
            ofFloat.addUpdateListener(new a6(this, 18));
            this.x.setInterpolator(gr.h);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
