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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nu extends FrameLayout {
    public final x70 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ug.p0 e;
    public final org.telegram.ui.ActionBar.r0 f;
    public final boolean h;
    public final bi.w4 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ ru y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(ru ruVar, Context context, boolean z9) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.y = ruVar;
        this.n = new bi.w4(this, 6);
        final int i7 = 0;
        this.s = false;
        this.w = 0.0f;
        this.h = z9;
        final int i10 = 1;
        if (z9) {
            f10 = 32.0f;
        } else {
            Pattern pattern = ru.M1;
            float f13 = 8.0f;
            if (org.telegram.messenger.p10.i(ruVar.a).q()) {
                f11 = 28.0f;
                f12 = 16.0f;
            } else {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(4.0f), context, ruVar.I0, false);
                this.e = p0Var;
                p0Var.b(org.telegram.messenger.id.M0(2131743876, null), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lu
                    public final /* synthetic */ nu b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = i7;
                        nu nuVar = this.b;
                        switch (i11) {
                            case 0:
                                ru ruVar2 = nuVar.y;
                                ruVar2.H1 = SystemClock.elapsedRealtime();
                                ruVar2.M0();
                                break;
                            case 1:
                                ru.J0(nuVar.n, nuVar.r, true, null, null);
                                nuVar.a(true, true);
                                break;
                            case 2:
                                bi.w4 w4Var = nuVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nuVar.r;
                                gp gpVar = new gp(nuVar, 11);
                                Pattern pattern2 = ru.M1;
                                if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                    org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                                }
                                nuVar.a(false, true);
                                break;
                            default:
                                nuVar.f.U(null, null);
                                break;
                        }
                    }
                }, false);
                p0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(p0Var, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                p0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30));
                f13 = (org.telegram.messenger.g0.L(16.0f) + p0Var.getMeasuredWidth()) / org.telegram.messenger.g0.p;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, ruVar.I0);
            int i11 = org.telegram.ui.ActionBar.l6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.l6.w0(i11, ruVar.I0), 14.0f);
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
            org.telegram.ui.ActionBar.o6 e11 = org.telegram.ui.ActionBar.s6.e(i11);
            org.telegram.ui.ActionBar.g6 g6Var = ruVar.I0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.s6.j(textView, e10, M, e11, g6Var);
            textView.setText(org.telegram.messenger.id.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lu
                public final /* synthetic */ nu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i10;
                    nu nuVar = this.b;
                    switch (i112) {
                        case 0:
                            ru ruVar2 = nuVar.y;
                            ruVar2.H1 = SystemClock.elapsedRealtime();
                            ruVar2.M0();
                            break;
                        case 1:
                            ru.J0(nuVar.n, nuVar.r, true, null, null);
                            nuVar.a(true, true);
                            break;
                        case 2:
                            bi.w4 w4Var = nuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nuVar.r;
                            gp gpVar = new gp(nuVar, 11);
                            Pattern pattern2 = ru.M1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            nuVar.a(false, true);
                            break;
                        default:
                            nuVar.f.U(null, null);
                            break;
                    }
                }
            });
            addView(textView, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.s6.U(textView2, i11, ruVar.I0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i11, ruVar.I0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i11, 15);
            org.telegram.ui.ActionBar.g6 g6Var2 = ruVar.I0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.s6.j(textView2, a02, null, g10, g6Var2);
            textView2.setText(org.telegram.messenger.id.M0(2131744855, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            final int i12 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lu
                public final /* synthetic */ nu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i12;
                    nu nuVar = this.b;
                    switch (i112) {
                        case 0:
                            ru ruVar2 = nuVar.y;
                            ruVar2.H1 = SystemClock.elapsedRealtime();
                            ruVar2.M0();
                            break;
                        case 1:
                            ru.J0(nuVar.n, nuVar.r, true, null, null);
                            nuVar.a(true, true);
                            break;
                        case 2:
                            bi.w4 w4Var = nuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nuVar.r;
                            gp gpVar = new gp(nuVar, 11);
                            Pattern pattern2 = ru.M1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            nuVar.a(false, true);
                            break;
                        default:
                            nuVar.f.U(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.ha.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.p);
        }
        float f15 = f10;
        Pattern pattern2 = ru.M1;
        x70 x70Var = new x70(context, ruVar.I0);
        this.a = x70Var;
        x70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        x70Var.setEllipsize(truncateAt);
        x70Var.setSingleLine(true);
        x70Var.setLines(1);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.J6, ruVar.I0);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.j5, ruVar.I0);
        if (z9) {
            x70Var.setTextSize(1, 20.0f);
            addView(x70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            x70Var.setTextSize(1, 17.0f);
            addView(x70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z9) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.q5, ruVar.I0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ha.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z9) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.xj, ruVar.I0), false, ruVar.I0);
            this.f = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(R.drawable.ic_ab_other);
            int i13 = org.telegram.ui.ActionBar.l6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i13, ruVar.I0), 1, -1);
            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i13);
            org.telegram.ui.ActionBar.g6 g6Var3 = ruVar.I0;
            r0Var.setBackground(h02);
            org.telegram.ui.ActionBar.s6.j(r0Var, h02, null, M2, g6Var3);
            addView(r0Var, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (ruVar.t0 / org.telegram.messenger.g0.p), 0.0f));
            r0Var.e(1, R.drawable.msg_share, org.telegram.messenger.id.M0(2131744846, null));
            r0Var.e(2, R.drawable.msg_link, org.telegram.messenger.id.M0(2131751762, null));
            final int i14 = 3;
            r0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lu
                public final /* synthetic */ nu b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i14;
                    nu nuVar = this.b;
                    switch (i112) {
                        case 0:
                            ru ruVar2 = nuVar.y;
                            ruVar2.H1 = SystemClock.elapsedRealtime();
                            ruVar2.M0();
                            break;
                        case 1:
                            ru.J0(nuVar.n, nuVar.r, true, null, null);
                            nuVar.a(true, true);
                            break;
                        case 2:
                            bi.w4 w4Var = nuVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = nuVar.r;
                            gp gpVar = new gp(nuVar, 11);
                            Pattern pattern22 = ru.M1;
                            if (w4Var != null && tL_messages_stickerSet != null && w4Var.getFragmentView() != null) {
                                org.telegram.messenger.ui.b0(w4Var.getCurrentAccount()).g2(w4Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, w4Var, null, true, true, gpVar, true);
                            }
                            nuVar.a(false, true);
                            break;
                        default:
                            nuVar.f.U(null, null);
                            break;
                    }
                }
            });
            r0Var.setDelegate(new u(ruVar, 29));
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        }
    }

    public final void a(boolean z9, boolean z10) {
        TextView textView;
        if (this.s == z9) {
            return;
        }
        this.s = z9;
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x = null;
        }
        TextView textView2 = this.c;
        if (textView2 == null || (textView = this.d) == null) {
            return;
        }
        textView2.setClickable(!z9);
        textView.setClickable(z9);
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z9 ? 1.0f : 0.0f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 18));
            this.x.setInterpolator(xq.h);
            this.x.setDuration(250L);
            this.x.start();
            return;
        }
        this.w = z9 ? 1.0f : 0.0f;
        textView2.setScaleX(z9 ? 0.0f : 1.0f);
        textView2.setScaleY(z9 ? 0.0f : 1.0f);
        textView2.setAlpha(z9 ? 0.0f : 1.0f);
        textView.setScaleX(z9 ? 1.0f : 0.0f);
        textView.setScaleY(z9 ? 1.0f : 0.0f);
        textView.setAlpha(z9 ? 1.0f : 0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
