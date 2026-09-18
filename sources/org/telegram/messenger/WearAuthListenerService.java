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
import org.telegram.ui.jj1;
import org.telegram.ui.kb1;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class WearAuthListenerService extends x8.k {
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
            BigInteger bigInteger = jj1.a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            jj1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = jj1.c;
            if (f3Var != null) {
                f3Var.dismiss();
                jj1.c = null;
                return;
            }
            return;
        }
        StringBuilder v = a4.a.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = jj1.a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        cf.c cVar = jj1.d;
        if (cVar != null && Arrays.equals((byte[]) cVar.b, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + jj1.d(copyOfRange) + " from " + str2);
        cf.c cVar2 = new cf.c();
        cVar2.b = copyOfRange;
        cVar2.c = copyOfRange2;
        cVar2.d = str2;
        jj1.d = cVar2;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.e6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.f3 f3Var2 = jj1.c;
        if (f3Var2 != null) {
            f3Var2.dismiss();
            jj1.c = null;
        }
        org.telegram.ui.ActionBar.f3 i10 = wh.i(1, context, resourceProvider, false);
        FrameLayout frameLayout = new FrameLayout(context);
        i10.customView = frameLayout;
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
        Collections.sort(arrayList, new kb1(2));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i13 = i11;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, resourceProvider)));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        h9Var.r(currentUser);
        w9Var.e(currentUser, h9Var);
        frameLayout3.addView(w9Var, w7.y5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.y5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.y5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, w7.y5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        w7.a6.a(frameLayout2);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout e = wh.e(context, 1);
        frameLayout.addView(e, w7.y5.e(-1, -1, 119));
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        e.addView(w9Var2, w7.y5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i13).setPlaceholderImage(w9Var2, "Utya3D", "😎", "130_130");
        int i14 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = w7.c6.b(context, 20.0f, i14, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthTitle));
        e.addView(b10, w7.y5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView b11 = w7.c6.b(context, 14.0f, i14, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.WearAuthText));
        e.addView(b11, w7.y5.t(-1, -2, 49, 32, 0, 32, 24));
        ci.d f7 = wh.f(24, context, resourceProvider, true);
        f7.setText(LocaleController.getString(R.string.Next));
        e.addView(f7, w7.y5.t(-1, 48, 7, 12, 12, 12, 8));
        int i15 = org.telegram.ui.ActionBar.j6.a7;
        i10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
        i10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i15, resourceProvider));
        frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(i10, frameLayout3, arrayList, iArr, h9Var, w9Var, 4));
        f7.setOnClickListener(new vy0(11, f7, iArr));
        jj1.c = i10;
        i10.show();
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
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new z8(str, str2, bArr, 29));
    }
}
