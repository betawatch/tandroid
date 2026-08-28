package cg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bg.i;
import bg.t2;
import bg.u1;
import f2.a1;
import f2.q1;
import fg.p;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends wf.b {
    public final b6 d;
    public final Context e;
    public wk0 f;
    public ArrayList h;
    public boolean r;
    public v3 s;
    public final boolean v;
    public boolean w;
    public final HashMap n = new HashMap();
    public boolean x = true;

    public h(Context context, b6 b6Var, boolean z10) {
        this.e = context;
        this.v = z10;
        this.d = b6Var;
        i iVar = new i(this, 5);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(13, messagesStorage, iVar));
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 3 || i9 == 6 || i9 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i9;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i9 = chatFull.participants_count) > 0) {
            return i9;
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

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        ArrayList arrayList = this.h;
        if (arrayList == null || i9 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        boolean z10;
        int i10;
        ArrayList arrayList = this.h;
        if (arrayList == null || i9 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i9);
        int i11 = q1Var.f;
        View view = q1Var.a;
        int i12 = 8;
        if (i11 != 3) {
            if (i11 == 6) {
                fg.c cVar = (fg.c) view;
                z10 = i9 < this.h.size() - 1 && (i10 = i9 + 1) < this.h.size() - 1 && ((g) this.h.get(i10)).a != 7;
                cVar.s = gVar.f;
                cVar.f();
                cVar.setDivider(z10);
                cVar.c(gVar.k, false);
                return;
            }
            if (i11 == -1) {
                int i13 = gVar.l;
                if (i13 < 0) {
                    i13 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new a1(-1, i13));
                return;
            }
            if (i11 == 7) {
                ((fg.e) view).setLetter(gVar.g);
                return;
            }
            if (i11 == 5) {
                try {
                    ((gw0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i11 != 8) {
                if (i11 == 9) {
                    p8 p8Var = (p8) view;
                    p8Var.e(f6.v6, f6.u6);
                    p8Var.m(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i11 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, e6.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            v3 v3Var = (v3) view;
            if (TextUtils.equals(v3Var.getText(), gVar.g)) {
                String str = gVar.h;
                if (str == null) {
                    str = "";
                }
                v3Var.b(str, gVar.m);
            } else {
                v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, v3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    String str2 = gVar.h;
                    u1 u1Var = gVar.m;
                    u3 u3Var = v3Var.b;
                    u3Var.c(str2, false, true);
                    u3Var.setOnClickListener(u1Var);
                    u3Var.setVisibility(0);
                }
            }
            this.s = v3Var;
            return;
        }
        p pVar = (p) view;
        fq fqVar = gVar.r;
        if (fqVar != null) {
            CharSequence charSequence = gVar.g;
            String str3 = gVar.h;
            pVar.v.setVisibility(8);
            pVar.C = null;
            pVar.D = null;
            o9 o9Var = pVar.c;
            o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            o9Var.setImageDrawable(fqVar);
            dg.c cVar2 = pVar.d;
            cVar2.k(charSequence);
            boolean[] zArr = pVar.r;
            zArr[0] = false;
            pVar.setSubtitle(str3);
            pVar.e.setTextColor(f6.v0(zArr[0] ? f6.n5 : f6.r5, pVar.a));
            dp dpVar = pVar.s;
            if (dpVar != null) {
                dpVar.setAlpha(1.0f);
            }
            cVar2.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                pVar.setUser(user);
                String str4 = gVar.h;
                if (str4 != null) {
                    pVar.setSubtitle(str4);
                    pVar.e.setTextColor(f6.v0(f6.r5, this.d));
                }
            } else {
                TLRPC.Chat chat = gVar.e;
                if (chat != null) {
                    pVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            pVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            pVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            pVar.h(F(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            pVar.h(F(chat3), chat3);
                        }
                    }
                }
            }
        }
        pVar.c(gVar.k, false);
        pVar.i(1.0f, false);
        int i14 = i9 + 1;
        pVar.setDivider(i14 >= this.h.size() || ((g) this.h.get(i14)).a == i11);
        if (i14 < this.h.size() && ((g) this.h.get(i14)).a == 7) {
            pVar.setDivider(false);
        }
        pVar.setOptions(gVar.n);
        t2 t2Var = gVar.o;
        t2 t2Var2 = gVar.p;
        ImageView imageView = pVar.A;
        ImageView imageView2 = pVar.x;
        boolean z11 = t2Var != null;
        pVar.w = z11;
        imageView2.setVisibility((z11 && pVar.B) ? 0 : 8);
        imageView2.setOnClickListener(t2Var);
        z10 = t2Var2 != null;
        pVar.y = z10;
        if (z10 && pVar.B) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(t2Var2);
        pVar.g(this.x, false);
    }

    @Override // f2.r0
    public final q1 x(ViewGroup viewGroup, int i9) {
        View pVar;
        Context context = this.e;
        if (i9 == -1) {
            pVar = new View(context);
        } else if (i9 == 3) {
            pVar = new p(this.e, this.v, this.w, this.d, this.r);
        } else {
            b6 b6Var = this.d;
            if (i9 == 5) {
                gw0 gw0Var = new gw0(context, null, 1, b6Var);
                gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                gw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                gw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                pVar = gw0Var;
            } else if (i9 == 7) {
                pVar = new fg.e(context, b6Var);
            } else if (i9 == 6) {
                pVar = new fg.c(context, b6Var);
            } else if (i9 == 8) {
                pVar = new v3(context, b6Var);
            } else if (i9 == 9) {
                p8 p8Var = new p8(context, b6Var);
                p8Var.n = 16;
                p8Var.w = 19;
                pVar = p8Var;
            } else {
                pVar = i9 == 10 ? new FrameLayout(context) : new View(context);
            }
        }
        return new ik0(pVar);
    }

    @Override // f2.r0
    public final void y(q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof p) {
            ((p) view).g(this.x, false);
        }
    }
}
