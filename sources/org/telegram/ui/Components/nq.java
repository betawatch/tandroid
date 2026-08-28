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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ gh.u6 b;
    public final /* synthetic */ org.telegram.ui.Cells.j3 c;
    public final /* synthetic */ int[] d;
    public final /* synthetic */ kh.d e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.User n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean[] s;
    public final /* synthetic */ Utilities.Callback v;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 w;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 x;
    public final /* synthetic */ Context y;

    public /* synthetic */ nq(String[] strArr, gh.u6 u6Var, org.telegram.ui.Cells.j3 j3Var, int[] iArr, kh.d dVar, boolean z10, int i9, TLRPC.User user, int[] iArr2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        this.a = strArr;
        this.b = u6Var;
        this.c = j3Var;
        this.d = iArr;
        this.e = dVar;
        this.f = z10;
        this.h = i9;
        this.n = user;
        this.r = iArr2;
        this.s = zArr;
        this.v = callback;
        this.w = f3Var;
        this.x = b6Var;
        this.y = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.a;
        if (strArr[0] == null) {
            this.b.run();
            return;
        }
        org.telegram.ui.Cells.j3 j3Var = this.c;
        String trim = j3Var.b.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            int[] iArr = this.d;
            int i9 = -iArr[0];
            iArr[0] = i9;
            AndroidUtilities.shakeViewSpring(j3Var, i9);
            return;
        }
        final kh.d dVar = this.e;
        dVar.setLoading(true);
        TL_bots.createBot createbot = new TL_bots.createBot();
        createbot.via_deeplink = this.f;
        createbot.username = strArr[0];
        createbot.name = trim;
        final int i10 = this.h;
        MessagesController messagesController = MessagesController.getInstance(i10);
        final TLRPC.User user = this.n;
        createbot.manager_id = messagesController.getInputUser(user);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final int[] iArr2 = this.r;
        final boolean[] zArr = this.s;
        final Utilities.Callback callback = this.v;
        final org.telegram.ui.ActionBar.f3 f3Var = this.w;
        final org.telegram.ui.ActionBar.b6 b6Var = this.x;
        final Context context = this.y;
        iArr2[0] = connectionsManager.sendRequestTyped(createbot, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.Components.qq
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                String userName;
                TLRPC.User user2 = (TLRPC.User) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                iArr2[0] = -1;
                dVar.setLoading(false);
                int i11 = i10;
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                if (user2 != null) {
                    zArr[0] = true;
                    MessagesController.getInstance(i11).putUser(user2, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(user2);
                    MessagesStorage.getInstance(i11).putUsersAndChats(arrayList, null, false, false);
                    callback.run(user2);
                    f3Var2.dismiss();
                    return;
                }
                if (tL_error != null) {
                    boolean equalsIgnoreCase = "BOT_CREATE_LIMIT_EXCEEDED".equalsIgnoreCase(tL_error.text);
                    org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                    if (equalsIgnoreCase) {
                        MessagesController messagesController2 = MessagesController.getInstance(i11);
                        boolean isPremium = UserConfig.getInstance(i11).isPremium();
                        oc ocVar = new oc(f3Var2.topBulletinContainer, b6Var2);
                        int i12 = R.raw.error;
                        String string = LocaleController.getString(R.string.CreateManagedBotLimitTitle);
                        SpannableStringBuilder replaceSingleLink = AndroidUtilities.replaceSingleLink(isPremium ? LocaleController.formatString(R.string.CreateManagedBotLimitText, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get())) : LocaleController.formatString(R.string.CreateManagedBotLimitTextPremium, Integer.valueOf(messagesController2.config.botsCreateLimitPremium.get()), Integer.valueOf(messagesController2.config.botsCreateLimitDefault.get())), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var2), new np(f3Var2, 2));
                        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(29, f3Var2, context);
                        if (replaceSingleLink == null) {
                            replaceSingleLink = new SpannableStringBuilder(replaceSingleLink);
                        }
                        int charSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(replaceSingleLink, "@BotFather");
                        if (charSequenceIndexOf >= 0) {
                            replaceSingleLink.setSpan(new org.telegram.ui.Cells.i(b6Var2, wqVar, 6), charSequenceIndexOf, charSequenceIndexOf + 10, 33);
                        }
                        gc M = ocVar.M(string, replaceSingleLink, i12);
                        M.j = 8000;
                        M.j();
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("FLOOD_WAIT_")) {
                            new oc(f3Var2.topBulletinContainer, b6Var2).M(LocaleController.getString(R.string.CreateManagedBotLimitTitle), LocaleController.formatString(R.string.CreateManagedBotLimitTextTime, LocaleController.formatDuration(Integer.parseInt(tL_error.text.substring(11)))), R.raw.error).j();
                        } else if ("MANAGER_PERMISSION_MISSING".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.User user3 = user;
                            if (TextUtils.isEmpty(UserObject.getPublicUsername(user3))) {
                                userName = UserObject.getUserName(user3);
                            } else {
                                userName = "@" + UserObject.getPublicUsername(user3);
                            }
                            new oc(f3Var2.topBulletinContainer, b6Var2).Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, userName), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var2))).j();
                        } else {
                            org.telegram.ui.Cells.j2.s(f3Var2.topBulletinContainer, b6Var2, tL_error, false);
                        }
                    }
                    AndroidUtilities.hideKeyboard(f3Var2.getCurrentFocus());
                }
            }
        }, 1024);
    }
}
