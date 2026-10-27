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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.pq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c01;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class l6 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final TextView b;
    public final pq c;
    public final p2 d;
    public boolean e;
    public final org.telegram.ui.Components.h6 f;
    public final ea0 h;
    public boolean n;

    public l6(org.telegram.ui.ActionBar.r2 r2Var) {
        super(r2Var.getContext());
        ds dsVar = ds.h;
        this.f = new org.telegram.ui.Components.h6(320L, dsVar);
        this.n = false;
        Context context = r2Var.getContext();
        org.telegram.ui.ActionBar.u6 resourceProvider = r2Var.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout d = wh.d(context, 0);
        addView(d, kb1.h(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        wh.j(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ProfileChannel));
        d.addView(textView, kb1.u(-2, -2, 51));
        pq pqVar = new pq(context);
        this.c = pqVar;
        pqVar.getDrawable().r(true, true);
        pqVar.b(0.3f, 165L, dsVar);
        pqVar.setTypeface(AndroidUtilities.bold());
        pqVar.setTextSize(AndroidUtilities.dp(11.0f));
        pqVar.setPadding(AndroidUtilities.dp(4.33f), 0, AndroidUtilities.dp(4.33f), 0);
        pqVar.setGravity(3);
        d.addView(pqVar, kb1.x(-1, 17, 51, 4, 1, 4, 0));
        p2 p2Var = new p2(null, context, true, UserConfig.selectedAccount, resourceProvider);
        this.d = p2Var;
        p2Var.setBackgroundColor(0);
        p2Var.setDialogCellDelegate(new i6((c01) this, r2Var, context));
        p2Var.H = 15;
        p2Var.I = 83;
        addView(p2Var, kb1.i(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        ea0 ea0Var = new ea0();
        this.h = ea0Var;
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        ea0Var.f(org.telegram.ui.ActionBar.y6.o1(1.25f, org.telegram.ui.ActionBar.y6.w0(i10, resourceProvider)), org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.w0(i10, resourceProvider)));
        ea0Var.k(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        String formatShortNumber;
        boolean z10 = this.n;
        boolean z11 = chat == null || chat.participants_count > 0;
        pq pqVar = this.c;
        pqVar.a();
        pqVar.setPivotX(0.0f);
        if (z10) {
            pqVar.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(ds.h).start();
        } else {
            pqVar.setAlpha(z11 ? 1.0f : 0.0f);
            pqVar.setScaleX(z11 ? 1.0f : 0.0f);
            pqVar.setScaleY(z11 ? 1.0f : 0.0f);
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
            pqVar.c(LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber), true, true);
            boolean z12 = arrayList == null || arrayList.isEmpty();
            this.e = z12;
            p2 p2Var = this.d;
            if (z12) {
                p2Var.V(-chat.id, null, 0, false, z10);
            } else {
                MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                long j10 = -chat.id;
                int i11 = messageObject.messageOwner.date;
                if (p2Var.H0 != j10) {
                    p2Var.x4 = -1;
                }
                p2Var.H0 = j10;
                p2Var.B4 = System.currentTimeMillis();
                p2Var.f1 = messageObject;
                p2Var.u2 = false;
                p2Var.N0 = false;
                p2Var.R0 = i11;
                int i12 = messageObject.messageOwner.edit_date;
                p2Var.S0 = 0;
                p2Var.T0 = false;
                p2Var.l1 = messageObject.getId();
                p2Var.U0 = 0;
                p2Var.V0 = 0;
                p2Var.W0 = 0;
                p2Var.X0 = messageObject.isUnread();
                p2Var.g1 = arrayList;
                MessageObject messageObject2 = p2Var.f1;
                if (messageObject2 != null) {
                    p2Var.Y0 = messageObject2.messageOwner.send_state;
                }
                p2Var.a0(0, z10);
            }
        }
        if (!z10) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.f.e(this.e);
        if (e > 0.0f) {
            ea0 ea0Var = this.h;
            ea0Var.setAlpha((int) (e * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.d;
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(38.0f), (getWidth() * 0.5f) + p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(46.33f));
            ea0Var.e(rectF);
            ea0Var.draw(canvas);
            rectF.set(p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(56.0f), (getWidth() * 0.36f) + p2Var.getX() + AndroidUtilities.dp(p2Var.I + 6), p2Var.getY() + AndroidUtilities.dp(64.33f));
            ea0Var.e(rectF);
            ea0Var.draw(canvas);
            rectF.set(((p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(43.0f), p2Var.getY() + AndroidUtilities.dp(12.0f), (p2Var.getX() + p2Var.getWidth()) - AndroidUtilities.dp(16.0f), p2Var.getY() + AndroidUtilities.dp(20.33f));
            ea0Var.e(rectF);
            ea0Var.draw(canvas);
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L6, this.a);
        int i10 = ProfileActivity.R6;
        pq pqVar = this.c;
        pqVar.setTextColor(w02);
        pqVar.setBackground(org.telegram.ui.ActionBar.y6.d0(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.y6.o1(0.1f, w02)));
        this.b.setTextColor(w02);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
