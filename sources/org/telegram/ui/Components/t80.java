package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t80 extends org.telegram.ui.ActionBar.k3 {
    public static ArrayList I;
    public static long J;
    public static long K;
    public static int L;
    public TLRPC.InputPeer E;
    public boolean F;
    public boolean G;
    public r80 H;
    public Drawable b;
    public boolean c;
    public int d;
    public t00 e;
    public p80 f;
    public TextView h;
    public TextView n;
    public ArrayList r;
    public boolean s;
    public int v;
    public int w;
    public TLRPC.Peer x;
    public TLRPC.Peer y;

    public static /* synthetic */ void m(t80 t80Var, r80 r80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(t80Var.currentAccount).getInputPeer(MessageObject.getPeerId(t80Var.x));
        if (t80Var.w != 2) {
            t80Var.E = inputPeer;
        } else if (t80Var.x != t80Var.y) {
            r80Var.a(inputPeer, t80Var.r.size() > 1, false, false);
        }
        t80Var.dismiss();
    }

    public static /* synthetic */ void n(t80 t80Var) {
        t80Var.E = MessagesController.getInstance(t80Var.currentAccount).getInputPeer(MessageObject.getPeerId(t80Var.x));
        t80Var.F = true;
        t80Var.dismiss();
    }

    public static void o(t80 t80Var) {
        p80 p80Var = t80Var.f;
        if (t80Var.w == 0) {
            return;
        }
        if (p80Var.getChildCount() <= 0) {
            int paddingTop = p80Var.getPaddingTop();
            t80Var.v = paddingTop;
            p80Var.setTopGlowOffset(paddingTop);
            t80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = p80Var.getChildAt(0);
        vl0 vl0Var = (vl0) p80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        }
        if (t80Var.v != i10) {
            t80Var.h.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            t80Var.n.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            t80Var.v = i10;
            p80Var.setTopGlowOffset(i10);
            t80Var.containerView.invalidate();
        }
    }

    public static void t(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 240000) {
            booleanCallback.run(I.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        e2Var.setOnCancelListener(new m80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new bi.e0(e2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            e2Var.r(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer, r80 r80Var) {
        if (context != null) {
            if (L == accountInstance.getCurrentAccount() && K == j10 && I != null && SystemClock.elapsedRealtime() - J < 300000) {
                if (I.size() != 1 || i10 == 0) {
                    v(context, j10, I, r2Var, i10, peer, r80Var);
                    return;
                } else {
                    r80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) I.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            e2Var.setOnCancelListener(new m80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new l80(e2Var, accountInstance, r80Var, j10, context, r2Var, i10, peer)), 0));
            try {
                e2Var.r(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.r2 r2Var, int i10, TLRPC.Peer peer, r80 r80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog trVar = new tr(r2Var, arrayList, j10, r80Var);
            if (r2Var.getParentActivity() != null) {
                r2Var.showDialog(trVar);
                return;
            } else {
                trVar.show();
                return;
            }
        }
        t80 t80Var = new t80(context, false);
        t80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        t80Var.r = arrayList2;
        t80Var.H = r80Var;
        t80Var.w = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        t80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) t80Var.r.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        t80Var.y = peer2;
                        t80Var.x = peer2;
                        break;
                    }
                    i12++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) t80Var.r.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        t80Var.y = peer3;
                        t80Var.x = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                t80Var.x = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = t80Var.b;
            i11 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            t80Var.c = true;
            t80Var.d = x02;
            t80Var.x = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        t80Var.fixNavigationBar(i11);
        if (t80Var.w == 0) {
            n80 n80Var = new n80(t80Var, context);
            n80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n80Var);
            t80Var.setCustomView(nestedScrollView);
            viewGroup = n80Var;
        } else {
            o80 o80Var = new o80(t80Var, context);
            t80Var.containerView = o80Var;
            o80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = t80Var.containerView;
            int i14 = t80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = o80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(t80Var.currentAccount).getChat(Long.valueOf(-j10));
        p80 p80Var = new p80(t80Var, context);
        t80Var.f = p80Var;
        t80Var.getContext();
        p80Var.setLayoutManager(new s4.c0(t80Var.w == 0 ? 0 : 1, false));
        p80Var.setAdapter(new s80(t80Var, context));
        p80Var.setVerticalScrollBarEnabled(false);
        p80Var.setClipToPadding(false);
        p80Var.setEnabled(true);
        p80Var.setSelectorDrawableColor(0);
        org.telegram.ui.ActionBar.f7.m(p80Var, 21, org.telegram.ui.ActionBar.y6.A5, null);
        p80Var.setOnScrollListener(new q80(t80Var));
        p80Var.setOnItemClickListener(new di.x4(11, t80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(p80Var, gb1.h(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            p80Var.setSelectorDrawableColor(0);
            p80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ak0 ak0Var = new ak0(context);
            ak0Var.setAutoRepeat(true);
            ak0Var.f(R.raw.utyan_schedule, 120, 120, null);
            ak0Var.d();
            viewGroup.addView(ak0Var, gb1.x(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        t80Var.h = textView;
        org.telegram.messenger.vh.j(20.0f, 1, textView);
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.ng, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, gb1.x(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, gb1.h(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(t80Var.getContext());
        t80Var.n = textView2;
        if (i10 == 2) {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.og, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.r5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = t80Var.r.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) t80Var.r.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(t80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        t80Var.n.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        org.telegram.ui.ActionBar.f7.H(t80Var.n, org.telegram.ui.ActionBar.y6.k5, null);
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (t80Var.r.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                t80Var.f.setVisibility(8);
            }
            t80Var.n.setText(sb2);
            t80Var.n.setGravity(49);
            viewGroup.addView(t80Var.n, gb1.x(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                t80Var.n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                t80Var.n.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            t80Var.n.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(t80Var.n, gb1.h(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(t80Var.f, gb1.x(t80Var.r.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(t80Var, context, false);
        t80Var.e = t00Var;
        ((View) t00Var.c).setOnClickListener(new ga(21, t80Var, r80Var));
        if (t80Var.w == 0) {
            viewGroup.addView(t00Var, gb1.x(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(t80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.c).setOnClickListener(new f0(t80Var, 28));
            viewGroup.addView(t00Var2, gb1.x(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(t00Var, gb1.h(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        t80Var.w(chat, false);
        if (r2Var == null) {
            t80Var.show();
        } else if (r2Var.getParentActivity() != null) {
            r2Var.showDialog(t80Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.E;
        if (inputPeer != null) {
            this.H.a(inputPeer, this.r.size() > 1, this.F, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        Drawable drawable;
        super.onThemeColorsChanged();
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false);
            if (!this.c || (drawable = this.b) == null || x02 == this.d) {
                return;
            }
            this.d = x02;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        t00 t00Var = this.e;
        if (this.w == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.x);
        if (DialogObject.isUserDialog(peerId)) {
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
