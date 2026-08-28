package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g5 extends FrameLayout {
    public final org.telegram.ui.Components.z8 a;
    public final org.telegram.ui.Components.o9 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public g5(Context context, final f5 f5Var, boolean z10) {
        super(context);
        this.a = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
        this.b = o9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.c = h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
        this.d = h5Var2;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(o9Var, g7.e6.d(46, 46.0f, LocaleController.isRTL ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        final int i9 = 1;
        h5Var.setMaxLines(1);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTextSize(17);
        h5Var.setTypeface(AndroidUtilities.bold());
        boolean z11 = LocaleController.isRTL;
        addView(h5Var, g7.e6.d(-1, -2.0f, 48, z11 ? 12.0f : 74.0f, 12.0f, z11 ? 74.0f : 12.0f, 0.0f));
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setMaxLines(1);
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false));
        h5Var2.setTextSize(14);
        boolean z12 = LocaleController.isRTL;
        addView(h5Var2, g7.e6.d(-1, -2.0f, 48, z12 ? 12.0f : 74.0f, 36.0f, z12 ? 74.0f : 12.0f, 0.0f));
        int dp = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{16.0f}, org.telegram.ui.ActionBar.f6.Oh));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(dp, 0, dp, 0);
        textView.setText(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup));
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.e5
            public final /* synthetic */ g5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g5 g5Var = this.b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 == null) {
                            g5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((eh.x) f5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        g5 g5Var2 = this.b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 == null) {
                            g5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((eh.x) f5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        boolean z13 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-2, 32.0f, z13 ? 5 : 3, z13 ? 0.0f : 73.0f, 62.0f, z13 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (dp * 2);
        TextView textView2 = new TextView(getContext());
        int dp2 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), -16777216));
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(dp, 0, dp, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n6, false));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.e5
            public final /* synthetic */ g5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        g5 g5Var = this.b;
                        f5 f5Var2 = f5Var;
                        if (f5Var2 == null) {
                            g5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = g5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((eh.x) f5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        g5 g5Var2 = this.b;
                        f5 f5Var3 = f5Var;
                        if (f5Var3 == null) {
                            g5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = g5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((eh.x) f5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, AndroidUtilities.dp(32.0f), LocaleController.isRTL ? 5 : 3);
        layoutParams.topMargin = AndroidUtilities.dp(62.0f);
        layoutParams.leftMargin = LocaleController.isRTL ? 0 : (int) (AndroidUtilities.dp(79.0f) + measureText);
        layoutParams.rightMargin = LocaleController.isRTL ? (int) (measureText + AndroidUtilities.dp(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public org.telegram.ui.Components.o9 getAvatarImageView() {
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), TLObject.FLAG_30));
    }
}
