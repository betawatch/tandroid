package dg;

import ag.n0;
import ag.q0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cg.l2;
import f2.o1;
import f2.y0;
import gg.o;
import h7.z5;
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
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h extends xf.b {
    public final c6 d;
    public final Context e;
    public zk0 f;
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
        n0 n0Var = new n0(this, 7);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(23, messagesStorage, n0Var));
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f;
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

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i10);
        int i12 = o1Var.f;
        View view = o1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                gg.c cVar = (gg.c) view;
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
                view.setLayoutParams(new y0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((gg.e) view).setLetter(gVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((iw0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    l8 l8Var = (l8) view;
                    l8Var.e(g6.v6, g6.u6);
                    l8Var.m(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, z5.c(-2.0f, -1));
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
                    q0 q0Var = gVar.m;
                    r3 r3Var = s3Var.b;
                    r3Var.c(str2, false, true);
                    r3Var.setOnClickListener(q0Var);
                    r3Var.setVisibility(0);
                }
            }
            this.s = s3Var;
            return;
        }
        o oVar = (o) view;
        dq dqVar = gVar.r;
        if (dqVar != null) {
            CharSequence charSequence = gVar.g;
            String str3 = gVar.h;
            oVar.v.setVisibility(8);
            oVar.C = null;
            oVar.D = null;
            n9 n9Var = oVar.c;
            n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            n9Var.setImageDrawable(dqVar);
            eg.c cVar2 = oVar.d;
            cVar2.k(charSequence);
            boolean[] zArr = oVar.r;
            zArr[0] = false;
            oVar.setSubtitle(str3);
            oVar.e.setTextColor(g6.v0(zArr[0] ? g6.n5 : g6.r5, oVar.a));
            bp bpVar = oVar.s;
            if (bpVar != null) {
                bpVar.setAlpha(1.0f);
            }
            cVar2.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                oVar.setUser(user);
                String str4 = gVar.h;
                if (str4 != null) {
                    oVar.setSubtitle(str4);
                    oVar.e.setTextColor(g6.v0(g6.r5, this.d));
                }
            } else {
                TLRPC.Chat chat = gVar.e;
                if (chat != null) {
                    oVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            oVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            oVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            oVar.h(F(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            oVar.h(F(chat3), chat3);
                        }
                    }
                }
            }
        }
        oVar.c(gVar.k, false);
        oVar.i(1.0f, false);
        int i15 = i10 + 1;
        oVar.setDivider(i15 >= this.h.size() || ((g) this.h.get(i15)).a == i12);
        if (i15 < this.h.size() && ((g) this.h.get(i15)).a == 7) {
            oVar.setDivider(false);
        }
        oVar.setOptions(gVar.n);
        l2 l2Var = gVar.o;
        l2 l2Var2 = gVar.p;
        ImageView imageView = oVar.A;
        ImageView imageView2 = oVar.x;
        boolean z11 = l2Var != null;
        oVar.w = z11;
        imageView2.setVisibility((z11 && oVar.B) ? 0 : 8);
        imageView2.setOnClickListener(l2Var);
        z10 = l2Var2 != null;
        oVar.y = z10;
        if (z10 && oVar.B) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(l2Var2);
        oVar.g(this.x, false);
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        View oVar;
        Context context = this.e;
        if (i10 == -1) {
            oVar = new View(context);
        } else if (i10 == 3) {
            oVar = new o(this.e, this.v, this.w, this.d, this.r);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                iw0 iw0Var = new iw0(context, null, 1, c6Var);
                iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                iw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                iw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                oVar = iw0Var;
            } else if (i10 == 7) {
                oVar = new gg.e(context, c6Var);
            } else if (i10 == 6) {
                oVar = new gg.c(context, c6Var);
            } else if (i10 == 8) {
                oVar = new s3(context, c6Var);
            } else if (i10 == 9) {
                l8 l8Var = new l8(context, c6Var);
                l8Var.n = 16;
                l8Var.w = 19;
                oVar = l8Var;
            } else {
                oVar = i10 == 10 ? new FrameLayout(context) : new View(context);
            }
        }
        return new lk0(oVar);
    }

    @Override // f2.q0
    public final void y(o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof o) {
            ((o) view).g(this.x, false);
        }
    }
}
