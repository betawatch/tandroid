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
import org.telegram.ui.ig0;
import org.telegram.ui.ow0;
import org.telegram.ui.vc1;
import org.telegram.ui.wc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class nz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nz(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((oz) this.b).q((String) this.c, (Bundle) this.d);
                break;
            case 1:
                y00 y00Var = (y00) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                w00 w00Var = (w00) this.d;
                storyItem.detectedLng = "und";
                y00Var.getMessagesController().R1().k.h(storyItem.dialogId, storyItem);
                y00Var.J.remove(w00Var);
                break;
            case 2:
                int[] iArr = (int[]) this.b;
                w10[] w10VarArr = (w10[]) this.c;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == w10VarArr.length && runnable != null) {
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
                    BigInteger bigInteger = wc1.a;
                    if (bArr.length != 272) {
                        a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                        break;
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                        a8.r7 r7Var = wc1.d;
                        if (r7Var != null && Arrays.equals((byte[]) r7Var.b, copyOfRange)) {
                            a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                            break;
                        } else {
                            a8.b("wear-auth: new session " + wc1.d(copyOfRange) + " from " + str2);
                            wc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                            Context context = LaunchActivity.H1;
                            if (context == null) {
                                context = t0.b;
                            }
                            if (context != null) {
                                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                org.telegram.ui.ActionBar.i6 resourceProvider = T != null ? T.getResourceProvider() : null;
                                org.telegram.ui.ActionBar.w2 w2Var = wc1.c;
                                if (w2Var != null) {
                                    w2Var.dismiss();
                                    wc1.c = null;
                                }
                                org.telegram.ui.ActionBar.w2 j3 = f3.j(1, context, resourceProvider, false);
                                vc1 vc1Var = new vc1(context);
                                j3.O = vc1Var;
                                int i11 = i10.t0;
                                ArrayList arrayList = new ArrayList();
                                arrayList.clear();
                                for (int i12 = 0; i12 < 4; i12++) {
                                    if (i10.i(i12).p()) {
                                        if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                            i11 = i12;
                                        }
                                        arrayList.add(Integer.valueOf(i12));
                                    }
                                }
                                Collections.sort(arrayList, new ow0(6));
                                if (!arrayList.isEmpty()) {
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    int L = g0.L(14.0f);
                                    int i13 = org.telegram.ui.ActionBar.n6.i5;
                                    Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i13, resourceProvider));
                                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                                    frameLayout2.setBackground(d02);
                                    org.telegram.ui.ActionBar.u6.j(frameLayout2, d02, M, null, resourceProvider);
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.setRoundRadius(g0.L(14.0f));
                                    p9Var.getImageReceiver().B0 = true;
                                    org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                                    int[] iArr2 = {i10.t0};
                                    TLRPC.User f10 = i10.i(iArr2[0]).f();
                                    a9Var.r(f10);
                                    p9Var.f(f10, a9Var);
                                    frameLayout2.addView(p9Var, c8.na.e(28, 28, ks.A1));
                                    ImageView imageView = new ImageView(context);
                                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.r5, resourceProvider, PorterDuff.Mode.SRC_IN);
                                    imageView.setImageResource(R.drawable.arrows_select);
                                    frameLayout2.addView(imageView, c8.na.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                                    frameLayout.addView(frameLayout2, c8.na.e(52, 28, 17));
                                    frameLayout.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                                    vc1Var.addView(frameLayout, c8.na.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                                    c8.sa.a(frameLayout);
                                    if (arrayList.size() <= 1) {
                                        frameLayout.setVisibility(8);
                                    }
                                    LinearLayout g10 = f3.g(context, 1);
                                    vc1Var.addView(g10, c8.na.e(-1, -1, ks.E1));
                                    org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
                                    g10.addView(p9Var2, c8.na.s(ks.O1, ks.O1, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                                    ri.d0(i11).h2(p9Var2, "Utya3D", "😎", "130_130");
                                    int i14 = org.telegram.ui.ActionBar.n6.j5;
                                    TextView b10 = c8.wa.b(context, 20.0f, i14, true, resourceProvider);
                                    f3.k(b10, 17, null, 2131742673);
                                    g10.addView(b10, c8.na.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                                    TextView b11 = c8.wa.b(context, 14.0f, i14, false, null);
                                    f3.k(b11, 17, null, 2131742674);
                                    g10.addView(b11, c8.na.t(-1, -2, 49, 32, 0, 32, 24));
                                    hi.e g11 = m10.g(24, context, resourceProvider, true);
                                    g11.setText(gd.N0(2131748057, null));
                                    g10.addView(g11, c8.na.t(-1, 48, 7, 12, 12, 12, 8));
                                    int i15 = org.telegram.ui.ActionBar.n6.a7;
                                    j3.w0(i15);
                                    j3.Q(i15);
                                    frameLayout.setOnClickListener(new org.telegram.ui.Components.v1(j3, frameLayout2, arrayList, iArr2, a9Var, p9Var, 4));
                                    g11.setOnClickListener(new ig0(23, g11, iArr2));
                                    wc1.c = j3;
                                    j3.show();
                                    break;
                                }
                            }
                        }
                    }
                } else if (str.equals("/tg-wear-auth/cancel")) {
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger2 = wc1.a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    wc1.d = null;
                    org.telegram.ui.ActionBar.w2 w2Var2 = wc1.c;
                    if (w2Var2 != null) {
                        w2Var2.dismiss();
                        wc1.c = null;
                        break;
                    }
                } else {
                    a8.b("wear-auth: unexpected path ".concat(str));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nz(byte[] bArr, String str, String str2) {
        this.a = 3;
        this.c = str;
        this.b = str2;
        this.d = bArr;
    }
}
