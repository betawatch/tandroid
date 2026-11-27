// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ed2 extends e implements fn7 {
    public i29 E;
    public final ArrayList F;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public final long c;
    public ArrayList d;
    public FrameLayout e;
    public d79 f;
    public dd2 h;
    public final ArrayList n;
    public LinearLayout r;
    public int s;
    public byte w;
    public i29 x;
    public i29 y;

    public ed2(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.F = new ArrayList();
        this.c = bundle.getLong("chat_id", 0L);
    }

    public final void Z(int i, boolean z) {
        if (this.s != i) {
            this.s = i;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z2 = true;
                if (i2 >= arrayList.size()) {
                    break;
                }
                i29 i29Var = (i29) arrayList.get(i2);
                if (i != i2) {
                    z2 = false;
                }
                i29Var.a(z2, z);
                i2++;
            }
            ArrayList arrayList2 = this.n;
            if (i == 1) {
                if (z) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                            this.d.add(tL_availableReaction.reaction);
                        }
                    }
                    if (this.d.isEmpty() && arrayList2.size() >= 2) {
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                    }
                }
                dd2 dd2Var = this.h;
                if (dd2Var != null && z) {
                    dd2Var.p(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                dd2 dd2Var2 = this.h;
                if (dd2Var2 != null && z) {
                    dd2Var2.q(2, arrayList2.size() + 1);
                }
            }
            dd2 dd2Var3 = this.h;
            if (dd2Var3 != null && z) {
                dd2Var3.g(1);
            }
            dd2 dd2Var4 = this.h;
            if (dd2Var4 == null || z) {
                return;
            }
            dd2Var4.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(ob6.M0(2131746114, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n.addAll(getMediaDataController().n);
        mf5 mf5Var = new mf5(context);
        mf5Var.setText(ob6.M0(2131753752, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(1);
        this.r.setClickable(true);
        i29 i29Var = new i29(context, null);
        this.x = i29Var;
        final byte b2 = 0;
        i29Var.c(ob6.M0(2131754284, null), false, true);
        i29 i29Var2 = new i29(context, null);
        this.y = i29Var2;
        i29Var2.c(ob6.M0(2131745020, null), false, true);
        i29 i29Var3 = new i29(context, null);
        this.E = i29Var3;
        i29Var3.c(ob6.M0(2131747906, null), false, false);
        this.r.addView(mf5Var, tre.o(-1, -2));
        this.r.addView(this.x, tre.o(-1, -2));
        this.r.addView(this.y, tre.o(-1, -2));
        this.r.addView(this.E, tre.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.E);
        this.x.setOnClickListener(new View.OnClickListener(this) { // from class: bd2
            public final /* synthetic */ ed2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                final ed2 ed2Var = this.b;
                switch (b3) {
                    case 0:
                        final byte b4 = 2;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b4;
                                ed2 ed2Var2 = ed2Var;
                                switch (b5) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final byte b5 = 1;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b5;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final byte b6 = 0;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b6;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: bd2
            public final /* synthetic */ ed2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                final ed2 ed2Var = this.b;
                switch (b3) {
                    case 0:
                        final byte b4 = 2;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b4;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final byte b5 = 1;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b5;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final byte b6 = 0;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b6;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        final byte b3 = 2;
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: bd2
            public final /* synthetic */ ed2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                final ed2 ed2Var = this.b;
                switch (b32) {
                    case 0:
                        final byte b4 = 2;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b4;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 1:
                        final byte b5 = 1;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b5;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final byte b6 = 0;
                        hl.c3(new Runnable() { // from class: cd2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b52 = b6;
                                ed2 ed2Var2 = ed2Var;
                                switch (b52) {
                                    case 0:
                                        ed2Var2.Z(2, true);
                                        break;
                                    case 1:
                                        ed2Var2.Z(1, true);
                                        break;
                                    default:
                                        ed2Var2.Z(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        i29 i29Var4 = this.x;
        int i = aob.d6;
        int w0 = aob.w0(null, i, false);
        int i2 = aob.i6;
        yob.R(i29Var4, aob.g0(w0, aob.w0(null, i2, false)), yob.M(i), yob.M(i2), null);
        yob.R(this.y, aob.g0(aob.w0(null, i, false), aob.w0(null, i2, false)), yob.M(i), yob.M(i2), null);
        yob.R(this.E, aob.g0(aob.w0(null, i, false), aob.w0(null, i2, false)), yob.M(i), yob.M(i2), null);
        Z(this.w, false);
        d79 d79Var = new d79(context, null);
        this.f = d79Var;
        d79Var.setLayoutManager(new x46());
        d79 d79Var2 = this.f;
        dd2 dd2Var = new dd2(this, context);
        this.h = dd2Var;
        d79Var2.setAdapter(dd2Var);
        this.f.setOnItemClickListener(new u(this, (byte) 11));
        frameLayout.addView(this.f, tre.g());
        this.f.s1();
        this.f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.e;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == jn7.Y4) {
                ArrayList arrayList = this.n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().n);
                this.h.f();
                return;
            }
            if (i == jn7.y1 && ((Long) objArr[0]).longValue() == (-this.c)) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var == null || wk5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 4), aob.d6, aob.G6, aob.z6, aob.i6, aob.a7, aob.B6, aob.p7, aob.f6, aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        uc7 messagesController = getMessagesController();
        long j = this.c;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        this.a = M0;
        if (M0 == null) {
            TLRPC.Chat O = jf7.Y(this.currentAccount).O(j);
            this.a = O;
            if (O == null) {
                return false;
            }
            getMessagesController().a4(this.a, true);
            if (this.b == null) {
                TLRPC.ChatFull C0 = jf7.Y(this.currentAccount).C0(this.c, xc2.T(this.a), new CountDownLatch(1), false, false, 0);
                this.b = C0;
                if (C0 == null) {
                    return false;
                }
            }
        }
        getNotificationCenter().b(this, jn7.Y4);
        getNotificationCenter().b(this, jn7.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        uc7 messagesController = getMessagesController();
        int i = this.s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j = this.c;
        tL_messages_setChatAvailableReactions.peer = messagesController.j1(-j);
        if (i == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = (String) arrayList.get(i2);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new p87(messagesController, j, tL_messages_setChatAvailableReactions, (byte) 5));
        getNotificationCenter().n(this, jn7.Y4);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
