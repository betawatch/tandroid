package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk0;
import org.telegram.ui.wn0;
import org.telegram.ui.xc1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uz(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((vz) this.b).q((String) this.c, (Bundle) this.d);
                break;
            case 1:
                f10 f10Var = (f10) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                d10 d10Var = (d10) this.d;
                storyItem.detectedLng = "und";
                f10Var.getMessagesController().P1().k.h(storyItem.dialogId, storyItem);
                f10Var.I.remove(d10Var);
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                c20[] c20VarArr = (c20[]) this.c;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == c20VarArr.length && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                String str = (String) this.c;
                String str2 = (String) this.b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.r;
                str.getClass();
                if (str.equals("/tg-wear-auth/offer")) {
                    StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                    u10.append(bArr.length);
                    u10.append(" bytes)");
                    a8.b(u10.toString());
                    BigInteger bigInteger = yc1.a;
                    if (bArr.length != 272) {
                        a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                        break;
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                        a8.r7 r7Var = yc1.d;
                        if (r7Var != null && Arrays.equals((byte[]) r7Var.b, copyOfRange)) {
                            a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                            break;
                        } else {
                            a8.b("wear-auth: new session " + yc1.d(copyOfRange) + " from " + str2);
                            yc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                            Context context = LaunchActivity.G1;
                            if (context == null) {
                                context = t0.b;
                            }
                            if (context != null) {
                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.g6 resourceProvider = T != null ? T.getResourceProvider() : null;
                                org.telegram.ui.ActionBar.v2 v2Var = yc1.c;
                                if (v2Var != null) {
                                    v2Var.dismiss();
                                    yc1.c = null;
                                }
                                org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context, resourceProvider, false);
                                xc1 xc1Var = new xc1(context);
                                l10.N = xc1Var;
                                int i11 = p10.s0;
                                ArrayList arrayList = new ArrayList();
                                arrayList.clear();
                                for (int i12 = 0; i12 < 4; i12++) {
                                    if (p10.i(i12).p()) {
                                        if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                            i11 = i12;
                                        }
                                        arrayList.add(Integer.valueOf(i12));
                                    }
                                }
                                Collections.sort(arrayList, new wn0(8));
                                if (!arrayList.isEmpty()) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    int L = g0.L(14.0f);
                                    int i13 = org.telegram.ui.ActionBar.l6.i5;
                                    Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i13, resourceProvider));
                                    org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
                                    frameLayout2.setBackground(d02);
                                    org.telegram.ui.ActionBar.s6.j(frameLayout2, d02, M, null, resourceProvider);
                                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                                    l9Var.setRoundRadius(g0.L(14.0f));
                                    l9Var.getImageReceiver().A0 = true;
                                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                                    int[] iArr2 = {p10.s0};
                                    TLRPC.User f10 = p10.i(iArr2[0]).f();
                                    w8Var.r(f10);
                                    l9Var.e(f10, w8Var);
                                    frameLayout2.addView(l9Var, c8.ha.e(28, 28, qs.A1));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
                                    imageView.setImageResource(R.drawable.arrows_select);
                                    frameLayout2.addView(imageView, c8.ha.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                                    frameLayout.addView(frameLayout2, c8.ha.e(52, 28, 17));
                                    frameLayout.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                                    xc1Var.addView(frameLayout, c8.ha.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                                    c8.ka.a(frameLayout);
                                    if (arrayList.size() <= 1) {
                                        frameLayout.setVisibility(8);
                                    }
                                    LinearLayout f11 = k5.f(context, 1);
                                    xc1Var.addView(f11, c8.ha.e(-1, -1, qs.E1));
                                    org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                                    f11.addView(l9Var2, c8.ha.s(qs.O1, qs.O1, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                                    ui.b0(i11).c2(l9Var2, "Utya3D", "😎", "130_130");
                                    int i14 = org.telegram.ui.ActionBar.l6.j5;
                                    TextView b10 = c8.qa.b(context, 20.0f, i14, true, resourceProvider);
                                    k5.m(b10, 17, null, 2131742944);
                                    f11.addView(b10, c8.ha.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                                    TextView b11 = c8.qa.b(context, 14.0f, i14, false, null);
                                    k5.m(b11, 17, null, 2131742945);
                                    f11.addView(b11, c8.ha.t(-1, -2, 49, 32, 0, 32, 24));
                                    fi.d h = k5.h(24, context, resourceProvider, true);
                                    h.setText(id.M0(2131748250, null));
                                    f11.addView(h, c8.ha.t(-1, 48, 7, 12, 12, 12, 8));
                                    int i15 = org.telegram.ui.ActionBar.l6.a7;
                                    l10.w0(i15);
                                    l10.P(i15);
                                    frameLayout.setOnClickListener(new org.telegram.ui.Components.n1(l10, frameLayout2, arrayList, iArr2, w8Var, l9Var, 4));
                                    h.setOnClickListener(new hk0(23, h, iArr2));
                                    yc1.c = l10;
                                    l10.show();
                                    break;
                                }
                            }
                        }
                    }
                } else if (str.equals("/tg-wear-auth/cancel")) {
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger2 = yc1.a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    yc1.d = null;
                    org.telegram.ui.ActionBar.v2 v2Var2 = yc1.c;
                    if (v2Var2 != null) {
                        v2Var2.dismiss();
                        yc1.c = null;
                        break;
                    }
                } else {
                    a8.b("wear-auth: unexpected path ".concat(str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ uz(byte[] bArr, String str, String str2) {
        this.a = 3;
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }
}
