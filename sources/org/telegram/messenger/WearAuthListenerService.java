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
import org.telegram.ui.Components.lp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.u70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class WearAuthListenerService extends i8.k {
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
            BigInteger bigInteger = ci1.a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            ci1.d = null;
            org.telegram.ui.ActionBar.e3 e3Var = ci1.c;
            if (e3Var != null) {
                e3Var.dismiss();
                ci1.c = null;
                return;
            }
            return;
        }
        StringBuilder r10 = a9.p.r("wear-auth: offer from ", str2, " (");
        r10.append(bArr.length);
        r10.append(" bytes)");
        FileLog.d(r10.toString());
        BigInteger bigInteger2 = ci1.a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        int i10 = 16;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        af.h hVar = ci1.d;
        if (hVar != null && Arrays.equals((byte[]) hVar.a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + ci1.d(copyOfRange) + " from " + str2);
        af.h hVar2 = new af.h();
        hVar2.a = copyOfRange;
        hVar2.b = copyOfRange2;
        hVar2.c = str2;
        ci1.d = hVar2;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.c6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.e3 e3Var2 = ci1.c;
        if (e3Var2 != null) {
            e3Var2.dismiss();
            ci1.c = null;
        }
        org.telegram.ui.ActionBar.e3 o10 = y1.o(context, resourceProvider, false, false);
        FrameLayout frameLayout = new FrameLayout(context);
        o10.customView = frameLayout;
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
        Collections.sort(arrayList, new lp0(i10));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, resourceProvider)));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        n9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        y8Var.r(currentUser);
        n9Var.e(currentUser, y8Var);
        frameLayout3.addView(n9Var, h7.z5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r5, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, h7.z5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, h7.z5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, h7.z5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        h7.b6.a(frameLayout2);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout g10 = y1.g(context, 1);
        frameLayout.addView(g10, h7.z5.e(-1, -1, 119));
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        g10.addView(n9Var2, h7.z5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i11).setPlaceholderImage(n9Var2, "Utya3D", "😎", "130_130");
        int i13 = org.telegram.ui.ActionBar.g6.j5;
        TextView b10 = h7.d6.b(context, 20.0f, i13, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthTitle));
        g10.addView(b10, h7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView b11 = h7.d6.b(context, 14.0f, i13, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.WearAuthText));
        g10.addView(b11, h7.z5.t(-1, -2, 49, 32, 0, 32, 24));
        lh.d g11 = rl.g(24, context, resourceProvider, true);
        g11.setText(LocaleController.getString(R.string.Next));
        g10.addView(g11, h7.z5.t(-1, 48, 7, 12, 12, 12, 8));
        int i14 = org.telegram.ui.ActionBar.g6.a7;
        o10.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
        o10.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i14, resourceProvider));
        frameLayout2.setOnClickListener(new cg.f(o10, frameLayout3, arrayList, iArr, y8Var, n9Var, 5));
        g11.setOnClickListener(new u70(29, g11, iArr));
        ci1.c = o10;
        o10.show();
    }

    @Override // i8.k
    public void onMessageReceived(i8.g gVar) {
        j8.l0 l0Var = (j8.l0) gVar;
        String str = l0Var.b;
        String str2 = l0Var.d;
        byte[] bArr = l0Var.c;
        if (PATH_OFFER.equals(str)) {
            try {
                Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e9) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e9);
            }
        }
        AndroidUtilities.runOnUIThread(new a9(str, str2, bArr));
    }
}
