package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.mg1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o71(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05bc, code lost:
    
        if (r11.equals("allowScroll") == false) goto L243;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String absolutePath;
        boolean z4;
        org.telegram.ui.web.l2 l2Var;
        Object obj;
        int[] iArr;
        File file;
        int i10;
        int i11;
        boolean contains;
        ArrayList arrayList;
        int i12 = this.a;
        char c3 = 4;
        int i13 = 2;
        Pair pair = null;
        Object obj2 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        int[] iArr2 = null;
        Bitmap decodeFile = null;
        int i14 = 0;
        boolean z10 = true;
        z10 = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i12) {
            case 0:
                r71 r71Var = (r71) obj5;
                i71 i71Var = (i71) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                r71Var.getClass();
                if (i71Var.b()) {
                    r71Var.b = new y5(new File(i71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i15 = UserConfig.selectedAccount;
                    try {
                        i15 = Utilities.parseInt((CharSequence) i71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    int i16 = i15;
                    try {
                        obj2 = FileLoader.getInstance(i16).getParentObject(Utilities.parseInt((CharSequence) i71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Object obj6 = obj2;
                    TLRPC.Document document = i71Var.g;
                    if (FileLoader.getInstance(i16).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(document.dc_id);
                        sb.append("_");
                        absolutePath = new File(directory, android.support.v4.media.a.q(sb, document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(i16).getPathToAttach(document, false).getAbsolutePath();
                    }
                    r71Var.b = new y5(new File(absolutePath), true, document.size, 1, document, null, obj6, 0L, i16, true);
                }
                r71Var.c = r71Var.b.d[4];
                float f10 = r71Var.h;
                if (f10 != 0.0f) {
                    r71Var.e(messageObject, f10, r71Var.r);
                    r71Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new n71(r71Var, i13));
                break;
            case 1:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj5;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj4;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj3;
                ValueAnimator valueAnimator = l0Var.K0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.k0(l0Var, uVar)).setDuration(100L).start();
                if (uVar2 != null) {
                    uVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(uVar2)).start();
                    break;
                }
                break;
            case 2:
                ((org.telegram.ui.web.x0) obj5).d("window.Telegram.WebView.receiveEvent('" + ((String) obj4) + "', " + ((JSONObject) obj3) + ");");
                break;
            case 3:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.a1) obj5).d((String[]) obj3)));
                break;
            case 4:
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((hg.g0) obj3);
                break;
            case 5:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.a1 a1Var = botWebViewContainer$BotWebViewProxy.a;
                    if (a1Var == null) {
                        break;
                    } else {
                        boolean z11 = org.telegram.ui.web.a1.J0;
                        a1Var.B(botWebViewContainer$BotWebViewProxy, str, str2);
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 6:
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                org.telegram.ui.web.a1 a1Var2 = ((BotWebViewContainer$WebViewProxy) obj5).a;
                if (!a1Var2.l0 && a1Var2.c != null) {
                    if (a1Var2.A0 != null && !TextUtils.equals(a1Var2.getOriginHost(), a1Var2.A0)) {
                        a1Var2.g("onWebEventReceived ignore " + str3);
                        break;
                    } else {
                        a1Var2.g("onWebEventReceived " + str3 + " " + str4);
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1695046810:
                                if (str3.equals("actionBarColor")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -462720700:
                                if (str3.equals("navigationBarColor")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 479731943:
                                if (str3.equals("oauth_request")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 675009138:
                                if (str3.equals("siteName")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 997530486:
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case 1:
                                try {
                                    JSONArray jSONArray = new JSONArray(str4);
                                    boolean equals = TextUtils.equals(str3, "actionBarColor");
                                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.x0 x0Var = a1Var2.a;
                                    if (x0Var != null) {
                                        if (equals) {
                                            x0Var.s = true;
                                            x0Var.w = argb;
                                        } else {
                                            x0Var.v = true;
                                            x0Var.x = argb;
                                        }
                                        org.telegram.ui.web.x0.a(x0Var);
                                    }
                                    a1Var2.c.o(argb, equals);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            case 2:
                                a1Var2.g("oauth_request " + str4);
                                if (a1Var2.a != null) {
                                    String originHost = a1Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str4).optString("url");
                                            a1Var2.v("oauth_supported", org.telegram.ui.web.a1.x(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i17 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i17 | 12;
                                                ConnectionsManager.getInstance(a1Var2.J).sendRequest(tL_messages_requestUrlAuth, new lh.b1(a1Var2, tL_messages_requestUrlAuth, optString, originHost, 16), 2);
                                                break;
                                            }
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                a1Var2.g("siteName " + str4);
                                org.telegram.ui.web.x0 x0Var2 = a1Var2.a;
                                if (x0Var2 != null) {
                                    x0Var2.r = str4;
                                    org.telegram.ui.web.x0.a(x0Var2);
                                    break;
                                }
                                break;
                            case 4:
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str4);
                                    z4 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z10 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    z4 = true;
                                }
                                if (a1Var2.getParent() instanceof sh.m3) {
                                    sh.m3 m3Var = (sh.m3) a1Var2.getParent();
                                    m3Var.L = z4;
                                    m3Var.M = z10;
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 7:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                String str5 = (String) obj3;
                ArrayList arrayList3 = new ArrayList();
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) arrayList2.get(i18);
                    if (org.telegram.ui.web.e1.t(b1Var.c, str5) || ((l2Var = b1Var.d) != null && (org.telegram.ui.web.e1.t(l2Var.c, str5) || org.telegram.ui.web.e1.t(b1Var.d.d, str5)))) {
                        arrayList3.add(b1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new mg1(10, e1Var, arrayList3));
                break;
            case 8:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj5;
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                h2Var.getClass();
                if (org.telegram.ui.web.h2.f != null) {
                    char c10 = ((g2Var.d > 0 && g2Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                    if (bitmap != null) {
                        h2Var.d.put(g2Var.b, bitmap);
                        if (c10 != 0) {
                            int i19 = g2Var.d;
                            if (i19 == 0 && g2Var.e == 0) {
                                g2Var.d = bitmap.getWidth();
                                g2Var.e = bitmap.getHeight();
                            } else if (i19 == 0) {
                                g2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * g2Var.e);
                            } else if (g2Var.e == 0) {
                                g2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * g2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList4 = (ArrayList) org.telegram.ui.web.h2.f.remove(g2Var.b);
                    if (arrayList4 != null) {
                        int size = arrayList4.size();
                        while (i14 < size) {
                            Object obj7 = arrayList4.get(i14);
                            i14++;
                            Pair pair2 = (Pair) obj7;
                            ((ImageReceiver) pair2.first).setImageBitmap(bitmap);
                            if (c10 != 0 && (obj = pair2.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 9:
                ((EglRenderer) obj5).lambda$init$0((EglBase.Context) obj4, (int[]) obj3);
                break;
            case 10:
                ((EglRenderer) obj5).lambda$removeFrameListener$4((CountDownLatch) obj4, (EglRenderer.FrameListener) obj3);
                break;
            case 11:
                ((VideoFileRenderer) obj5).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj4, (VideoFrame) obj3);
                break;
            case 12:
                qh.n1 n1Var = (qh.n1) obj5;
                TLObject tLObject = (TLObject) obj3;
                ArrayList arrayList5 = n1Var.v;
                qh.o1 o1Var = n1Var.K;
                ArrayList arrayList6 = n1Var.s;
                if (TextUtils.equals((String) obj4, n1Var.E)) {
                    n1Var.x = 0;
                    arrayList6.clear();
                    arrayList5.clear();
                    n1Var.y.clear();
                    n1Var.n.clear();
                    n1Var.x++;
                    arrayList6.add(null);
                    arrayList5.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList6.addAll(tL_messages_stickers.stickers);
                        n1Var.x = tL_messages_stickers.stickers.size() + n1Var.x;
                    }
                    n1Var.F = n1Var.E;
                    n1Var.l();
                    qh.d1.w1(o1Var.b, 0, 0);
                    o1Var.f.c(false);
                    o1Var.e.n(false);
                    break;
                }
                break;
            case 13:
                qh.x2 x2Var = (qh.x2) obj5;
                String str6 = (String) obj3;
                float f11 = x2Var.H;
                if (obj4 != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj4;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        x2Var.c(photoEntry, options);
                        qh.s6.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        Bitmap c11 = x2Var.c(photoEntry, options);
                        if (c11 != null && c11.getHeight() / c11.getWidth() < f11) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c11.isRecycled()) {
                                iArr2 = qh.g0.b(c11, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i20 = photoEntry.gradientTopColor;
                                if (i20 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i20, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        decodeFile = c11;
                    } else if (!(obj4 instanceof qh.s6) || (file = ((qh.s6) obj4).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        qh.s6.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        decodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    pair = new Pair(decodeFile, iArr);
                }
                AndroidUtilities.runOnUIThread(new o71(x2Var, str6, pair, 14));
                break;
            case 14:
                qh.x2 x2Var2 = (qh.x2) obj5;
                String str7 = (String) obj4;
                Pair pair3 = (Pair) obj3;
                Bitmap bitmap2 = (Bitmap) pair3.first;
                int[] iArr3 = (int[]) pair3.second;
                Paint paint = x2Var2.d;
                if (bitmap2 != null) {
                    if (str7 != null) {
                        qh.x2.c0.put(str7, bitmap2);
                        HashMap hashMap = qh.x2.b0;
                        Integer num = (Integer) hashMap.get(str7);
                        if (num != null) {
                            hashMap.put(str7, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str7, 1);
                        }
                    }
                    if (TextUtils.equals(str7, x2Var2.O)) {
                        x2Var2.a = bitmap2;
                        if (iArr3 == null) {
                            paint.setShader(null);
                            x2Var2.e = null;
                        } else {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            x2Var2.e = linearGradient;
                            paint.setShader(linearGradient);
                        }
                        x2Var2.h();
                        x2Var2.invalidate();
                        break;
                    } else {
                        qh.x2.d(str7);
                        break;
                    }
                }
                break;
            case 15:
                qh.z2 z2Var = (qh.z2) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                z2Var.r = true;
                z2Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(z2Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    z2Var.E();
                    break;
                }
                break;
            case 16:
                String[] strArr = (String[]) obj5;
                int[][] iArr4 = (int[][]) obj4;
                org.telegram.ui.yx0 yx0Var = (org.telegram.ui.yx0) obj3;
                for (int i21 = 0; i21 < strArr.length; i21++) {
                    String str8 = strArr[i21];
                    if (str8 != null) {
                        AnimatedFileNative.d(str8, iArr4[i21], 0L);
                    }
                }
                AndroidUtilities.runOnUIThread(yx0Var);
                break;
            case 17:
                AnimatedFileNative.d((String) obj5, ((int[][]) obj4)[0], 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.yx0) obj3);
                break;
            case 18:
                qh.x7 x7Var = (qh.x7) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                MessagesController messagesController2 = (MessagesController) obj3;
                qh.d8 d8Var = x7Var.T;
                x7Var.v.setLoading(false);
                if (tLObject3 != null) {
                    int i22 = qh.d8.a0;
                    ArrayList h12 = d8Var.h1();
                    for (int i23 = 0; i23 < h12.size(); i23++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i23);
                        if (user != null && (contains = x7Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                d8Var.f1();
                if (d8Var.W) {
                    i11 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    d8Var.g1(new qh.b8(1, i11, (ArrayList) null), new oh.v3(d8Var, true ? 1 : 0), false);
                    break;
                } else {
                    d8Var.f1();
                    d8Var.b.D(0);
                    break;
                }
                break;
            case 19:
                ((qh.s6) obj4).O0 = (File) obj3;
                qh.u8 u8Var = ((qh.ca) obj5).a1;
                if (u8Var != null) {
                    u8Var.b.V2.N(false);
                    break;
                }
                break;
            case 20:
                qh.ca caVar = (qh.ca) obj5;
                Bitmap bitmap3 = (Bitmap) obj4;
                Runnable runnable = (Runnable) obj3;
                if (bitmap3 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), caVar.y0.getMatrix(), true);
                        bitmap3.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused4) {
                    }
                }
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 21:
                ArrayList arrayList7 = (ArrayList) obj5;
                HashMap hashMap2 = (HashMap) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                ArrayList arrayList8 = new ArrayList();
                for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList7.get(i24);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z12 = bool == null || !bool.booleanValue();
                    sh.o oVar = new sh.o();
                    oVar.a = user2;
                    oVar.b = z12;
                    arrayList8.add(oVar);
                }
                callback.run(arrayList8);
                break;
            case 22:
                sh.j1 j1Var = (sh.j1) obj3;
                ((boolean[]) obj5)[0] = false;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    j1Var.run(Boolean.TRUE);
                    break;
                }
                break;
            case 23:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                sh.p2 p2Var = ((sh.k2) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    sh.h2 h2Var2 = p2Var.x;
                    h2Var2.getClass();
                    h2Var2.v("emoji_status_access_requested", org.telegram.ui.web.a1.x("cancelled", "status"));
                    break;
                } else {
                    new qc(p2Var.m0, p2Var.B).Y(tL_error).k(true);
                    break;
                }
            case 24:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                qc.a0((sh.d3) obj5).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, sh.j.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj3))), R.raw.copy).j();
                break;
            case 25:
                sh.d3.A0((sh.d3) obj5, (TLObject) obj4, (org.telegram.ui.ActionBar.d2) obj3);
                break;
            case 26:
                org.telegram.messenger.o7 o7Var = (org.telegram.messenger.o7) obj3;
                int i25 = ((uf.z) obj5).p0;
                MessagesController messagesController3 = MessagesController.getInstance(i25);
                Iterator it = ((HashSet) obj4).iterator();
                while (it.hasNext()) {
                    Pair pair4 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair4.first).booleanValue();
                    Long l10 = (Long) pair4.second;
                    (booleanValue ? messagesController3.dialogs_read_outbox_max : messagesController3.dialogs_read_inbox_max).put(l10, Integer.valueOf(MessagesStorage.getInstance(i25).getDialogReadMaxSync(booleanValue, l10.longValue())));
                }
                AndroidUtilities.runOnUIThread(o7Var);
                break;
            case 27:
                ((uf.x) obj5).a((a0.h) obj3, (ArrayList) obj4);
                break;
            case 28:
                uf.u0 u0Var = (uf.u0) obj5;
                String str9 = (String) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                u0Var.B0 = 0;
                if (str9.equals(u0Var.A0) && (tLObject4 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject4;
                    ArrayList arrayList9 = u0Var.x0;
                    int size2 = arrayList9 != null ? arrayList9.size() : 0;
                    u0Var.F("sticker_search_".concat(str9), tL_messages_stickers2.stickers);
                    ArrayList arrayList10 = u0Var.x0;
                    int size3 = arrayList10 != null ? arrayList10.size() : 0;
                    if (!u0Var.l0 && (arrayList = u0Var.x0) != null && !arrayList.isEmpty()) {
                        u0Var.H();
                        u0Var.S.a(u0Var.K() > 0);
                        u0Var.l0 = true;
                    }
                    if (size2 != size3) {
                        u0Var.l();
                        break;
                    }
                }
                break;
            default:
                uf.u0 u0Var2 = (uf.u0) obj5;
                u0Var2.m0 = null;
                u0Var2.Y((a0.h) obj3, (ArrayList) obj4, true);
                break;
        }
    }
}
