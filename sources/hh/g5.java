package hh;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g5 extends org.telegram.ui.Components.ka {
    public final ArrayList W;
    public final LimitPreviewView X;

    public g5(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        float f10;
        int i10;
        this.W = arrayList;
        float f11 = this.backgroundPaddingLeft / AndroidUtilities.density;
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.star, 0, c6Var, 0);
        this.X = limitPreviewView;
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        limitPreviewView.setIconScale(1.8f);
        float f12 = f11;
        this.T.addView(limitPreviewView, h7.z5.r(-1, -2, 17, f12, 20.0f, f12, 10.0f));
        P(j10);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = h7.d6.b(context, 20.0f, i11, true, null);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        setTitle(LocaleController.getString(R.string.Gift2UpgradeCostsTitle));
        this.T.addView(b10, h7.z5.t(-1, -2, 17, 32, 0, 32, 0));
        TextView b11 = h7.d6.b(context, 14.0f, i11, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.Gift2UpgradeCostsText));
        this.T.addView(b11, h7.z5.t(-1, -2, 17, 32, 10, 32, 10));
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        yy0 yy0Var = new yy0(context, c6Var);
        int i12 = 0;
        boolean z10 = false;
        while (i12 < arrayList.size()) {
            if (currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i12)).date || ((i10 = i12 + 1) < arrayList.size() && currentTime <= ((TL_stars.StarGiftUpgradePrice) arrayList.get(i10)).date)) {
                f10 = f12;
                Date date = new Date(r13.date * 1000);
                yy0Var.c(LocaleController.getInstance().getFormatterDay().format(date) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date), oa.X0(false, i0.a.m((int) r13.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                z10 = true;
            } else {
                f10 = f12;
            }
            i12++;
            f12 = f10;
        }
        float f13 = f12;
        if (!z10) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) obj;
                Date date2 = new Date(starGiftUpgradePrice.date * 1000);
                yy0Var.c(LocaleController.getInstance().getFormatterDay().format(date2) + ", " + LocaleController.getInstance().getFormatterDayMonth().format(date2), oa.X0(false, i0.a.m((int) starGiftUpgradePrice.upgrade_stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
            }
        }
        float f14 = f13 + 14.0f;
        this.T.addView(yy0Var, h7.z5.r(-1, -2, 7, f14, 16.0f, f14, 15.0f));
        TextView b12 = h7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.g6.y6, false, null);
        b12.setGravity(17);
        b12.setText(LocaleController.getString(R.string.Gift2UpgradeCostsFooter));
        this.T.addView(b12, h7.z5.t(-1, -2, 17, 32, 0, 32, 15));
        float f15 = this.backgroundPaddingLeft / AndroidUtilities.density;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.U = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, this.resourcesProvider));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.resourcesProvider));
        this.U.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        lh.d dVar = new lh.d(getContext(), this.resourcesProvider, true);
        this.V = dVar;
        float f16 = f15 + 16.0f;
        this.U.addView(dVar, h7.z5.d(-1, 48.0f, 119, f16, 16.0f, f16, 16.0f));
        this.containerView.addView(this.U, h7.z5.e(-1, -2, 87));
        zk0 zk0Var = this.d;
        zk0Var.setPadding(zk0Var.getPaddingLeft(), zk0Var.getPaddingTop(), zk0Var.getPaddingRight(), AndroidUtilities.dp(80.0f) + zk0Var.getPaddingBottom());
        this.V.g(i5.g2(LocaleController.getString(R.string.Understood)), false, true);
        this.V.setOnClickListener(new ag.w0(this, 17));
    }

    public final void P(long j10) {
        ArrayList arrayList = this.W;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) arrayList.get(0);
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) i0.a.i(1, arrayList);
        LimitPreviewView limitPreviewView = this.X;
        limitPreviewView.I = true;
        Paint paint = limitPreviewView.G;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = limitPreviewView.O;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        limitPreviewView.a = AndroidUtilities.ilerp(j10, starGiftUpgradePrice.upgrade_stars, starGiftUpgradePrice2.upgrade_stars);
        org.telegram.ui.Components.j6 j6Var = limitPreviewView.J;
        j6Var.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice.upgrade_stars));
        org.telegram.ui.Components.j6 j6Var2 = limitPreviewView.v;
        j6Var2.setText(LocaleController.formatPluralStringComma("Stars", (int) starGiftUpgradePrice2.upgrade_stars));
        ((FrameLayout.LayoutParams) j6Var2.getLayoutParams()).gravity = 5;
        limitPreviewView.setType(17);
        limitPreviewView.w.setVisibility(8);
        limitPreviewView.K.setVisibility(8);
        j6Var2.setTextColor(limitPreviewView.H ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        j6Var.setTextColor(-1);
        limitPreviewView.g((int) j10, false);
        limitPreviewView.L = true;
        limitPreviewView.M = true;
        limitPreviewView.N = true;
    }
}
