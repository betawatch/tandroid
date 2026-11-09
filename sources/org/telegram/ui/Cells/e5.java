package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout {
    public final org.telegram.ui.Components.w8 a;
    public final org.telegram.ui.Components.l9 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final org.telegram.ui.ActionBar.l5 d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public e5(Context context, final d5 d5Var, boolean z9) {
        super(context);
        this.a = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
        this.b = l9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.c = l5Var;
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
        this.d = l5Var2;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(l9Var, c8.ha.d(46, 46.0f, id.a0 ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        l5Var.setGravity(id.a0 ? 5 : 3);
        final int i7 = 1;
        l5Var.setMaxLines(1);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, null);
        l5Var.setTextSize(17);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        boolean z10 = id.a0;
        addView(l5Var, c8.ha.d(-1, -2.0f, 48, z10 ? 12.0f : 74.0f, 12.0f, z10 ? 74.0f : 12.0f, 0.0f));
        l5Var2.setGravity(id.a0 ? 5 : 3);
        l5Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.y6, null);
        l5Var2.setTextSize(14);
        boolean z11 = id.a0;
        addView(l5Var2, c8.ha.d(-1, -2.0f, 48, z11 ? 12.0f : 74.0f, 36.0f, z11 ? 74.0f : 12.0f, 0.0f));
        int L = org.telegram.messenger.g0.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 16.0f));
        textView.setGravity((id.a0 ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(L, 0, L, 0);
        textView.setText(id.M0(z9 ? 2131754378 : 2131754373, null));
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
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
                                ((yh.m) d5Var2).d(tL_chatInviteImporter, true);
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
                                ((yh.m) d5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        boolean z12 = id.a0;
        addView(textView, c8.ha.d(-2, 32.0f, z12 ? 5 : 3, z12 ? 0.0f : 73.0f, 62.0f, z12 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L * 2);
        TextView textView2 = new TextView(getContext());
        int L2 = org.telegram.messenger.g0.L(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, 0, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i6, false), -16777216));
        textView2.setGravity((id.a0 ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L, 0, L, 0);
        textView2.setText(id.M0(2131751369, null));
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.c5
            public final /* synthetic */ e5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        e5 e5Var = this.b;
                        d5 d5Var2 = d5Var;
                        if (d5Var2 == null) {
                            e5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = e5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((yh.m) d5Var2).d(tL_chatInviteImporter, true);
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
                                ((yh.m) d5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, org.telegram.messenger.g0.L(32.0f), id.a0 ? 5 : 3);
        layoutParams.topMargin = org.telegram.messenger.g0.L(62.0f);
        layoutParams.leftMargin = id.a0 ? 0 : (int) (org.telegram.messenger.g0.L(79.0f) + measureText);
        layoutParams.rightMargin = id.a0 ? (int) (measureText + org.telegram.messenger.g0.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.l9 getAvatarImageView() {
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
            canvas.drawLine(id.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(107.0f), TLObject.FLAG_30));
    }
}
