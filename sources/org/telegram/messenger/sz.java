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
import org.telegram.ui.qv0;
import org.telegram.ui.sc1;
import org.telegram.ui.uc1;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sz(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((tz) this.b).q((String) this.c, (Bundle) this.d);
                break;
            case 1:
                c10 c10Var = (c10) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                a10 a10Var = (a10) this.d;
                storyItem.detectedLng = "und";
                c10Var.getMessagesController().P1().k.h(storyItem.dialogId, storyItem);
                c10Var.J.remove(a10Var);
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                z10[] z10VarArr = (z10[]) this.c;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == z10VarArr.length && runnable != null) {
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
                    BigInteger bigInteger = vc1.a;
                    if (bArr.length != 272) {
                        a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                        break;
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                        a8.r7 r7Var = vc1.d;
                        if (r7Var != null && Arrays.equals((byte[]) r7Var.b, copyOfRange)) {
                            a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                            break;
                        } else {
                            a8.b("wear-auth: new session " + vc1.d(copyOfRange) + " from " + str2);
                            vc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                            Context context = LaunchActivity.H1;
                            if (context == null) {
                                context = t0.b;
                            }
                            if (context != null) {
                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.e6 resourceProvider = T != null ? T.getResourceProvider() : null;
                                org.telegram.ui.ActionBar.u2 u2Var = vc1.c;
                                if (u2Var != null) {
                                    u2Var.dismiss();
                                    vc1.c = null;
                                }
                                org.telegram.ui.ActionBar.u2 k10 = k5.k(1, context, resourceProvider, false);
                                uc1 uc1Var = new uc1(context);
                                k10.O = uc1Var;
                                int i11 = m10.t0;
                                ArrayList arrayList = new ArrayList();
                                arrayList.clear();
                                for (int i12 = 0; i12 < 4; i12++) {
                                    if (m10.i(i12).p()) {
                                        if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                            i11 = i12;
                                        }
                                        arrayList.add(Integer.valueOf(i12));
                                    }
                                }
                                Collections.sort(arrayList, new qv0(7));
                                if (!arrayList.isEmpty()) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    int L = g0.L(14.0f);
                                    int i13 = org.telegram.ui.ActionBar.j6.i5;
                                    Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i13, resourceProvider));
                                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
                                    frameLayout2.setBackground(d02);
                                    org.telegram.ui.ActionBar.q6.j(frameLayout2, d02, M, null, resourceProvider);
                                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                                    i9Var.setRoundRadius(g0.L(14.0f));
                                    i9Var.getImageReceiver().B0 = true;
                                    org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                                    int[] iArr2 = {m10.t0};
                                    TLRPC.User f10 = m10.i(iArr2[0]).f();
                                    t8Var.r(f10);
                                    i9Var.f(f10, t8Var);
                                    frameLayout2.addView(i9Var, c8.ja.e(28, 28, ns.A1));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
                                    imageView.setImageResource(R.drawable.arrows_select);
                                    frameLayout2.addView(imageView, c8.ja.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                                    frameLayout.addView(frameLayout2, c8.ja.e(52, 28, 17));
                                    frameLayout.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                                    uc1Var.addView(frameLayout, c8.ja.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                                    c8.na.a(frameLayout);
                                    if (arrayList.size() <= 1) {
                                        frameLayout.setVisibility(8);
                                    }
                                    LinearLayout f11 = k5.f(context, 1);
                                    uc1Var.addView(f11, c8.ja.e(-1, -1, ns.E1));
                                    org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
                                    f11.addView(i9Var2, c8.ja.s(ns.O1, ns.O1, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                                    si.b0(i11).c2(i9Var2, "Utya3D", "😎", "130_130");
                                    int i14 = org.telegram.ui.ActionBar.j6.j5;
                                    TextView b10 = c8.sa.b(context, 20.0f, i14, true, resourceProvider);
                                    k5.l(b10, 17, null, 2131742944);
                                    f11.addView(b10, c8.ja.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                                    TextView b11 = c8.sa.b(context, 14.0f, i14, false, null);
                                    k5.l(b11, 17, null, 2131742945);
                                    f11.addView(b11, c8.ja.t(-1, -2, 49, 32, 0, 32, 24));
                                    hi.d g10 = i20.g(24, context, resourceProvider, true);
                                    g10.setText(hd.M0(2131748250, null));
                                    f11.addView(g10, c8.ja.t(-1, 48, 7, 12, 12, 12, 8));
                                    int i15 = org.telegram.ui.ActionBar.j6.a7;
                                    k10.w0(i15);
                                    k10.Q(i15);
                                    frameLayout.setOnClickListener(new org.telegram.ui.Components.l1(k10, frameLayout2, arrayList, iArr2, t8Var, i9Var, 4));
                                    g10.setOnClickListener(new sc1(0, g10, iArr2));
                                    vc1.c = k10;
                                    k10.show();
                                    break;
                                }
                            }
                        }
                    }
                } else if (str.equals("/tg-wear-auth/cancel")) {
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger2 = vc1.a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    vc1.d = null;
                    org.telegram.ui.ActionBar.u2 u2Var2 = vc1.c;
                    if (u2Var2 != null) {
                        u2Var2.dismiss();
                        vc1.c = null;
                        break;
                    }
                } else {
                    a8.b("wear-auth: unexpected path ".concat(str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sz(byte[] bArr, String str, String str2) {
        this.a = 3;
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }
}
