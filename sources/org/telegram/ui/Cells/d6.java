package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.t80;
import org.telegram.ui.mz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class d6 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 a;
    public final TextView b;
    public final rp c;
    public final p2 d;
    public boolean e;
    public final org.telegram.ui.Components.y5 f;
    public final t80 h;
    public boolean n;

    public d6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        er erVar = er.h;
        this.f = new org.telegram.ui.Components.y5(320L, erVar);
        this.n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
        addView(g10, h7.z5.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        rl.h(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        g10.addView(textView, h7.z5.q(-2, -2, 51));
        rp rpVar = new rp(context);
        this.c = rpVar;
        rpVar.getDrawable().o(true, true, false);
        rpVar.b(0.3f, 165L, erVar);
        rpVar.setTypeface(AndroidUtilities.bold());
        rpVar.setTextSize(AndroidUtilities.dp(11.0f));
        rpVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        rpVar.setGravity(3);
        g10.addView(rpVar, h7.z5.t(-1, 17, 51, 4, 1, 4, 0));
        p2 p2Var = new p2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setDialogCellDelegate(new a6((mz0) this, n2Var, context));
        p2Var.D = 15;
        p2Var.E = 83;
        addView(p2Var, h7.z5.e(-1, -2, 87));
        d();
        setWillNotDraw(false);
        t80 t80Var = new t80();
        this.h = t80Var;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        t80Var.e(org.telegram.ui.ActionBar.g6.l1(1.25f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)), org.telegram.ui.ActionBar.g6.l1(0.8f, org.telegram.ui.ActionBar.g6.v0(i10, resourceProvider)));
        t80Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        rp rpVar = this.c;
        rpVar.a();
        rpVar.setPivotX(0.0f);
        if (z10) {
            rpVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(er.h).start();
        } else {
            rpVar.setAlpha(z11 ? 1.0f : 0.0f);
            rpVar.setScaleX(z11 ? 1.0f : 0.0f);
            rpVar.setScaleY(z11 ? 1.0f : 0.0f);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                int i10 = chat.participants_count;
                iArr[0] = i10;
                formatShortNumber = String.valueOf(i10);
            } else {
                formatShortNumber = LocaleController.formatShortNumber(chat.participants_count, iArr);
            }
            rpVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            p2 p2Var = this.d;
            if (z12) {
                p2Var.W(-chat.id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                long j10 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (p2Var.D0 != j10) {
                    p2Var.p4 = -1;
                }
                p2Var.D0 = j10;
                p2Var.t4 = System.currentTimeMillis();
                p2Var.b1 = messageObject;
                p2Var.q2 = false;
                p2Var.J0 = false;
                p2Var.N0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                p2Var.O0 = 0;
                p2Var.P0 = false;
                p2Var.h1 = messageObject.getId();
                p2Var.Q0 = 0;
                p2Var.R0 = 0;
                p2Var.S0 = 0;
                p2Var.T0 = messageObject.isUnread();
                p2Var.c1 = arrayList;
                MessageObject messageObject2 = p2Var.b1;
                if (messageObject2 != null) {
                    p2Var.U0 = messageObject2.messageOwner.send_state;
                }
                p2Var.b0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.a);
        rp rpVar = this.c;
        rpVar.setTextColor(v02);
        rpVar.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.l1(0.1f, v02)));
        this.b.setTextColor(v02);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e9 = this.f.e(this.e);
        if (e9 > 0.0f) {
            t80 t80Var = this.h;
            t80Var.setAlpha((int) (e9 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.d;
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(46.33f));
            t80Var.d(rectF);
            t80Var.draw(canvas);
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + p2Var.getX() + AndroidUtilities.dp(p2Var.E + 6), p2Var.getY() + AndroidUtilities.dp(64.33f));
            t80Var.d(rectF);
            t80Var.draw(canvas);
            rectF.set(((p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), p2Var.getY() + AndroidUtilities.dp(12.0f), (p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f), p2Var.getY() + AndroidUtilities.dp(20.33f));
            t80Var.d(rectF);
            t80Var.draw(canvas);
            invalidate();
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
