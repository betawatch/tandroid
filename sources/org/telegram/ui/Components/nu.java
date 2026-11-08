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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class nu extends FrameLayout {
    public final w70 a;
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
                p0Var.b(org.telegram.messenger.id.M0(2131743879, null), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lu
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
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, ruVar.I0);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i11, ruVar.I0), 14.0f);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            org.telegram.ui.ActionBar.n6 f15 = org.telegram.ui.ActionBar.r6.f(i11);
            org.telegram.ui.ActionBar.f6 f6Var = ruVar.I0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.r6.k(textView, e10, N, f15, f6Var);
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
            org.telegram.ui.ActionBar.r6.V(textView2, i11, ruVar.I0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, ruVar.I0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 15);
            org.telegram.ui.ActionBar.f6 f6Var2 = ruVar.I0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.r6.k(textView2, a02, null, h, f6Var2);
            textView2.setText(org.telegram.messenger.id.M0(2131744858, null));
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
        float f16 = f10;
        Pattern pattern2 = ru.M1;
        w70 w70Var = new w70(context, ruVar.I0);
        this.a = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        w70Var.setEllipsize(truncateAt);
        w70Var.setSingleLine(true);
        w70Var.setLines(1);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, ruVar.I0);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.j5, ruVar.I0);
        if (z9) {
            w70Var.setTextSize(1, 20.0f);
            addView(w70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f16, 0.0f));
        } else {
            w70Var.setTextSize(1, 17.0f);
            addView(w70Var, c8.ha.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f16, 0.0f));
        }
        if (!z9) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q5, ruVar.I0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ha.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f16, 0.0f));
        }
        if (z9) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, ruVar.I0), false, ruVar.I0);
            this.f = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setSubMenuOpenSide(2);
            r0Var.setIcon(R.drawable.ic_ab_other);
            int i13 = org.telegram.ui.ActionBar.k6.Bj;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, ruVar.I0), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i13);
            org.telegram.ui.ActionBar.f6 f6Var3 = ruVar.I0;
            r0Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(r0Var, h02, null, N2, f6Var3);
            addView(r0Var, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (ruVar.t0 / org.telegram.messenger.g0.p), 0.0f));
            r0Var.e(1, R.drawable.msg_share, org.telegram.messenger.id.M0(2131744849, null));
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
