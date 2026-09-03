package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cg.h0;
import cg.n;
import f2.l1;
import f2.w0;
import gg.i2;
import java.util.ArrayList;
import java.util.HashMap;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h extends bg.c {
    public final f6 d;
    public final Context e;
    public rl0 f;
    public ArrayList h;
    public boolean r;
    public t3 s;
    public final boolean v;
    public boolean w;
    public final HashMap n = new HashMap();
    public boolean x = true;

    public h(Context context, f6 f6Var, boolean z4) {
        this.e = context;
        this.v = z4;
        this.d = f6Var;
        h0 h0Var = new h0(this, 12);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new ff.c(6, messagesStorage, h0Var));
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(l1 l1Var) {
        int i10 = l1Var.f;
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

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(l1 l1Var, int i10) {
        boolean z4;
        int i11;
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i10);
        int i12 = l1Var.f;
        View view = l1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                kg.c cVar = (kg.c) view;
                z4 = i10 < this.h.size() - 1 && (i11 = i10 + 1) < this.h.size() - 1 && ((g) this.h.get(i11)).a != 7;
                cVar.s = gVar.f;
                cVar.f();
                cVar.setDivider(z4);
                cVar.c(gVar.k, false);
                return;
            }
            if (i12 == -1) {
                int i14 = gVar.l;
                if (i14 < 0) {
                    i14 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new w0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((kg.e) view).setLetter(gVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((zw0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    n8 n8Var = (n8) view;
                    n8Var.e(j6.v6, j6.u6);
                    n8Var.m(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, b6.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            t3 t3Var = (t3) view;
            if (TextUtils.equals(t3Var.getText(), gVar.g)) {
                String str = gVar.h;
                if (str == null) {
                    str = "";
                }
                t3Var.b(str, gVar.m);
            } else {
                t3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, t3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    String str2 = gVar.h;
                    n nVar = gVar.m;
                    s3 s3Var = t3Var.b;
                    s3Var.c(str2, false, true);
                    s3Var.setOnClickListener(nVar);
                    s3Var.setVisibility(0);
                }
            }
            this.s = t3Var;
            return;
        }
        kg.n nVar2 = (kg.n) view;
        mq mqVar = gVar.r;
        if (mqVar != null) {
            CharSequence charSequence = gVar.g;
            String str3 = gVar.h;
            nVar2.v.setVisibility(8);
            nVar2.D = null;
            nVar2.E = null;
            p9 p9Var = nVar2.c;
            p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            p9Var.setImageDrawable(mqVar);
            ig.c cVar2 = nVar2.d;
            cVar2.k(charSequence);
            boolean[] zArr = nVar2.r;
            zArr[0] = false;
            nVar2.setSubtitle(str3);
            nVar2.e.setTextColor(j6.v0(zArr[0] ? j6.n5 : j6.r5, nVar2.a));
            kp kpVar = nVar2.s;
            if (kpVar != null) {
                kpVar.setAlpha(1.0f);
            }
            cVar2.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                nVar2.setUser(user);
                String str4 = gVar.h;
                if (str4 != null) {
                    nVar2.setSubtitle(str4);
                    nVar2.e.setTextColor(j6.v0(j6.r5, this.d));
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
        i2 i2Var = gVar.o;
        i2 i2Var2 = gVar.p;
        ImageView imageView = nVar2.B;
        ImageView imageView2 = nVar2.x;
        boolean z10 = i2Var != null;
        nVar2.w = z10;
        imageView2.setVisibility((z10 && nVar2.C) ? 0 : 8);
        imageView2.setOnClickListener(i2Var);
        z4 = i2Var2 != null;
        nVar2.y = z4;
        if (z4 && nVar2.C) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(i2Var2);
        nVar2.g(this.x, false);
    }

    @Override // f2.o0
    public final l1 x(ViewGroup viewGroup, int i10) {
        View nVar;
        Context context = this.e;
        if (i10 == -1) {
            nVar = new View(context);
        } else if (i10 == 3) {
            nVar = new kg.n(this.e, this.v, this.w, this.d, this.r);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                zw0 zw0Var = new zw0(context, null, 1, f6Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                zw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                nVar = zw0Var;
            } else if (i10 == 7) {
                nVar = new kg.e(context, f6Var);
            } else if (i10 == 6) {
                nVar = new kg.c(context, f6Var);
            } else if (i10 == 8) {
                nVar = new t3(context, f6Var);
            } else if (i10 == 9) {
                n8 n8Var = new n8(context, f6Var);
                n8Var.n = 16;
                n8Var.w = 19;
                nVar = n8Var;
            } else {
                nVar = i10 == 10 ? new FrameLayout(context) : new View(context);
            }
        }
        return new dl0(nVar);
    }

    @Override // f2.o0
    public final void y(l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof kg.n) {
            ((kg.n) view).g(this.x, false);
        }
    }
}
