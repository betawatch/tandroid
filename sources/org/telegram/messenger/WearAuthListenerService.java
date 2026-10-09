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
import org.telegram.ui.mb1;
import org.telegram.ui.nj1;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class WearAuthListenerService extends x8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        int i10;
        str.getClass();
        if (!str.equals(PATH_OFFER)) {
            if (!str.equals(PATH_CANCEL)) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = nj1.a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            nj1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = nj1.c;
            if (f3Var != null) {
                f3Var.dismiss();
                nj1.c = null;
                return;
            }
            return;
        }
        StringBuilder w10 = a1.g.w("wear-auth: offer from ", str2, " (");
        w10.append(bArr.length);
        w10.append(" bytes)");
        FileLog.d(w10.toString());
        BigInteger bigInteger2 = nj1.a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        ci.u5 u5Var = nj1.d;
        if (u5Var != null && Arrays.equals((byte[]) u5Var.a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + nj1.d(copyOfRange) + " from " + str2);
        ci.u5 u5Var2 = new ci.u5();
        u5Var2.a = copyOfRange;
        u5Var2.b = copyOfRange2;
        u5Var2.c = str2;
        nj1.d = u5Var2;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.e6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.f3 f3Var2 = nj1.c;
        if (f3Var2 != null) {
            f3Var2.dismiss();
            nj1.c = null;
        }
        org.telegram.ui.ActionBar.f3 i11 = bi.i(1, context, resourceProvider, false);
        FrameLayout frameLayout = new FrameLayout(context);
        i11.customView = frameLayout;
        int i12 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        int i13 = 0;
        while (true) {
            i10 = 4;
            if (i13 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i13).isClientActivated()) {
                if (!ConnectionsManager.getInstance(i13).isTestBackend()) {
                    i12 = i13;
                }
                arrayList.add(Integer.valueOf(i13));
            }
            i13++;
        }
        Collections.sort(arrayList, new mb1(i10));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i14 = i12;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i5, resourceProvider)));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        j9Var.r(currentUser);
        y9Var.e(currentUser, j9Var);
        frameLayout3.addView(y9Var, w7.x5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.r5, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.x5.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
        int i15 = 17;
        frameLayout2.addView(frameLayout3, w7.x5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, w7.x5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        w7.z5.a(frameLayout2);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout e7 = bi.e(context, 1);
        frameLayout.addView(e7, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        e7.addView(y9Var2, w7.x5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i14).setPlaceholderImage(y9Var2, "Utya3D", "😎", "130_130");
        int i16 = org.telegram.ui.ActionBar.i6.j5;
        TextView b10 = w7.b6.b(context, 20.0f, i16, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthTitle));
        e7.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView b11 = w7.b6.b(context, 14.0f, i16, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.WearAuthText));
        e7.addView(b11, w7.x5.t(-1, -2, 49, 32, 0, 32, 24));
        ci.d f7 = bi.f(24, context, resourceProvider, true);
        f7.setText(LocaleController.getString(R.string.Next));
        e7.addView(f7, w7.x5.t(-1, 48, 7, 12, 12, 12, 8));
        int i17 = org.telegram.ui.ActionBar.i6.a7;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i17, resourceProvider));
        i11.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i17, resourceProvider));
        frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(i11, frameLayout3, arrayList, iArr, j9Var, y9Var, 4));
        f7.setOnClickListener(new vy0(i15, f7, iArr));
        nj1.c = i11;
        i11.show();
    }

    @Override // x8.k
    public void onMessageReceived(x8.g gVar) {
        y8.k0 k0Var = (y8.k0) gVar;
        String str = k0Var.b;
        String str2 = k0Var.d;
        byte[] bArr = k0Var.c;
        if (PATH_OFFER.equals(str)) {
            try {
                Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e7) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e7);
            }
        }
        AndroidUtilities.runOnUIThread(new ul(str, str2, bArr, 1));
    }
}
