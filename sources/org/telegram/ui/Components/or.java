package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements Runnable {
    public final /* synthetic */ Utilities.Callback E;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 F;
    public final /* synthetic */ o8 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 H;
    public final /* synthetic */ org.telegram.ui.Cells.e9 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.j3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ nr f;
    public final /* synthetic */ org.telegram.ui.Cells.j3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ bi.n8 r;
    public final /* synthetic */ di.d s;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ TLRPC.User x;
    public final /* synthetic */ boolean[] y;

    public /* synthetic */ or(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.j3 j3Var, TreeSet treeSet, String[] strArr, nr nrVar, org.telegram.ui.Cells.j3 j3Var2, int[] iArr2, bi.n8 n8Var, di.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, o8 o8Var, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Cells.e9 e9Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = j3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = nrVar;
        this.h = j3Var2;
        this.n = iArr2;
        this.r = n8Var;
        this.s = dVar;
        this.v = z10;
        this.w = i10;
        this.x = user;
        this.y = zArr2;
        this.E = callback;
        this.F = e3Var;
        this.G = o8Var;
        this.H = c6Var;
        this.I = e9Var;
        this.J = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final org.telegram.ui.Cells.j3 j3Var = this.h;
        org.telegram.ui.Cells.h3 h3Var = j3Var.b;
        final boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        final int[] iArr = this.b;
        if (iArr[0] >= 0) {
            return;
        }
        final org.telegram.ui.Cells.j3 j3Var2 = this.c;
        String charSequence = j3Var2.getText().toString();
        StringBuilder u10 = a1.g.u(charSequence);
        boolean a2 = qr.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        u10.append((a2 || qr.c(charSequence, treeSet) != null) ? "" : "bot");
        String sb2 = u10.toString();
        final String[] strArr = this.e;
        if (!TextUtils.equals(strArr[0], sb2)) {
            this.f.run();
            return;
        }
        String trim = h3Var.getText().toString().trim();
        boolean isEmpty = TextUtils.isEmpty(trim);
        final int[] iArr2 = this.n;
        if (isEmpty) {
            int i10 = -iArr2[0];
            iArr2[0] = i10;
            AndroidUtilities.shakeViewSpring(j3Var, i10);
            return;
        }
        this.r.run();
        final di.d dVar = this.s;
        dVar.setLoading(true);
        dVar.setEnabled(false);
        h3Var.setEnabled(false);
        j3Var2.b.setEnabled(false);
        final TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.v;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.w;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.x;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final boolean[] zArr2 = this.y;
        final Utilities.Callback callback = this.E;
        final org.telegram.ui.ActionBar.e3 e3Var = this.F;
        final o8 o8Var = this.G;
        final org.telegram.ui.ActionBar.c6 c6Var = this.H;
        final org.telegram.ui.Cells.e9 e9Var = this.I;
        final Context context = this.J;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.lr
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                String userName;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                di.d dVar2 = dVar;
                dVar2.setLoading(false);
                dVar2.setEnabled(true);
                j3Var.b.setEnabled(true);
                j3Var2.b.setEnabled(true);
                int i12 = i11;
                org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                if (user2 != null) {
                    zArr2[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    e3Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    o8 o8Var2 = o8Var;
                    org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                    CharSequence d = qr.d(i12, str, treeSet2, str2, o8Var2, c6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        dVar2.setEnabled(false);
                        org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                        e9Var2.setText(d);
                        e9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q7, c6Var2));
                        int[] iArr3 = iArr2;
                        int i13 = -iArr3[0];
                        iArr3[0] = i13;
                        AndroidUtilities.shakeViewSpring(e9Var2, i13);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        zc zcVar = new zc(e3Var2.topBulletinContainer, c6Var2);
                        int i14 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(isPremium ? LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get())) : LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get())), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var2), new kq(e3Var2, 2));
                        sk skVar = new sk(9, e3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(c6Var2, skVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        sc M = zcVar.M(string, replaceSingleLink, i14);
                        M.j = 8000;
                        M.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new zc(e3Var2.topBulletinContainer, c6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = UserObject.getUserName(user3);
                            } else {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            }
                            new zc(e3Var2.topBulletinContainer, c6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.d0.r(e3Var2.topBulletinContainer, c6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(e3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
