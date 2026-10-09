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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.tq;
import org.telegram.ui.p01;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class h6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final TextView b;
    public final tq c;
    public final s2 d;
    public boolean e;
    public final org.telegram.ui.Components.g6 f;
    public final ia0 h;
    public boolean n;

    public h6(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getContext());
        hs hsVar = hs.h;
        this.f = new org.telegram.ui.Components.g6(320L, hsVar);
        this.n = false;
        Context context = n2Var.getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = n2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout e7 = bi.e(context, 0);
        addView(e7, w7.x5.a(-2.0f, 16.66f, 11.6f, 16.66f, 0.0f, -1, 55));
        TextView textView = new TextView(context);
        this.b = textView;
        bi.k(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        e7.addView(textView, w7.x5.q(-2, -2, 51));
        tq tqVar = new tq(context);
        this.c = tqVar;
        tqVar.getDrawable().r(true, true);
        tqVar.b(0.3f, 165L, hsVar);
        tqVar.setTypeface(AndroidUtilities.bold());
        tqVar.setTextSize(AndroidUtilities.dp(11.0f));
        tqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        tqVar.setGravity(3);
        e7.addView(tqVar, w7.x5.t(-1, 17, 51, 4, 1, 4, 0));
        s2 s2Var = new s2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = s2Var;
        s2Var.setBackgroundColor(0);
        s2Var.setDialogCellDelegate(new e6((p01) this, n2Var, context));
        s2Var.H = 15;
        s2Var.I = 83;
        addView(s2Var, w7.x5.e(-1, -2, 87));
        e();
        setWillNotDraw(false);
        ia0 ia0Var = new ia0();
        this.h = ia0Var;
        int i10 = org.telegram.ui.ActionBar.i6.i6;
        ia0Var.f(org.telegram.ui.ActionBar.i6.m1(1.25f, org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.i6.m1(0.8f, org.telegram.ui.ActionBar.i6.w0(i10, resourceProvider)));
        ia0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        tq tqVar = this.c;
        tqVar.a();
        tqVar.setPivotX(0.0f);
        if (z10) {
            tqVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(hs.h).start();
        } else {
            tqVar.setAlpha(z11 ? 1.0f : 0.0f);
            tqVar.setScaleX(z11 ? 1.0f : 0.0f);
            tqVar.setScaleY(z11 ? 1.0f : 0.0f);
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
            tqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            s2 s2Var = this.d;
            if (z12) {
                s2Var.W(-chat.id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
                long j3 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (s2Var.H0 != j3) {
                    s2Var.x4 = -1;
                }
                s2Var.H0 = j3;
                s2Var.B4 = System.currentTimeMillis();
                s2Var.f1 = messageObject;
                s2Var.u2 = false;
                s2Var.N0 = false;
                s2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                s2Var.S0 = 0;
                s2Var.T0 = false;
                s2Var.l1 = messageObject.getId();
                s2Var.U0 = 0;
                s2Var.V0 = 0;
                s2Var.W0 = 0;
                s2Var.X0 = messageObject.isUnread();
                s2Var.g1 = arrayList;
                MessageObject messageObject2 = s2Var.f1;
                if (messageObject2 != null) {
                    s2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                s2Var.b0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e7 = this.f.e(this.e);
        if (e7 > 0.0f) {
            ia0 ia0Var = this.h;
            ia0Var.setAlpha((int) (e7 * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            s2 s2Var = this.d;
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(46.33f));
            ia0Var.e(rectF);
            ia0Var.draw(canvas);
            rectF.set(s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + s2Var.getX() + AndroidUtilities.dp(s2Var.I + 6), s2Var.getY() + AndroidUtilities.dp(64.33f));
            ia0Var.e(rectF);
            ia0Var.draw(canvas);
            rectF.set(((s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), s2Var.getY() + AndroidUtilities.dp(12.0f), (s2Var.getX() + s2Var.getWidth()) - AndroidUtilities.dp(16.0f), s2Var.getY() + AndroidUtilities.dp(20.33f));
            ia0Var.e(rectF);
            ia0Var.draw(canvas);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L6, this.a);
        tq tqVar = this.c;
        tqVar.setTextColor(w02);
        tqVar.setBackground(org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.i6.m1(0.1f, w02)));
        this.b.setTextColor(w02);
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
