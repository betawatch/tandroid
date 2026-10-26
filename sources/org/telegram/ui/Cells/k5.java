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
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k5 extends FrameLayout {
    public final org.telegram.ui.Components.j9 a;
    public final org.telegram.ui.Components.y9 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final org.telegram.ui.ActionBar.b6 d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public k5(Context context, final j5 j5Var, boolean z10) {
        super(context);
        this.a = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
        this.b = y9Var;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
        this.c = b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(getContext());
        this.d = b6Var2;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, gb1.h(46, 46.0f, LocaleController.isRTL ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        final int i10 = 1;
        b6Var.setMaxLines(1);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(17);
        b6Var.setTypeface(AndroidUtilities.bold());
        boolean z11 = LocaleController.isRTL;
        addView(b6Var, gb1.h(-1, -2.0f, 48, z11 ? 12.0f : 74.0f, 12.0f, z11 ? 74.0f : 12.0f, 0.0f));
        b6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        b6Var2.setMaxLines(1);
        org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.y6, null);
        b6Var2.setTextSize(14);
        boolean z12 = LocaleController.isRTL;
        addView(b6Var2, gb1.h(-1, -2.0f, 48, z12 ? 12.0f : 74.0f, 36.0f, z12 ? 74.0f : 12.0f, 0.0f));
        int dp = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{16.0f}, org.telegram.ui.ActionBar.y6.Oh));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(dp, 0, dp, 0);
        textView.setText(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.i5
            public final /* synthetic */ k5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k5 k5Var = this.b;
                        j5 j5Var2 = j5Var;
                        if (j5Var2 == null) {
                            k5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = k5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((yh.k) j5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        k5 k5Var2 = this.b;
                        j5 j5Var3 = j5Var;
                        if (j5Var3 == null) {
                            k5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = k5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((yh.k) j5Var3).d(tL_chatInviteImporter2, false);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        boolean z13 = LocaleController.isRTL;
        addView(textView, gb1.h(-2, 32.0f, z13 ? 5 : 3, z13 ? 0.0f : 73.0f, 62.0f, z13 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (dp * 2);
        TextView textView2 = new TextView(getContext());
        int dp2 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false), -16777216));
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(dp, 0, dp, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.i5
            public final /* synthetic */ k5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k5 k5Var = this.b;
                        j5 j5Var2 = j5Var;
                        if (j5Var2 == null) {
                            k5Var.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = k5Var.e;
                            if (tL_chatInviteImporter != null) {
                                ((yh.k) j5Var2).d(tL_chatInviteImporter, true);
                                break;
                            }
                        }
                        break;
                    default:
                        k5 k5Var2 = this.b;
                        j5 j5Var3 = j5Var;
                        if (j5Var3 == null) {
                            k5Var2.getClass();
                            break;
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = k5Var2.e;
                            if (tL_chatInviteImporter2 != null) {
                                ((yh.k) j5Var3).d(tL_chatInviteImporter2, false);
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

    public org.telegram.ui.Components.y9 getAvatarImageView() {
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), TLObject.FLAG_30));
    }
}
