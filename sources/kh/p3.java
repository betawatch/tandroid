package kh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class p3 extends vk0 {
    public boolean d;
    public String f;
    public String h;
    public TLRPC.User n;
    public boolean r;
    public final /* synthetic */ q3 w;
    public final ArrayList c = new ArrayList();
    public int e = -1;
    public final ColorDrawable s = new ColorDrawable(285212671);
    public final f1 v = new f1(this, 7);

    public p3(q3 q3Var) {
        this.w = q3Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E() {
        int i9 = this.w.a;
        if (this.d) {
            return;
        }
        this.d = true;
        F(true);
        MessagesController messagesController = MessagesController.getInstance(i9);
        String str = messagesController.imageSearchBot;
        if (this.n == null) {
            TLObject userOrChat = messagesController.getUserOrChat(str);
            if (userOrChat instanceof TLRPC.User) {
                this.n = (TLRPC.User) userOrChat;
            }
        }
        TLRPC.User user = this.n;
        if (user == null && !this.r) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = str;
            this.e = ConnectionsManager.getInstance(i9).sendRequest(tL_contacts_resolveUsername, new bg.j0(this, messagesController, 16));
        } else {
            if (user == null) {
                return;
            }
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.n);
            String str2 = this.f;
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            String str3 = this.h;
            String str4 = str3 != null ? str3 : "";
            tL_messages_getInlineBotResults.offset = str4;
            this.e = ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getInlineBotResults, new o3(0, this, TextUtils.isEmpty(str4)));
        }
    }

    public abstract void F(boolean z10);

    @Override // f2.r0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) q1Var.a;
        TLObject tLObject = (TLObject) this.c.get(i9);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.s;
        if (z10) {
            o9Var.h(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
            return;
        }
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            o9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, null);
        } else {
            if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                o9Var.b();
                return;
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                o9Var.h(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                o9Var.b();
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new ik0(new gh.d5(this.w.getContext(), 1));
    }
}
