package fg;

import ag.i0;
import ag.n;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import eg.j2;
import f2.n1;
import f2.x0;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends zf.b {
    public final c6 d;
    public final Context e;
    public jl0 f;
    public ArrayList h;
    public boolean r;
    public s3 s;
    public final boolean v;
    public boolean w;
    public final HashMap n = new HashMap();
    public boolean x = true;

    public h(Context context, c6 c6Var, boolean z10) {
        this.e = context;
        this.v = z10;
        this.d = c6Var;
        i0 i0Var = new i0(this, 12);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new ef.c(6, messagesStorage, i0Var));
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.n;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        ArrayList arrayList = this.h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        m(this.h.size() - 1);
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(n1 n1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i10);
        int i12 = n1Var.f;
        View view = n1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                ig.c cVar = (ig.c) view;
                z10 = i10 < this.h.size() - 1 && (i11 = i10 + 1) < this.h.size() - 1 && ((g) this.h.get(i11)).a != 7;
                cVar.s = gVar.f;
                cVar.f();
                cVar.setDivider(z10);
                cVar.c(gVar.k, false);
                return;
            }
            if (i12 == -1) {
                int i14 = gVar.l;
                if (i14 < 0) {
                    i14 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new x0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((ig.e) view).setLetter(gVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((qw0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    m8 m8Var = (m8) view;
                    m8Var.e(g6.v6, g6.u6);
                    m8Var.m(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, f6.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            s3 s3Var = (s3) view;
            if (TextUtils.equals(s3Var.getText(), gVar.g)) {
                String str = gVar.h;
                if (str == null) {
                    str = "";
                }
                s3Var.b(str, gVar.m);
            } else {
                s3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, s3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    String str2 = gVar.h;
                    n nVar = gVar.m;
                    r3 r3Var = s3Var.b;
                    r3Var.c(str2, false, true);
                    r3Var.setOnClickListener(nVar);
                    r3Var.setVisibility(0);
                }
            }
            this.s = s3Var;
            return;
        }
        ig.n nVar2 = (ig.n) view;
        jq jqVar = gVar.r;
        if (jqVar != null) {
            CharSequence charSequence = gVar.g;
            String str3 = gVar.h;
            nVar2.v.setVisibility(8);
            nVar2.C = null;
            nVar2.D = null;
            t9 t9Var = nVar2.c;
            t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            t9Var.setImageDrawable(jqVar);
            gg.c cVar2 = nVar2.d;
            cVar2.k(charSequence);
            boolean[] zArr = nVar2.r;
            zArr[0] = false;
            nVar2.setSubtitle(str3);
            nVar2.e.setTextColor(g6.v0(zArr[0] ? g6.n5 : g6.r5, nVar2.a));
            hp hpVar = nVar2.s;
            if (hpVar != null) {
                hpVar.setAlpha(1.0f);
            }
            cVar2.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                nVar2.setUser(user);
                String str4 = gVar.h;
                if (str4 != null) {
                    nVar2.setSubtitle(str4);
                    nVar2.e.setTextColor(g6.v0(g6.r5, this.d));
                }
            } else {
                TLRPC.Chat chat = gVar.e;
                if (chat != null) {
                    nVar2.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            nVar2.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            nVar2.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            nVar2.h(F(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            nVar2.h(F(chat3), chat3);
                        }
                    }
                }
            }
        }
        nVar2.c(gVar.k, false);
        nVar2.i(1.0f, false);
        int i15 = i10 + 1;
        nVar2.setDivider(i15 >= this.h.size() || ((g) this.h.get(i15)).a == i12);
        if (i15 < this.h.size() && ((g) this.h.get(i15)).a == 7) {
            nVar2.setDivider(false);
        }
        nVar2.setOptions(gVar.n);
        j2 j2Var = gVar.o;
        j2 j2Var2 = gVar.p;
        ImageView imageView = nVar2.A;
        ImageView imageView2 = nVar2.x;
        boolean z11 = j2Var != null;
        nVar2.w = z11;
        imageView2.setVisibility((z11 && nVar2.B) ? 0 : 8);
        imageView2.setOnClickListener(j2Var);
        z10 = j2Var2 != null;
        nVar2.y = z10;
        if (z10 && nVar2.B) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(j2Var2);
        nVar2.g(this.x, false);
    }

    @Override // f2.p0
    public final n1 x(ViewGroup viewGroup, int i10) {
        View nVar;
        Context context = this.e;
        if (i10 == -1) {
            nVar = new View(context);
        } else if (i10 == 3) {
            nVar = new ig.n(this.e, this.v, this.w, this.d, this.r);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                qw0 qw0Var = new qw0(context, null, 1, c6Var);
                qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                qw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                qw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                nVar = qw0Var;
            } else if (i10 == 7) {
                nVar = new ig.e(context, c6Var);
            } else if (i10 == 6) {
                nVar = new ig.c(context, c6Var);
            } else if (i10 == 8) {
                nVar = new s3(context, c6Var);
            } else if (i10 == 9) {
                m8 m8Var = new m8(context, c6Var);
                m8Var.n = 16;
                m8Var.w = 19;
                nVar = m8Var;
            } else {
                nVar = i10 == 10 ? new FrameLayout(context) : new View(context);
            }
        }
        return new vk0(nVar);
    }

    @Override // f2.p0
    public final void y(n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof ig.n) {
            ((ig.n) view).g(this.x, false);
        }
    }
}
