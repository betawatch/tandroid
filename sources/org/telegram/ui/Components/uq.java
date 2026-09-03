package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq implements Runnable {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ lh.s6 b;
    public final /* synthetic */ org.telegram.ui.Cells.h3 c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ ph.d e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.User n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean[] s;
    public final /* synthetic */ Utilities.Callback v;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 w;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 x;
    public final /* synthetic */ Context y;

    public /* synthetic */ uq(String[] strArr, lh.s6 s6Var, org.telegram.ui.Cells.h3 h3Var, int[] iArr, ph.d dVar, boolean z4, int i10, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.g3 g3Var, org.telegram.ui.ActionBar.f6 f6Var, Context context) {
        this.a = strArr;
        this.b = s6Var;
        this.c = h3Var;
        this.d = iArr;
        this.e = dVar;
        this.f = z4;
        this.h = i10;
        this.n = user;
        this.r = iArr2;
        this.s = zArr;
        this.v = callback;
        this.w = g3Var;
        this.x = f6Var;
        this.y = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.a;
        if (strArr[0] == null) {
            this.b.run();
            return;
        }
        org.telegram.ui.Cells.h3 h3Var = this.c;
        String trim = h3Var.b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i10 = -iArr[0];
            iArr[0] = i10;
            AndroidUtilities.shakeViewSpring(h3Var, i10);
            return;
        }
        final ph.d dVar = this.e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i11 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i11);
        final TLRPC.User user = this.n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final int[] iArr2 = this.r;
        final boolean[] zArr = this.s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.g3 g3Var = this.w;
        final org.telegram.ui.ActionBar.f6 f6Var = this.x;
        final Context context = this.y;
        iArr2[0] = connectionsManager.sendRequestTyped(createbot, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.xq
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                String userName;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                iArr2[0] = -1;
                dVar.setLoading(false);
                int i12 = i11;
                org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i12).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i12).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    g3Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    boolean equalsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i12);
                        boolean isPremium = UserConfig.getInstance(i12).isPremium();
                        qc qcVar = new qc(g3Var2.topBulletinContainer, f6Var2);
                        int i13 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(isPremium ? LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get())) : LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get())), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var2), new up(g3Var2, 2));
                        em emVar = new em(4, g3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(f6Var2, emVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        ic M = qcVar.M(string, replaceSingleLink, i13);
                        M.j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new qc(g3Var2.topBulletinContainer, f6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = UserObject.getUserName(user3);
                            } else {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            }
                            new qc(g3Var2.topBulletinContainer, f6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var2))).j();
                        } else {
                            org.telegram.ui.ai.u(g3Var2.topBulletinContainer, f6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(g3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
