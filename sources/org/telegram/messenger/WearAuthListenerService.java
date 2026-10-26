package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bv;
import org.telegram.ui.hi1;
import org.telegram.ui.ii1;
import org.telegram.ui.xd0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class WearAuthListenerService extends y8.k {
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
            BigInteger bigInteger = ii1.a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            ii1.d = null;
            org.telegram.ui.ActionBar.k3 k3Var = ii1.c;
            if (k3Var != null) {
                k3Var.dismiss();
                ii1.c = null;
                return;
            }
            return;
        }
        StringBuilder v = a1.g.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = ii1.a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        a8.me meVar = ii1.d;
        if (meVar != null && Arrays.equals((byte[]) meVar.a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + ii1.d(copyOfRange) + " from " + str2);
        a8.me meVar2 = new a8.me();
        meVar2.a = copyOfRange;
        meVar2.b = copyOfRange2;
        meVar2.c = str2;
        ii1.d = meVar2;
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.u6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.k3 k3Var2 = ii1.c;
        if (k3Var2 != null) {
            k3Var2.dismiss();
            ii1.c = null;
        }
        org.telegram.ui.ActionBar.k3 i10 = vh.i(1, context, resourceProvider, false);
        hi1 hi1Var = new hi1(context);
        i10.customView = hi1Var;
        int i11 = UserConfig.selectedAccount;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i12 = 0; i12 < 4; i12++) {
            if (UserConfig.getInstance(i12).isClientActivated()) {
                if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                    i11 = i12;
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        Collections.sort(arrayList, new bv(15));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = i11;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int i14 = org.telegram.ui.ActionBar.y6.i5;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i14, resourceProvider));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        frameLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, c02, N, null, resourceProvider);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        j9Var.r(currentUser);
        y9Var.f(currentUser, j9Var);
        frameLayout2.addView(y9Var, gb1.i(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout2.addView(imageView, gb1.h(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout.addView(frameLayout2, gb1.i(52, 28, 17));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        hi1Var.addView(frameLayout, gb1.t(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        gb1.b(frameLayout);
        if (arrayList.size() <= 1) {
            frameLayout.setVisibility(8);
        }
        LinearLayout d = vh.d(context, 1);
        hi1Var.addView(d, gb1.i(-1, -1, 119));
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        d.addView(y9Var2, gb1.v(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i13).setPlaceholderImage(y9Var2, "Utya3D", "😎", "130_130");
        int i15 = org.telegram.ui.ActionBar.y6.j5;
        TextView L = gb1.L(context, 20.0f, i15, true, resourceProvider);
        L.setGravity(17);
        L.setText(LocaleController.getString(R.string.WearAuthTitle));
        d.addView(L, gb1.v(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView L2 = gb1.L(context, 14.0f, i15, false, null);
        L2.setGravity(17);
        L2.setText(LocaleController.getString(R.string.WearAuthText));
        d.addView(L2, gb1.x(-1, -2, 49, 32, 0, 32, 24));
        fi.d f7 = vh.f(24, context, resourceProvider, true);
        f7.setText(LocaleController.getString(R.string.Next));
        d.addView(f7, gb1.x(-1, 48, 7, 12, 12, 12, 8));
        int i16 = org.telegram.ui.ActionBar.y6.a7;
        i10.setBackgroundColorKey(i16);
        i10.fixNavigationBarKey(i16);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.m0(i10, frameLayout2, arrayList, iArr, j9Var, y9Var, 4));
        f7.setOnClickListener(new xd0(29, f7, iArr));
        ii1.c = i10;
        i10.show();
    }

    @Override // y8.k
    public void onMessageReceived(y8.g gVar) {
        z8.l0 l0Var = (z8.l0) gVar;
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
        AndroidUtilities.runOnUIThread(new dl(str, str2, bArr, 2));
    }
}
