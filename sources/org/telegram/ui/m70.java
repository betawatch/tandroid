package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public org.telegram.ui.ActionBar.w0 I;
    public boolean J;
    public final boolean K;
    public j70 L;
    public FrameLayout a;
    public org.telegram.ui.Components.zw0 b;
    public org.telegram.ui.Components.t00 c;
    public org.telegram.ui.Components.sl0 d;
    public k70 e;
    public l70 f;
    public f2.i0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull v;
    public final long w;
    public int x;
    public int y;

    public m70(long j10) {
        super(null);
        this.n = -1;
        this.w = j10;
    }

    public static /* synthetic */ void U(m70 m70Var, View view, int i10) {
        if (m70Var.getParentActivity() == null) {
            return;
        }
        if (!m70Var.J) {
            if (i10 >= m70Var.B && i10 < m70Var.C) {
                m70Var.d0(MediaDataController.getInstance(m70Var.currentAccount).getStickerSets(m70Var.c0()).get(i10 - m70Var.B), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i10 == m70Var.G) {
                m70Var.d0(m70Var.r, true, false);
                return;
            }
            return;
        }
        if (i10 > m70Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
            l70 l70Var = m70Var.f;
            m70Var.d0((TLRPC.TL_messages_stickerSet) l70Var.e.get((i10 - l70Var.d.size()) - 1), a2, false);
        } else if (i10 != m70Var.f.d.size()) {
            m70Var.d0((TLRPC.TL_messages_stickerSet) m70Var.f.d.get(i10), ((org.telegram.ui.Cells.k8) view).a(), true);
        }
    }

    public static void V(m70 m70Var, TLRPC.TL_error tL_error) {
        boolean z4 = m70Var.K;
        if (tL_error != null) {
            if (m70Var.getParentActivity() != null) {
                Activity parentActivity = m70Var.getParentActivity();
                StringBuilder sb = new StringBuilder();
                b.i(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                Toast.makeText(parentActivity, sb.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m70Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z4) {
                m70Var.v.emojiset = stickerSet;
            } else {
                m70Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(m70Var.currentAccount).putGroupStickerSet(m70Var.r);
        } else if (z4) {
            m70Var.v.emojiset = null;
        } else {
            m70Var.v.stickerset = null;
        }
        m70Var.h0();
        if (z4) {
            TLRPC.ChatFull chatFull = m70Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = m70Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(m70Var.currentAccount).updateChatInfo(m70Var.v, false);
        NotificationCenter.getInstance(m70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, m70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(m70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(m70Var.v.id), Boolean.valueOf(z4));
        m70Var.finishFragment();
    }

    public static void a0(m70 m70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = m70Var.n;
        if (tL_messages_stickerSet == null) {
            if (m70Var.r != null) {
                kh.a2.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(m70Var), R.raw.done, 36);
            }
            m70Var.r = null;
            m70Var.s = true;
        } else {
            m70Var.r = tL_messages_stickerSet;
            m70Var.s = false;
            kh.a2.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(m70Var), R.raw.done, 36);
        }
        m70Var.h0();
        m70Var.f0(m70Var.r, false);
        if (i10 != -1) {
            if (!m70Var.J) {
                for (int i11 = 0; i11 < m70Var.d.getChildCount(); i11++) {
                    View childAt = m70Var.d.getChildAt(i11);
                    if (m70Var.d.T(childAt).b() == m70Var.B + i10) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            m70Var.e.m(m70Var.B + i10);
        }
        if (m70Var.n != -1) {
            if (!m70Var.J) {
                for (int i12 = 0; i12 < m70Var.d.getChildCount(); i12++) {
                    View childAt2 = m70Var.d.getChildAt(i12);
                    if (m70Var.d.T(childAt2).b() == m70Var.B + m70Var.n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            m70Var.e.m(m70Var.B + m70Var.n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.K ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int c0() {
        return this.K ? 5 : 0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.K ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.I = a2;
        a2.F();
        a2.E = new fb(this, 9);
        this.I.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new k70(this, context);
        this.f = new l70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.d = new org.telegram.ui.Components.sl0(context, null);
        f2.l lVar = new f2.l();
        lVar.n(200L);
        lVar.m = true;
        this.d.setItemAnimator(lVar);
        f2.i0 i0Var = new f2.i0();
        this.h = i0Var;
        i0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, getResourceProvider());
        this.c = t00Var;
        t00Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.a.addView(this.c, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, this.c, 1, null);
        this.b = zw0Var;
        n7.qa.N0(zw0Var);
        this.a.addView(this.b);
        frameLayout.addView(this.a);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, k7.b6.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new j(this, 13));
        this.d.setOnScrollListener(new l3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z4, boolean z10) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z10) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(getParentActivity(), this, tL_inputStickerSetShortName, !z10 ? tL_messages_stickerSet : null, null, null);
        xx0Var.a0 = new h70(this, z4, tL_messages_stickerSet);
        xx0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        xx0Var.show();
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

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z4) {
        if (this.K) {
            if (tL_messages_stickerSet != null) {
                boolean z10 = this.G == -1;
                this.r = tL_messages_stickerSet;
                g0(false);
                if (z10) {
                    this.e.o(this.G);
                } else {
                    this.e.m(this.G);
                }
                if (z4) {
                    this.e.m(this.F);
                }
                j70 j70Var = this.L;
                j70Var.b = true;
                j70Var.invalidate();
                return;
            }
            int i10 = this.G;
            boolean z11 = i10 > 0;
            this.r = null;
            if (z11) {
                this.e.u(i10);
                if (z4) {
                    this.e.m(this.F);
                }
            }
            g0(false);
            j70 j70Var2 = this.L;
            j70Var2.b = false;
            j70Var2.invalidate();
        }
    }

    public final void g0(boolean z4) {
        k70 k70Var;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.D = 0;
        if (this.K) {
            this.E = 0;
            this.D = 2;
            this.F = 1;
            if (this.r != null) {
                this.D = 3;
                this.G = 2;
            }
            int i10 = this.D;
            this.D = i10 + 1;
            this.H = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (stickerSets.isEmpty()) {
            this.y = -1;
            this.B = -1;
            this.C = -1;
        } else {
            int i11 = this.D;
            int i12 = i11 + 1;
            this.D = i12;
            this.y = i11;
            this.B = i12;
            this.C = stickerSets.size() + i12;
            this.D = stickerSets.size() + this.D;
        }
        int i13 = this.D;
        this.D = i13 + 1;
        this.x = i13;
        h0();
        if (!z4 || (k70Var = this.e) == null) {
            return;
        }
        k70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.aa.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i11 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
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

    @Override // org.telegram.ui.ActionBar.p2
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
    @Override // org.telegram.ui.ActionBar.p2
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
                boolean z4 = this.K;
                long j10 = this.w;
                if (z4) {
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new o(this, 9));
            }
        }
    }

    public m70(long j10, int i10) {
        super(null);
        this.n = -1;
        this.w = j10;
        this.K = true;
    }
}
