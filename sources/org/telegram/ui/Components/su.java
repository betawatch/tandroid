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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class su extends FrameLayout {
    public final z70 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ug.q0 e;
    public final org.telegram.ui.ActionBar.q0 f;
    public final boolean h;
    public final bi.t6 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ wu y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(wu wuVar, Context context, boolean z10) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.y = wuVar;
        this.n = new bi.t6(this, 7);
        final int i7 = 0;
        this.s = false;
        this.w = 0.0f;
        this.h = z10;
        final int i10 = 1;
        if (z10) {
            f10 = 32.0f;
        } else {
            Pattern pattern = wu.Q1;
            float f13 = 8.0f;
            if (org.telegram.messenger.m10.i(wuVar.a).q()) {
                f11 = 28.0f;
                f12 = 16.0f;
            } else {
                f12 = 16.0f;
                f11 = 28.0f;
                ug.q0 q0Var = new ug.q0(org.telegram.messenger.g0.L(4.0f), context, wuVar.J0, false);
                this.e = q0Var;
                q0Var.b(org.telegram.messenger.hd.M0(2131743876, null), new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qu
                    public final /* synthetic */ su b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11 = i7;
                        su suVar = this.b;
                        switch (i11) {
                            case 0:
                                wu wuVar2 = suVar.y;
                                wuVar2.L1 = SystemClock.elapsedRealtime();
                                wuVar2.M0();
                                break;
                            case 1:
                                wu.J0(suVar.n, suVar.r, true, null, null);
                                suVar.a(true, true);
                                break;
                            case 2:
                                bi.t6 t6Var = suVar.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.r;
                                fo foVar = new fo(suVar, 13);
                                Pattern pattern2 = wu.Q1;
                                if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                    org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                                }
                                suVar.a(false, true);
                                break;
                            default:
                                suVar.f.V(null, null);
                                break;
                        }
                    }
                }, false);
                q0Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
                int L = org.telegram.messenger.g0.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                q0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                addView(q0Var, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                q0Var.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), TLObject.FLAG_30));
                f13 = (org.telegram.messenger.g0.L(16.0f) + q0Var.getMeasuredWidth()) / org.telegram.messenger.g0.p;
            }
            float f14 = f13;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, wuVar.J0);
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i11, wuVar.J0), 14.0f);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i11);
            org.telegram.ui.ActionBar.e6 e6Var = wuVar.J0;
            textView.setBackground(e10);
            org.telegram.ui.ActionBar.q6.j(textView, e10, M, e11, e6Var);
            textView.setText(org.telegram.messenger.hd.M0(2131754486, null));
            textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qu
                public final /* synthetic */ su b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i10;
                    su suVar = this.b;
                    switch (i112) {
                        case 0:
                            wu wuVar2 = suVar.y;
                            wuVar2.L1 = SystemClock.elapsedRealtime();
                            wuVar2.M0();
                            break;
                        case 1:
                            wu.J0(suVar.n, suVar.r, true, null, null);
                            suVar.a(true, true);
                            break;
                        case 2:
                            bi.t6 t6Var = suVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.r;
                            fo foVar = new fo(suVar, 13);
                            Pattern pattern2 = wu.Q1;
                            if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                            }
                            suVar.a(false, true);
                            break;
                        default:
                            suVar.f.V(null, null);
                            break;
                    }
                }
            });
            addView(textView, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
            float max = Math.max(f14, (org.telegram.messenger.g0.L(f12) + textView.getMeasuredWidth()) / org.telegram.messenger.g0.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(textView2, i11, wuVar.J0);
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i11, wuVar.J0) & 268435455, 4, 4);
            org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i11, 15);
            org.telegram.ui.ActionBar.e6 e6Var2 = wuVar.J0;
            textView2.setBackground(a02);
            org.telegram.ui.ActionBar.q6.j(textView2, a02, null, g10, e6Var2);
            textView2.setText(org.telegram.messenger.hd.M0(2131744855, null));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            textView2.setGravity(17);
            final int i12 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qu
                public final /* synthetic */ su b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i12;
                    su suVar = this.b;
                    switch (i112) {
                        case 0:
                            wu wuVar2 = suVar.y;
                            wuVar2.L1 = SystemClock.elapsedRealtime();
                            wuVar2.M0();
                            break;
                        case 1:
                            wu.J0(suVar.n, suVar.r, true, null, null);
                            suVar.a(true, true);
                            break;
                        case 2:
                            bi.t6 t6Var = suVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.r;
                            fo foVar = new fo(suVar, 13);
                            Pattern pattern2 = wu.Q1;
                            if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                            }
                            suVar.a(false, true);
                            break;
                        default:
                            suVar.f.V(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, c8.ja.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f11), TLObject.FLAG_30));
            f10 = Math.max(max, (org.telegram.messenger.g0.L(f12) + textView2.getMeasuredWidth()) / org.telegram.messenger.g0.p);
        }
        float f15 = f10;
        Pattern pattern2 = wu.Q1;
        z70 z70Var = new z70(context, wuVar.J0);
        this.a = z70Var;
        z70Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        z70Var.setEllipsize(truncateAt);
        z70Var.setSingleLine(true);
        z70Var.setLines(1);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, wuVar.J0);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.j5, wuVar.J0);
        if (z10) {
            z70Var.setTextSize(1, 20.0f);
            addView(z70Var, c8.ja.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f15, 0.0f));
        } else {
            z70Var.setTextSize(1, 17.0f);
            addView(z70Var, c8.ja.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f15, 0.0f));
        }
        if (!z10) {
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.q5, wuVar.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, c8.ja.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f15, 0.0f));
        }
        if (z10) {
            org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Aj, wuVar.J0), false, wuVar.J0);
            this.f = q0Var2;
            q0Var2.setLongClickEnabled(false);
            q0Var2.setSubMenuOpenSide(2);
            q0Var2.setIcon(R.drawable.ic_ab_other);
            int i13 = org.telegram.ui.ActionBar.j6.Ej;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, wuVar.J0), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
            org.telegram.ui.ActionBar.e6 e6Var3 = wuVar.J0;
            q0Var2.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(q0Var2, h02, null, M2, e6Var3);
            addView(q0Var2, c8.ja.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (wuVar.u0 / org.telegram.messenger.g0.p), 0.0f));
            q0Var2.e(1, R.drawable.msg_share, org.telegram.messenger.hd.M0(2131744846, null));
            q0Var2.e(2, R.drawable.msg_link, org.telegram.messenger.hd.M0(2131751762, null));
            final int i14 = 3;
            q0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qu
                public final /* synthetic */ su b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i14;
                    su suVar = this.b;
                    switch (i112) {
                        case 0:
                            wu wuVar2 = suVar.y;
                            wuVar2.L1 = SystemClock.elapsedRealtime();
                            wuVar2.M0();
                            break;
                        case 1:
                            wu.J0(suVar.n, suVar.r, true, null, null);
                            suVar.a(true, true);
                            break;
                        case 2:
                            bi.t6 t6Var = suVar.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = suVar.r;
                            fo foVar = new fo(suVar, 13);
                            Pattern pattern22 = wu.Q1;
                            if (t6Var != null && tL_messages_stickerSet != null && t6Var.getFragmentView() != null) {
                                org.telegram.messenger.si.b0(t6Var.getCurrentAccount()).g2(t6Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, t6Var, null, true, true, foVar, true);
                            }
                            suVar.a(false, true);
                            break;
                        default:
                            suVar.f.V(null, null);
                            break;
                    }
                }
            });
            q0Var2.setDelegate(new s(wuVar, 29));
            q0Var2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
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
            ofFloat.addUpdateListener(new c6(this, 18));
            this.x.setInterpolator(er.h);
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
