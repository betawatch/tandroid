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
import org.telegram.ui.Components.d80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb0;
import org.telegram.ui.pc1;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mz(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((nz) this.b).q((String) this.c, (Bundle) this.d);
                break;
            case 1:
                x00 x00Var = (x00) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                v00 v00Var = (v00) this.d;
                storyItem.detectedLng = "und";
                x00Var.getMessagesController().P1().k.h(storyItem.dialogId, storyItem);
                x00Var.J.remove(v00Var);
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                u10[] u10VarArr = (u10[]) this.c;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i3 = iArr[0] + 1;
                iArr[0] = i3;
                if (i3 == u10VarArr.length && runnable != null) {
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
                    StringBuilder u10 = a1.g.u("wear-auth: offer from ", str2, " (");
                    u10.append(bArr.length);
                    u10.append(" bytes)");
                    a8.b(u10.toString());
                    BigInteger bigInteger = qc1.a;
                    if (bArr.length != 272) {
                        a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                        break;
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                        b8.ke keVar = qc1.d;
                        if (keVar != null && Arrays.equals((byte[]) keVar.b, copyOfRange)) {
                            a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                            break;
                        } else {
                            a8.b("wear-auth: new session " + qc1.d(copyOfRange) + " from " + str2);
                            qc1.d = new b8.ke(copyOfRange, copyOfRange2, str2);
                            Context context = LaunchActivity.K1;
                            if (context == null) {
                                context = t0.b;
                            }
                            if (context != null) {
                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.e6 resourceProvider = T != null ? T.getResourceProvider() : null;
                                org.telegram.ui.ActionBar.t2 t2Var = qc1.c;
                                if (t2Var != null) {
                                    t2Var.dismiss();
                                    qc1.c = null;
                                }
                                org.telegram.ui.ActionBar.t2 l10 = k5.l(1, context, resourceProvider, false);
                                pc1 pc1Var = new pc1(context);
                                l10.O = pc1Var;
                                int i11 = h10.t0;
                                ArrayList arrayList = new ArrayList();
                                arrayList.clear();
                                for (int i12 = 0; i12 < 4; i12++) {
                                    if (h10.i(i12).p()) {
                                        if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                            i11 = i12;
                                        }
                                        arrayList.add(Integer.valueOf(i12));
                                    }
                                }
                                Collections.sort(arrayList, new d80(25));
                                if (!arrayList.isEmpty()) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    int L = g0.L(14.0f);
                                    int i13 = org.telegram.ui.ActionBar.k6.i5;
                                    Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i13, resourceProvider));
                                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                                    frameLayout2.setBackground(d02);
                                    org.telegram.ui.ActionBar.r6.k(frameLayout2, d02, N, null, resourceProvider);
                                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                                    k9Var.setRoundRadius(g0.L(14.0f));
                                    k9Var.getImageReceiver().B0 = true;
                                    org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                                    int[] iArr2 = {h10.t0};
                                    TLRPC.User f10 = h10.i(iArr2[0]).f();
                                    u8Var.r(f10);
                                    k9Var.e(f10, u8Var);
                                    frameLayout2.addView(k9Var, b8.mf.e(28, 28, hs.A1));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
                                    imageView.setImageResource(R.drawable.arrows_select);
                                    frameLayout2.addView(imageView, b8.mf.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                                    frameLayout.addView(frameLayout2, b8.mf.e(52, 28, 17));
                                    frameLayout.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                                    pc1Var.addView(frameLayout, b8.mf.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                                    b8.pf.a(frameLayout);
                                    if (arrayList.size() <= 1) {
                                        frameLayout.setVisibility(8);
                                    }
                                    LinearLayout f11 = k5.f(context, 1);
                                    pc1Var.addView(f11, b8.mf.e(-1, -1, hs.E1));
                                    org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                                    f11.addView(k9Var2, b8.mf.s(hs.O1, hs.O1, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                                    li.b0(i11).c2(k9Var2, "Utya3D", "😎", "130_130");
                                    int i14 = org.telegram.ui.ActionBar.k6.j5;
                                    TextView b10 = b8.rf.b(context, 20.0f, i14, true, resourceProvider);
                                    k5.m(b10, 17, null, 2131742954);
                                    f11.addView(b10, b8.mf.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                                    TextView b11 = b8.rf.b(context, 14.0f, i14, false, null);
                                    k5.m(b11, 17, null, 2131742955);
                                    f11.addView(b11, b8.mf.t(-1, -2, 49, 32, 0, 32, 24));
                                    gi.d h = k5.h(24, context, resourceProvider, true);
                                    h.setText(bd.M0(2131748258, null));
                                    f11.addView(h, b8.mf.t(-1, 48, 7, 12, 12, 12, 8));
                                    int i15 = org.telegram.ui.ActionBar.k6.a7;
                                    l10.w0(i15);
                                    l10.P(i15);
                                    frameLayout.setOnClickListener(new org.telegram.ui.Components.m1(l10, frameLayout2, arrayList, iArr2, u8Var, k9Var, 4));
                                    h.setOnClickListener(new hb0(29, h, iArr2));
                                    qc1.c = l10;
                                    l10.show();
                                    break;
                                }
                            }
                        }
                    }
                } else if (str.equals("/tg-wear-auth/cancel")) {
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger2 = qc1.a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    qc1.d = null;
                    org.telegram.ui.ActionBar.t2 t2Var2 = qc1.c;
                    if (t2Var2 != null) {
                        t2Var2.dismiss();
                        qc1.c = null;
                        break;
                    }
                } else {
                    a8.b("wear-auth: unexpected path ".concat(str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ mz(byte[] bArr, String str, String str2) {
        this.a = 3;
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }
}
