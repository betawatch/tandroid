package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mq0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public boolean C;
    public String D;
    public int E;
    public boolean F;
    public final MediaController.AlbumEntry G;
    public org.telegram.ui.Components.rl0 H;
    public kq0 I;
    public gq0 J;
    public org.telegram.ui.Components.zw0 K;
    public jh.m L;
    public org.telegram.ui.ActionBar.w0 M;
    public org.telegram.ui.ActionBar.g1 N;
    public int O;
    public boolean P;
    public final int Q;
    public final zn R;
    public org.telegram.ui.Components.ul0 S;
    public int T;
    public boolean U;
    public boolean V;
    public FrameLayout W;
    public n0 X;
    public eg.h0 Y;
    public View Z;
    public final int a;
    public org.telegram.ui.Components.cu a0;
    public final HashMap b;
    public ImageView b0;
    public final ArrayList c;
    public fq0 c0;
    public CharSequence d;
    public int d0;
    public boolean e;
    public final TextPaint e0;
    public final ArrayList f;
    public final RectF f0;
    public final Paint g0;
    public final HashMap h;
    public AnimatorSet h0;
    public boolean i0;
    public org.telegram.ui.ActionBar.p1 j0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout k0;
    public org.telegram.ui.ActionBar.g1[] l0;
    public String m0;
    public final ArrayList n;
    public boolean n0;
    public final boolean o0;
    public lq0 p0;
    public qq0 q0;
    public boolean r;
    public final int r0;
    public boolean s;
    public final int s0;
    public final int t0;
    public final cq0 u0;
    public String v;
    public String w;
    public int x;
    public int y;

    public mq0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z4, zn znVar, boolean z10) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.F = true;
        this.O = 100;
        this.d0 = 3;
        this.e0 = new TextPaint(1);
        this.f0 = new RectF();
        this.g0 = new Paint(1);
        this.n0 = true;
        this.u0 = new cq0(this);
        this.G = albumEntry;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i10;
        this.Q = i11;
        this.R = znVar;
        this.B = z4;
        this.o0 = z10;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z10) {
            this.r0 = org.telegram.ui.ActionBar.j6.ug;
            this.s0 = org.telegram.ui.ActionBar.j6.hg;
            this.t0 = org.telegram.ui.ActionBar.j6.ig;
        } else {
            this.r0 = org.telegram.ui.ActionBar.j6.h5;
            this.s0 = org.telegram.ui.ActionBar.j6.j5;
            this.t0 = org.telegram.ui.ActionBar.j6.I5;
        }
    }

    public static /* synthetic */ void U(mq0 mq0Var, TLObject tLObject, boolean z4) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(mq0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(mq0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(mq0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = mq0Var.D;
        mq0Var.D = null;
        mq0Var.d0(str, "", z4, false);
    }

    public static org.telegram.ui.Cells.s5 V(mq0 mq0Var, int i10) {
        int childCount = mq0Var.H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mq0Var.H.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = mq0Var.G;
                if (albumEntry == null ? !(intValue < 0 || intValue >= mq0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return s5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
        boolean z4 = obj instanceof MediaController.PhotoEntry;
        Object valueOf = z4 ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        HashMap hashMap = this.b;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = this.c;
        if (!containsKey) {
            hashMap.put(valueOf, obj);
            arrayList.add(valueOf);
            return -1;
        }
        hashMap.remove(valueOf);
        int indexOf = arrayList.indexOf(valueOf);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        if (this.e) {
            h0();
        }
        if (i10 >= 0) {
            if (z4) {
                ((MediaController.PhotoEntry) obj).reset();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).reset();
            }
            this.u0.W(i10);
        }
        return indexOf;
    }

    public final void Z() {
        this.n.clear();
        kq0 kq0Var = this.I;
        if (kq0Var != null) {
            kq0Var.l();
        }
        this.K.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z4 = Y(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(this.c.contains(Integer.valueOf(this.G.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        i0(z4 ? 1 : 2);
        this.p0.a();
    }

    public final void b0(EditText editText) {
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        d0(obj, "", this.a == 1, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.K.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.n.size());
        int size = this.n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(kf.k0.j(i10, "recent"), (String) this.n.get(i10));
        }
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.V = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = this.r0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = this.s0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, this.t0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = this.a;
        int i13 = 1;
        MediaController.AlbumEntry albumEntry = this.G;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        int i14 = 2;
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, i14));
        if (this.i0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new dq0(this));
            this.N = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a10 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a10.F();
            a10.E = new eq0(this);
            this.M = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        }
        if (albumEntry == null) {
            if (i12 == 0) {
                this.M.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i12 == 1) {
                this.M.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        fq0 fq0Var = new fq0(this, context);
        this.c0 = fq0Var;
        fq0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView = this.c0;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.H = rl0Var;
        rl0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.H.setClipToPadding(false);
        this.H.setHorizontalScrollBarEnabled(false);
        this.H.setVerticalScrollBarEnabled(false);
        this.H.setItemAnimator(null);
        this.H.setLayoutAnimation(null);
        org.telegram.ui.Components.rl0 rl0Var2 = this.H;
        int i15 = 4;
        gq0 gq0Var = new gq0(4);
        this.J = gq0Var;
        rl0Var2.setLayoutManager(gq0Var);
        this.J.O = new hq0(this);
        this.c0.addView(this.H, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.rl0 rl0Var3 = this.H;
        kq0 kq0Var = new kq0(this, context);
        this.I = kq0Var;
        rl0Var3.setAdapter(kq0Var);
        this.H.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.H.setOnItemClickListener(new j(this, 21));
        if (this.E != 1) {
            this.H.setOnItemLongClickListener(new aq0(this, i14));
        }
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0(new iq0(this));
        this.S = ul0Var;
        if (this.E != 1) {
            this.H.B.add(ul0Var);
        }
        jh.m mVar = new jh.m(context, i13, getResourceProvider());
        this.L = mVar;
        mVar.setAlpha(0.0f);
        this.L.setVisibility(8);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, this.L, 1, getResourceProvider());
        this.K = zw0Var;
        zw0Var.setAnimateLayoutChange(true);
        this.K.d.setTypeface(Typeface.DEFAULT);
        this.K.d.setTextSize(1, 16.0f);
        this.K.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        this.K.addView(this.L, 0);
        if (albumEntry != null) {
            this.K.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.K.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.K.e(false, false);
        this.c0.addView(this.K, k7.b6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.H.setOnScrollListener(new bq0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.n0) {
            View view = new View(context);
            this.Z = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Z.setTranslationY(AndroidUtilities.dp(48.0f));
            this.c0.addView(this.Z, k7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.W = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.W.setVisibility(4);
            this.W.setTranslationY(AndroidUtilities.dp(48.0f));
            this.c0.addView(this.W, k7.b6.e(-1, 48, 83));
            this.W.setOnTouchListener(new oh.d(2));
            org.telegram.ui.Components.cu cuVar = this.a0;
            if (cuVar != null) {
                cuVar.o();
            }
            this.a0 = new org.telegram.ui.Components.cu(context, this.c0, null, 1, false, null);
            this.a0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.a0.setHint(LocaleController.getString(R.string.AddCaption));
            this.a0.s();
            org.telegram.ui.Components.ut editText = this.a0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.W.addView(this.a0, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.a0.setText(charSequence);
            }
            this.a0.getEditText().addTextChangedListener(new p0(this, 14));
            n0 n0Var = new n0(this, context, 17);
            this.X = n0Var;
            n0Var.setFocusable(true);
            this.X.setFocusableInTouchMode(true);
            this.X.setVisibility(4);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.X.setAlpha(0.0f);
            this.c0.addView(this.X, k7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.b0 = new ImageView(context);
            this.b0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
            this.b0.setImageResource(R.drawable.attach_send);
            this.b0.setImportantForAccessibility(2);
            this.b0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.b0.setScaleType(ImageView.ScaleType.CENTER);
            this.b0.setOutlineProvider(new gg.j1(16));
            this.X.addView(this.b0, k7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.b0.setOnClickListener(new g60(this, 18));
            this.b0.setOnLongClickListener(new w(this, i15));
            float dp = AndroidUtilities.dp(12.0f);
            TextPaint textPaint = this.e0;
            textPaint.setTextSize(dp);
            textPaint.setTypeface(AndroidUtilities.bold());
            eg.h0 h0Var = new eg.h0(this, context, 28);
            this.Y = h0Var;
            h0Var.setAlpha(0.0f);
            this.Y.setScaleX(0.2f);
            this.Y.setScaleY(0.2f);
            this.c0.addView(this.Y, k7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.Q != 0) {
                this.a0.setVisibility(8);
            }
        }
        this.e = (albumEntry != null || i12 == 0 || i12 == 1) && this.F;
        this.H.setEmptyView(this.K);
        org.telegram.ui.Components.rl0 rl0Var4 = this.H;
        rl0Var4.V1 = true;
        rl0Var4.W1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z4, boolean z10) {
        if (this.r) {
            this.r = false;
            if (this.x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
                this.x = 0;
            }
        }
        this.D = str;
        this.r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        TLObject userOrChat = messagesController.getUserOrChat(z4 ? messagesController2.gifSearchBot : messagesController2.imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.C) {
                return;
            }
            this.C = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
            tL_contacts_resolveUsername.username = z4 ? messagesController3.gifSearchBot : messagesController3.imageSearchBot;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.zd(10, this, z4));
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        zn znVar = this.R;
        if (znVar != null) {
            long a2 = znVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.y + 1;
        this.y = i10;
        this.x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.sb(this, str, i10, z4, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.x, this.classGuid);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z4) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.p0 == null || this.P) {
            return;
        }
        org.telegram.ui.Components.cu cuVar = this.a0;
        if (cuVar != null && cuVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) obj).caption = this.a0.getText().toString();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).caption = this.a0.getText().toString();
            }
        }
        this.P = true;
        this.p0.f(i10, false, z4);
        if (this.Q != 2) {
            lq0 lq0Var = this.p0;
            if (lq0Var == null || lq0Var.e()) {
                finishFragment();
            }
        }
    }

    public final void f0(int i10, boolean z4) {
        this.E = i10;
        this.F = z4;
        if (i10 <= 0 || this.a != 1) {
            return;
        }
        this.E = 1;
    }

    public final boolean g0(boolean z4, boolean z10) {
        if (this.a0 != null) {
            if (z4 != (this.W.getTag() != null)) {
                AnimatorSet animatorSet = this.h0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.W.setTag(z4 ? 1 : null);
                if (this.a0.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.a0.getEditText());
                }
                this.a0.k(true);
                if (z4) {
                    this.W.setVisibility(0);
                    this.X.setVisibility(0);
                }
                if (!z10) {
                    this.X.setScaleX(z4 ? 1.0f : 0.2f);
                    this.X.setScaleY(z4 ? 1.0f : 0.2f);
                    this.X.setAlpha(z4 ? 1.0f : 0.0f);
                    this.Y.setScaleX(z4 ? 1.0f : 0.2f);
                    this.Y.setScaleY(z4 ? 1.0f : 0.2f);
                    this.Y.setAlpha(z4 ? 1.0f : 0.0f);
                    this.W.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(48.0f));
                    this.Z.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(48.0f));
                    if (!z4) {
                        this.W.setVisibility(4);
                        this.X.setVisibility(4);
                    }
                    return true;
                }
                this.h0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                n0 n0Var = this.X;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, z4 ? 1.0f : 0.2f));
                n0 n0Var2 = this.X;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(n0Var2, (Property<n0, Float>) property2, z4 ? 1.0f : 0.2f));
                n0 n0Var3 = this.X;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(n0Var3, (Property<n0, Float>) property3, z4 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<eg.h0, Float>) property, z4 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<eg.h0, Float>) property2, z4 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<eg.h0, Float>) property3, z4 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.W;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z4 ? 0.0f : AndroidUtilities.dp(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.Z, (Property<View, Float>) property4, z4 ? 0.0f : AndroidUtilities.dp(48.0f)));
                this.h0.playTogether(arrayList);
                this.h0.setInterpolator(new DecelerateInterpolator());
                this.h0.setDuration(180L);
                this.h0.addListener(new org.telegram.ui.Components.m00(25, this, z4));
                this.h0.start();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c0, 1, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, this.s0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, this.s0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, this.t0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, this.s0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, this.s0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 32768, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    public final void h0() {
        if (this.e) {
            int childCount = this.H.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.H.getChildAt(i10);
                boolean z4 = childAt instanceof org.telegram.ui.Cells.s5;
                MediaController.AlbumEntry albumEntry = this.G;
                ArrayList arrayList = this.c;
                if (z4) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (albumEntry != null) {
                        s5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        s5Var.setNum(this.e ? arrayList.indexOf(((MediaController.SearchImage) this.f.get(num.intValue())).id) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) childAt).b(arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        if (this.b.size() == 0) {
            this.Y.setPivotX(0.0f);
            this.Y.setPivotY(0.0f);
            g0(false, i10 != 0);
            return;
        }
        this.Y.invalidate();
        if (g0(true, i10 != 0) || i10 == 0) {
            this.Y.setPivotX(0.0f);
            this.Y.setPivotY(0.0f);
            return;
        }
        this.Y.setPivotX(AndroidUtilities.dp(21.0f));
        this.Y.setPivotY(AndroidUtilities.dp(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.Y, (Property<eg.h0, Float>) View.SCALE_X, i10 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.Y, (Property<eg.h0, Float>) View.SCALE_Y, i10 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)) > 0.721f;
    }

    public final void j0() {
        String str;
        kq0 kq0Var = this.I;
        if (kq0Var != null) {
            kq0Var.l();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.v) == null || TextUtils.isEmpty(str)))) {
            this.K.e(true, true);
        } else {
            this.K.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.cu cuVar = this.a0;
        if (cuVar == null || !cuVar.e) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        cuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
            this.x = 0;
        }
        org.telegram.ui.Components.cu cuVar = this.a0;
        if (cuVar != null) {
            cuVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.rl0 rl0Var = this.H;
        if (rl0Var == null) {
            return;
        }
        if (!this.a0.e) {
            rl0Var.setTranslationY(f10);
        } else {
            this.fragmentView.setTranslationY(f10);
            this.H.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        kq0 kq0Var = this.I;
        if (kq0Var != null) {
            kq0Var.l();
        }
        org.telegram.ui.Components.cu cuVar = this.a0;
        if (cuVar != null) {
            cuVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.M;
        if (w0Var != null) {
            w0Var.z(true);
            if (!TextUtils.isEmpty(this.m0)) {
                this.M.H(this.m0, false);
                this.m0 = null;
                b0(this.M.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (!z4 || (w0Var = this.M) == null) {
            return;
        }
        AndroidUtilities.showKeyboard(w0Var.getSearchField());
    }
}
