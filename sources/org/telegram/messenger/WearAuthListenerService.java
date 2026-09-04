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
import org.telegram.ui.f11;
import org.telegram.ui.lj1;
import org.telegram.ui.wy0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
            BigInteger bigInteger = lj1.a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            lj1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = lj1.c;
            if (f3Var != null) {
                f3Var.dismiss();
                lj1.c = null;
                return;
            }
            return;
        }
        StringBuilder v = a4.a.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = lj1.a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        cf.c cVar = lj1.d;
        if (cVar != null && Arrays.equals((byte[]) cVar.b, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + lj1.d(copyOfRange) + " from " + str2);
        cf.c cVar2 = new cf.c();
        cVar2.b = copyOfRange;
        cVar2.c = copyOfRange2;
        cVar2.d = str2;
        lj1.d = cVar2;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        org.telegram.ui.ActionBar.f6 resourceProvider = U != null ? U.getResourceProvider() : null;
        org.telegram.ui.ActionBar.f3 f3Var2 = lj1.c;
        if (f3Var2 != null) {
            f3Var2.dismiss();
            lj1.c = null;
        }
        org.telegram.ui.ActionBar.f3 i11 = wl.i(1, context, resourceProvider, false);
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
        Collections.sort(arrayList, new f11(i10));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i14 = i12;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, resourceProvider)));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        x9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        x9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        i9Var.r(currentUser);
        x9Var.e(currentUser, i9Var);
        frameLayout3.addView(x9Var, w7.x5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.x5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.x5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, w7.x5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        w7.z5.a(frameLayout2);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout f7 = wl.f(context, 1);
        frameLayout.addView(f7, w7.x5.e(-1, -1, 119));
        org.telegram.ui.Components.x9 x9Var2 = new org.telegram.ui.Components.x9(context);
        f7.addView(x9Var2, w7.x5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i14).setPlaceholderImage(x9Var2, "Utya3D", "😎", "130_130");
        int i15 = org.telegram.ui.ActionBar.j6.j5;
        TextView b10 = w7.b6.b(context, 20.0f, i15, true, resourceProvider);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.WearAuthTitle));
        f7.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView b11 = w7.b6.b(context, 14.0f, i15, false, null);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.WearAuthText));
        f7.addView(b11, w7.x5.t(-1, -2, 49, 32, 0, 32, 24));
        di.d g10 = wl.g(24, context, resourceProvider, true);
        g10.setText(LocaleController.getString(R.string.Next));
        f7.addView(g10, w7.x5.t(-1, 48, 7, 12, 12, 12, 8));
        int i16 = org.telegram.ui.ActionBar.j6.a7;
        i11.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i16, resourceProvider));
        i11.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i16, resourceProvider));
        frameLayout2.setOnClickListener(new org.telegram.ui.Components.n0(i11, frameLayout3, arrayList, iArr, i9Var, x9Var, 4));
        g10.setOnClickListener(new wy0(11, g10, iArr));
        lj1.c = i11;
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
        AndroidUtilities.runOnUIThread(new z8(str, str2, bArr, 29));
    }
}
