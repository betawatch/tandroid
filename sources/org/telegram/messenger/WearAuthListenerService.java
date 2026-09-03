package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eu;
import org.telegram.ui.ib0;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class WearAuthListenerService extends l8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        str.getClass();
        if (!str.equals(PATH_OFFER)) {
            if (!str.equals(PATH_CANCEL)) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = zi1.a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            zi1.d = null;
            org.telegram.ui.ActionBar.g3 g3Var = zi1.c;
            if (g3Var != null) {
                g3Var.dismiss();
                zi1.c = null;
                return;
            }
            return;
        }
        StringBuilder t6 = android.support.v4.media.a.t("wear-auth: offer from ", str2, " (");
        t6.append(bArr.length);
        t6.append(" bytes)");
        FileLog.d(t6.toString());
        BigInteger bigInteger2 = zi1.a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        c5.j jVar = zi1.d;
        if (jVar != null && Arrays.equals((byte[]) jVar.a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + zi1.d(copyOfRange) + " from " + str2);
        c5.j jVar2 = new c5.j();
        jVar2.a = copyOfRange;
        jVar2.b = copyOfRange2;
        jVar2.c = str2;
        zi1.d = jVar2;
        Context context = LaunchActivity.D1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.g3 g3Var2 = zi1.c;
        if (g3Var2 != null) {
            g3Var2.dismiss();
            zi1.c = null;
        }
        org.telegram.ui.ActionBar.g3 o10 = y3.o(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        o10.customView = frameLayout;
        int i10 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i11 = 0; i11 < 4; i11++) {
            if (UserConfig.getInstance(i11).isClientActivated()) {
                if (!ConnectionsManager.getInstance(i11).isTestBackend()) {
                    i10 = i11;
                }
                arrayList.add(Integer.valueOf(i11));
            }
        }
        Collections.sort(arrayList, new eu(13));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, resourceProvider)));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        p9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        z8Var.r(currentUser);
        p9Var.e(currentUser, z8Var);
        frameLayout3.addView(p9Var, k7.b6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, k7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, k7.b6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, k7.b6.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        k7.d6.a(frameLayout2);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout f10 = y3.f(context, 1);
        frameLayout.addView(f10, k7.b6.e(-1, -1, 119));
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        f10.addView(p9Var2, k7.b6.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i10).setPlaceholderImage(p9Var2, "Utya3D", "😎", "130_130");
        int i12 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = k7.f6.b(context, 20.0f, i12, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthTitle));
        f10.addView(b10, k7.b6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView b11 = k7.f6.b(context, 14.0f, i12, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.WearAuthText));
        f10.addView(b11, k7.b6.t(-1, -2, 49, 32, 0, 32, 24));
        ph.d p10 = y3.p(24, context, resourceProvider, true);
        p10.setText(LocaleController.getString(R.string.Next));
        f10.addView(p10, k7.b6.t(-1, 48, 7, 12, 12, 12, 8));
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        o10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i13, resourceProvider));
        o10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i13, resourceProvider));
        frameLayout2.setOnClickListener(new gg.e(o10, frameLayout3, arrayList, iArr, z8Var, p9Var, 5));
        p10.setOnClickListener(new ib0(26, p10, iArr));
        zi1.c = o10;
        o10.show();
    }

    @Override // l8.k
    public void onMessageReceived(l8.g gVar) {
        m8.l0 l0Var = (m8.l0) gVar;
        String str = l0Var.b;
        String str2 = l0Var.d;
        byte[] bArr = l0Var.c;
        if (PATH_OFFER.equals(str)) {
            try {
                Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new d9(str, str2, bArr, 29));
    }
}
