package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i5 extends FrameLayout {
    public final org.telegram.ui.Components.r8 a;
    public final org.telegram.ui.Components.g9 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public i5(Context context, final h5 h5Var, boolean z10) {
        super(context);
        this.a = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
        this.b = g9Var;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.c = u5Var;
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(getContext());
        this.d = u5Var2;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        addView(g9Var, w7.b6.d(46, 46.0f, cd.X ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        u5Var.setGravity(cd.X ? 5 : 3);
        final int i10 = 1;
        u5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(17);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        boolean z11 = cd.X;
        addView(u5Var, w7.b6.d(-1, -2.0f, 48, z11 ? 12.0f : 74.0f, 12.0f, z11 ? 74.0f : 12.0f, 0.0f));
        u5Var2.setGravity(cd.X ? 5 : 3);
        u5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.y6, null);
        u5Var2.setTextSize(14);
        boolean z12 = cd.X;
        addView(u5Var2, w7.b6.d(-1, -2.0f, 48, z12 ? 12.0f : 74.0f, 36.0f, z12 ? 74.0f : 12.0f, 0.0f));
        int L = org.telegram.messenger.i0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 16.0f));
        textView.setGravity((cd.X ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(L, 0, L, 0);
        textView.setText(cd.L0(z10 ? 2131754378 : 2131754373, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.g5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        i5 i5Var = this.b;
                        h5 h5Var2 = h5Var;
                        if (h5Var2 == null) {
                            i5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = i5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((oh.q) h5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        i5 i5Var2 = this.b;
                        h5 h5Var3 = h5Var;
                        if (h5Var3 == null) {
                            i5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = i5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((oh.q) h5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        boolean z13 = cd.X;
        addView(textView, w7.b6.d(-2, 32.0f, z13 ? 5 : 3, z13 ? 0.0f : 73.0f, 62.0f, z13 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L * 2);
        TextView textView2 = new TextView(getContext());
        int L2 = org.telegram.messenger.i0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false), -16777216));
        textView2.setGravity((cd.X ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L, 0, L, 0);
        textView2.setText(cd.L0(2131751370, null));
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.g5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i5 i5Var = this.b;
                        h5 h5Var2 = h5Var;
                        if (h5Var2 == null) {
                            i5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = i5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((oh.q) h5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        i5 i5Var2 = this.b;
                        h5 h5Var3 = h5Var;
                        if (h5Var3 == null) {
                            i5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = i5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((oh.q) h5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.i0.L(32.0f), cd.X ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.i0.L(62.0f);
        layoutParams.leftMargin = cd.X ? 0 : (int) (org.telegram.messenger.i0.L(79.0f) + measureText);
        layoutParams.rightMargin = cd.X ? (int) (measureText + org.telegram.messenger.i0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.g9 getAvatarImageView() {
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
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(107.0f), TLObject.FLAG_30));
    }
}
