package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gh.w6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ b6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ TL_payments.connectedBotStarRef h;
    public final /* synthetic */ Object n;

    public /* synthetic */ j3(int i9, org.telegram.ui.ActionBar.f3 f3Var, b6 b6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i9;
        this.c = f3Var;
        this.d = b6Var;
        this.n = linearLayout;
        this.e = j10;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        switch (this.a) {
            case 0:
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (!connectedbotstarref.revoked) {
                    cVar.run();
                    break;
                } else {
                    int i9 = this.b;
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i9).loadFullUser(user, 0, true, new f3(this.c, this.f, i9, this.e, this.d, 0));
                        break;
                    }
                }
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) this.n;
                int i10 = this.b;
                gh.c0 g10 = gh.c0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
                org.telegram.ui.ActionBar.f3 f3Var = this.c;
                ViewGroup containerView = f3Var.getContainerView();
                b6 b6Var = this.d;
                x60 F = x60.F(containerView, b6Var, linearLayout);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i11);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                j10 = -chat.id;
                            }
                        }
                        i11 = i12;
                    }
                    F.g(tLObject, j10 == this.e, new w6(i10, j10, this.f, this.h, f3Var, b6Var));
                    i11 = i12;
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                break;
        }
    }

    public /* synthetic */ j3(TL_payments.connectedBotStarRef connectedbotstarref, int i9, org.telegram.ui.ActionBar.f3 f3Var, Context context, long j10, b6 b6Var, androidx.car.app.utils.c cVar) {
        this.h = connectedbotstarref;
        this.b = i9;
        this.c = f3Var;
        this.f = context;
        this.e = j10;
        this.d = b6Var;
        this.n = cVar;
    }
}
