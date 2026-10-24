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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements Runnable {
    public final /* synthetic */ Utilities.Callback E;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 F;
    public final /* synthetic */ d2 G;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 H;
    public final /* synthetic */ org.telegram.ui.Cells.e9 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.ui.Cells.h3 c;
    public final /* synthetic */ TreeSet d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ jr f;
    public final /* synthetic */ org.telegram.ui.Cells.h3 h;
    public final /* synthetic */ int[] n;
    public final /* synthetic */ ai.db r;
    public final /* synthetic */ ei.d s;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ TLRPC.User x;
    public final /* synthetic */ boolean[] y;

    public /* synthetic */ kr(boolean[] zArr, int[] iArr, org.telegram.ui.Cells.h3 h3Var, TreeSet treeSet, String[] strArr, jr jrVar, org.telegram.ui.Cells.h3 h3Var2, int[] iArr2, ai.db dbVar, ei.d dVar, boolean z10, int i10, TLRPC.User user, boolean[] zArr2, Utilities.Callback callback, org.telegram.ui.ActionBar.h3 h3Var3, d2 d2Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Cells.e9 e9Var, Context context) {
        this.a = zArr;
        this.b = iArr;
        this.c = h3Var;
        this.d = treeSet;
        this.e = strArr;
        this.f = jrVar;
        this.h = h3Var2;
        this.n = iArr2;
        this.r = dbVar;
        this.s = dVar;
        this.v = z10;
        this.w = i10;
        this.x = user;
        this.y = zArr2;
        this.E = callback;
        this.F = h3Var3;
        this.G = d2Var;
        this.H = g6Var;
        this.I = e9Var;
        this.J = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final org.telegram.ui.Cells.h3 h3Var = this.h;
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        final boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        final int[] iArr = this.b;
        if (iArr[0] >= 0) {
            return;
        }
        final org.telegram.ui.Cells.h3 h3Var2 = this.c;
        String charSequence = h3Var2.getText().toString();
        StringBuilder u10 = a1.g.u(charSequence);
        boolean a2 = nr.a(charSequence, "bot");
        final TreeSet treeSet = this.d;
        u10.append((a2 || nr.c(charSequence, treeSet) != null) ? "" : "bot");
        String sb2 = u10.toString();
        final String[] strArr = this.e;
        if (!TextUtils.equals(strArr[0], sb2)) {
            this.f.run();
            return;
        }
        String trim = f3Var.getText().toString().trim();
        boolean isEmpty = TextUtils.isEmpty(trim);
        final int[] iArr2 = this.n;
        if (isEmpty) {
            int i10 = -iArr2[0];
            iArr2[0] = i10;
            AndroidUtilities.shakeViewSpring(h3Var, i10);
            return;
        }
        this.r.run();
        final ei.d dVar = this.s;
        dVar.setLoading(true);
        dVar.setEnabled(false);
        f3Var.setEnabled(false);
        h3Var2.d.setEnabled(false);
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
        final org.telegram.ui.ActionBar.h3 h3Var3 = this.F;
        final d2 d2Var = this.G;
        final org.telegram.ui.ActionBar.g6 g6Var = this.H;
        final org.telegram.ui.Cells.e9 e9Var = this.I;
        final Context context = this.J;
        iArr[0] = connectionsManager.sendRequestTyped(createbot, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.hr
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                String userName;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (zArr[0]) {
                    return;
                }
                iArr[0] = -1;
                ei.d dVar2 = dVar;
                dVar2.setLoading(false);
                dVar2.setEnabled(true);
                h3Var.d.setEnabled(true);
                h3Var2.d.setEnabled(true);
                int i12 = i11;
                org.telegram.ui.ActionBar.h3 h3Var4 = h3Var3;
                if (user2 != null) {
                    zArr2[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    h3Var4.dismiss();
                    return;
                }
                if (tL_error != null) {
                    String str = createbot.username;
                    String str2 = tL_error.text;
                    TreeSet treeSet2 = treeSet;
                    d2 d2Var2 = d2Var;
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    CharSequence d = nr.d(i12, str, treeSet2, str2, d2Var2, g6Var2);
                    if (d != null) {
                        strArr[0] = null;
                        dVar2.setEnabled(false);
                        org.telegram.ui.Cells.e9 e9Var2 = e9Var;
                        e9Var2.setText(d);
                        org.telegram.ui.ActionBar.r6.W(e9Var2.getTextView(), org.telegram.ui.ActionBar.k6.q7, g6Var2);
                        int[] iArr3 = iArr2;
                        int i13 = -iArr3[0];
                        iArr3[0] = i13;
                        AndroidUtilities.shakeViewSpring(e9Var2, i13);
                    } else if ("BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text)) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        xc xcVar = new xc(h3Var4.topBulletinContainer, g6Var2);
                        int i14 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(isPremium ? LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get())) : LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get())), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var2), new zp(h3Var4, 3));
                        ee eeVar = new ee(23, h3Var4, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(g6Var2, eeVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        qc M = xcVar.M(string, replaceSingleLink, i14);
                        M.j = 8000;
                        M.j();
                    } else {
                        String str3 = tL_error.text;
                        if (str3 != null && str3.startsWith("FLOOD_WAIT_")) {
                            new xc(h3Var4.topBulletinContainer, g6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = UserObject.getUserName(user3);
                            } else {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            }
                            new xc(h3Var4.topBulletinContainer, g6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.b1.s(h3Var4.topBulletinContainer, g6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(h3Var4.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
