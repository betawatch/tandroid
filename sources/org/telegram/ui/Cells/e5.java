package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout {
    public final org.telegram.ui.Components.u8 a;
    public final org.telegram.ui.Components.k9 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public e5(Context context, final d5 d5Var, boolean z10) {
        super(context);
        this.a = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
        this.b = k9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.c = k5Var;
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(getContext());
        this.d = k5Var2;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(k9Var, mf.d(46, 46.0f, bd.a0 ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        k5Var.setGravity(bd.a0 ? 5 : 3);
        final int i3 = 1;
        k5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z11 = bd.a0;
        addView(k5Var, mf.d(-1, -2.0f, 48, z11 ? 12.0f : 74.0f, 12.0f, z11 ? 74.0f : 12.0f, 0.0f));
        k5Var2.setGravity(bd.a0 ? 5 : 3);
        k5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.y6, null);
        k5Var2.setTextSize(14);
        boolean z12 = bd.a0;
        addView(k5Var2, mf.d(-1, -2.0f, 48, z12 ? 12.0f : 74.0f, 36.0f, z12 ? 74.0f : 12.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 16.0f));
        textView.setGravity((bd.a0 ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(L, 0, L, 0);
        textView.setText(bd.M0(z10 ? 2131754378 : 2131754373, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c5
            public final /* synthetic */ e5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e5 e5Var = this.b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 == null) {
                            e5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.k) d5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        e5 e5Var2 = this.b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 == null) {
                            e5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.k) d5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        boolean z13 = bd.a0;
        addView(textView, mf.d(-2, 32.0f, z13 ? 5 : 3, z13 ? 0.0f : 73.0f, 62.0f, z13 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L * 2);
        TextView textView2 = new TextView(getContext());
        int L2 = org.telegram.messenger.g0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), -16777216));
        textView2.setGravity((bd.a0 ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L, 0, L, 0);
        textView2.setText(bd.M0(2131751370, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c5
            public final /* synthetic */ e5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        e5 e5Var = this.b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 == null) {
                            e5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((zh.k) d5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        e5 e5Var2 = this.b;
                        d5 d5Var3 = d5Var;
                        if (d5Var3 == null) {
                            e5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = e5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((zh.k) d5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.g0.L(32.0f), bd.a0 ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.g0.L(62.0f);
        layoutParams.leftMargin = bd.a0 ? 0 : (int) (org.telegram.messenger.g0.L(79.0f) + measureText);
        layoutParams.rightMargin = bd.a0 ? (int) (measureText + org.telegram.messenger.g0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(107.0f), TLObject.FLAG_30));
    }
}
