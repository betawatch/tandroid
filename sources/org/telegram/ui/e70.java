package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class e70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.u0 L;
    public boolean M;
    public final boolean N;
    public b70 O;
    public FrameLayout a;
    public org.telegram.ui.Components.wx0 b;
    public org.telegram.ui.Components.b10 c;
    public org.telegram.ui.Components.mm0 d;
    public c70 e;
    public d70 f;
    public s4.b0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull v;
    public final long w;
    public int x;
    public int y;

    public e70(long j10) {
        super(null);
        this.n = -1;
        this.w = j10;
    }

    public static /* synthetic */ void U(e70 e70Var, View view, int i10) {
        if (e70Var.getParentActivity() == null) {
            return;
        }
        if (!e70Var.M) {
            if (i10 >= e70Var.E && i10 < e70Var.F) {
                e70Var.d0(MediaDataController.getInstance(e70Var.currentAccount).getStickerSets(e70Var.c0()).get(i10 - e70Var.E), ((org.telegram.ui.Cells.l8) view).a(), false);
            }
            if (i10 == e70Var.J) {
                e70Var.d0(e70Var.r, true, false);
                return;
            }
            return;
        }
        if (i10 > e70Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.l8) view).a();
            d70 d70Var = e70Var.f;
            e70Var.d0((TLRPC.TL_messages_stickerSet) d70Var.e.get((i10 - d70Var.d.size()) - 1), a2, false);
        } else if (i10 != e70Var.f.d.size()) {
            e70Var.d0((TLRPC.TL_messages_stickerSet) e70Var.f.d.get(i10), ((org.telegram.ui.Cells.l8) view).a(), true);
        }
    }

    public static void V(e70 e70Var, TLRPC.TL_error tL_error) {
        boolean z10 = e70Var.N;
        if (tL_error != null) {
            if (e70Var.getParentActivity() != null) {
                Activity parentActivity = e70Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = e70Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                e70Var.v.emojiset = stickerSet;
            } else {
                e70Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(e70Var.currentAccount).putGroupStickerSet(e70Var.r);
        } else if (z10) {
            e70Var.v.emojiset = null;
        } else {
            e70Var.v.stickerset = null;
        }
        e70Var.h0();
        if (z10) {
            TLRPC.ChatFull chatFull = e70Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = e70Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(e70Var.currentAccount).updateChatInfo(e70Var.v, false);
        NotificationCenter.getInstance(e70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, e70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(e70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(e70Var.v.id), Boolean.valueOf(z10));
        e70Var.finishFragment();
    }

    public static void a0(e70 e70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = e70Var.n;
        if (tL_messages_stickerSet == null) {
            if (e70Var.r != null) {
                org.telegram.messenger.v0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(e70Var), R.raw.done, 36);
            }
            e70Var.r = null;
            e70Var.s = true;
        } else {
            e70Var.r = tL_messages_stickerSet;
            e70Var.s = false;
            org.telegram.messenger.v0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(e70Var), R.raw.done, 36);
        }
        e70Var.h0();
        e70Var.f0(e70Var.r, false);
        if (i10 != -1) {
            if (!e70Var.M) {
                for (int i11 = 0; i11 < e70Var.d.getChildCount(); i11++) {
                    View childAt = e70Var.d.getChildAt(i11);
                    if (e70Var.d.T(childAt).b() == e70Var.E + i10) {
                        ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                        break;
                    }
                }
            }
            e70Var.e.m(e70Var.E + i10);
        }
        if (e70Var.n != -1) {
            if (!e70Var.M) {
                for (int i12 = 0; i12 < e70Var.d.getChildCount(); i12++) {
                    View childAt2 = e70Var.d.getChildAt(i12);
                    if (e70Var.d.T(childAt2).b() == e70Var.E + e70Var.n) {
                        ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            e70Var.e.m(e70Var.E + e70Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.N ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int c0() {
        return this.N ? 5 : 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.N ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 2));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new ig.b2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new c70(this, context);
        this.f = new d70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        this.d = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar = new s4.k();
        kVar.n(200L);
        kVar.m = true;
        this.d.setItemAnimator(kVar);
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout2, null);
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, getResourceProvider());
        this.c = b10Var;
        b10Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.a.addView(this.c, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, this.c, 1, null);
        this.b = wx0Var;
        m.g3.p(wx0Var);
        this.a.addView(this.b);
        frameLayout.addView(this.a);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new j3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        ty0Var.d0 = new z60(this, z10, tL_messages_stickerSet);
        ty0Var.D0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        ty0Var.show();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.groupStickersDidLoad) {
                long longValue = ((Long) objArr[0]).longValue();
                if (b0(this.v) == null || b0(this.v).id != longValue) {
                    return;
                }
                g0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.w) {
            if (this.v == null && b0(chatFull) != null) {
                this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
            }
            this.v = chatFull;
            g0(true);
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.N) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.J == -1;
                this.r = tL_messages_stickerSet;
                g0(false);
                if (z11) {
                    this.e.o(this.J);
                } else {
                    this.e.m(this.J);
                }
                if (z10) {
                    this.e.m(this.I);
                }
                b70 b70Var = this.O;
                b70Var.b = true;
                b70Var.invalidate();
                return;
            }
            int i10 = this.J;
            boolean z12 = i10 > 0;
            this.r = null;
            if (z12) {
                this.e.u(i10);
                if (z10) {
                    this.e.m(this.I);
                }
            }
            g0(false);
            b70 b70Var2 = this.O;
            b70Var2.b = false;
            b70Var2.invalidate();
        }
    }

    public final void g0(boolean z10) {
        c70 c70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (stickerSets.isEmpty()) {
            this.y = -1;
            this.E = -1;
            this.F = -1;
        } else {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.x = i13;
        h0();
        if (!z10 || (c70Var = this.e) == null) {
            return;
        }
        c70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        long j10;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.id;
            } else if (b0(this.v) != null) {
                j10 = b0(this.v).id;
            }
            if (j10 == 0) {
                for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                    if (stickerSets.get(i10).set.id == j10) {
                        this.n = i10;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j10 = 0;
        if (j10 == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(c0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        g0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.r != null || this.s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != b0(this.v).id) {
                if (b0(this.v) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.N;
                long j10 = this.w;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.s) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.r.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        MessagesController.getEmojiSettings(this.currentAccount).edit().remove("group_hide_stickers_" + this.v.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.r.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tL_channels_setStickers = tL_channels_setStickers2;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new l(this, 10));
            }
        }
    }

    public e70(long j10, int i10) {
        super(null);
        this.n = -1;
        this.w = j10;
        this.N = true;
    }
}
