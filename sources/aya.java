// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class aya {
    public final tl a;
    public fm2 b;

    public aya(int i, View view) {
        this.a = new tl(gl.L(i), view);
    }

    public final tl a(TLObject tLObject, int i, boolean z) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i, z) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i, z) : b(null, null, i, z);
    }

    public final tl b(TLRPC.User user, TLRPC.Chat chat, int i, boolean z) {
        tl tlVar = this.a;
        if (chat != null) {
            if (chat.verified) {
                fm2 fm2Var = this.b;
                if (fm2Var == null) {
                    fm2Var = new fm2(bkb.e1, bkb.h1);
                }
                this.b = fm2Var;
                tlVar.g(fm2Var, z);
                tlVar.k(null);
                return tlVar;
            }
            if (cf3.f(chat.emoji_status) != 0) {
                tlVar.j(cf3.f(chat.emoji_status), z);
                tlVar.k(Integer.valueOf(i));
                return tlVar;
            }
        }
        if (user != null) {
            if (user.verified) {
                fm2 fm2Var2 = this.b;
                if (fm2Var2 == null) {
                    fm2Var2 = new fm2(bkb.e1, bkb.h1);
                }
                this.b = fm2Var2;
                tlVar.g(fm2Var2, z);
                tlVar.k(null);
                return tlVar;
            }
            if (cf3.f(user.emoji_status) != 0) {
                tlVar.j(cf3.f(user.emoji_status), z);
                tlVar.k(Integer.valueOf(i));
                return tlVar;
            }
            if (user.premium) {
                tlVar.g(nh8.d().e, z);
                tlVar.k(Integer.valueOf(i));
                return tlVar;
            }
        }
        tlVar.g(null, z);
        tlVar.k(null);
        return tlVar;
    }

    public aya(FrameLayout frameLayout) {
        this(18, frameLayout);
    }
}
