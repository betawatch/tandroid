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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class br0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public boolean F;
    public String G;
    public int H;
    public boolean I;
    public final MediaController.AlbumEntry J;
    public org.telegram.ui.Components.ll0 K;
    public zq0 L;
    public uq0 M;
    public org.telegram.ui.Components.xw0 N;
    public xq0 O;
    public org.telegram.ui.ActionBar.v0 P;
    public org.telegram.ui.ActionBar.f1 Q;
    public int R;
    public boolean S;
    public final int T;
    public final co U;
    public org.telegram.ui.Components.nl0 V;
    public int W;
    public boolean X;
    public boolean Y;
    public FrameLayout Z;
    public final int a;
    public j0 a0;
    public final HashMap b;
    public t50 b0;
    public final ArrayList c;
    public View c0;
    public CharSequence d;
    public org.telegram.ui.Components.hu d0;
    public boolean e;
    public ImageView e0;
    public final ArrayList f;
    public tq0 f0;
    public int g0;
    public final HashMap h;
    public final TextPaint h0;
    public final RectF i0;
    public final Paint j0;
    public AnimatorSet k0;
    public boolean l0;
    public org.telegram.ui.ActionBar.n1 m0;
    public final ArrayList n;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout n0;
    public org.telegram.ui.ActionBar.f1[] o0;
    public String p0;
    public boolean q0;
    public boolean r;
    public final boolean r0;
    public boolean s;
    public ar0 s0;
    public fr0 t0;
    public final int u0;
    public String v;
    public final int v0;
    public String w;
    public final int w0;
    public int x;
    public final qq0 x0;
    public int y;

    public br0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, co coVar, boolean z11) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.I = true;
        this.R = 100;
        this.g0 = 3;
        this.h0 = new TextPaint(1);
        this.i0 = new RectF();
        this.j0 = new Paint(1);
        this.q0 = true;
        this.x0 = new qq0(this);
        this.J = albumEntry;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i10;
        this.T = i11;
        this.U = coVar;
        this.E = z10;
        this.r0 = z11;
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
        if (z11) {
            this.u0 = org.telegram.ui.ActionBar.j6.ug;
            this.v0 = org.telegram.ui.ActionBar.j6.hg;
            this.w0 = org.telegram.ui.ActionBar.j6.ig;
        } else {
            this.u0 = org.telegram.ui.ActionBar.j6.h5;
            this.v0 = org.telegram.ui.ActionBar.j6.j5;
            this.w0 = org.telegram.ui.ActionBar.j6.I5;
        }
    }

    public static /* synthetic */ void U(br0 br0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(br0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(br0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(br0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = br0Var.G;
        br0Var.G = null;
        br0Var.d0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.s5 V(br0 br0Var, int i10) {
        int childCount = br0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = br0Var.K.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= br0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return s5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        Object valueOf = z10 ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
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
            if (z10) {
                ((MediaController.PhotoEntry) obj).reset();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).reset();
            }
            this.x0.W(i10);
        }
        return indexOf;
    }

    public final void Z() {
        this.n.clear();
        zq0 zq0Var = this.L;
        if (zq0Var != null) {
            zq0Var.l();
        }
        this.N.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z10 = Y(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(this.c.contains(Integer.valueOf(this.J.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        i0(z10 ? 1 : 2);
        this.s0.a();
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
            this.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.N.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.n.size());
        int size = this.n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(i2.g.i(i10, "recent"), (String) this.n.get(i10));
        }
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 0;
        this.Y = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = this.u0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = this.v0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, this.w0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = this.a;
        MediaController.AlbumEntry albumEntry = this.J;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i13 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i13 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 16));
        int i14 = 2;
        if (this.l0) {
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new rq0(this));
            this.Q = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.v0 a10 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a10.F();
            a10.H = new sq0(this);
            this.P = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        }
        if (albumEntry == null) {
            if (i13 == 0) {
                this.P.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i13 == 1) {
                this.P.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        tq0 tq0Var = new tq0(this, context);
        this.f0 = tq0Var;
        tq0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView = this.f0;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.K = ll0Var;
        ll0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.K.setClipToPadding(false);
        this.K.setHorizontalScrollBarEnabled(false);
        this.K.setVerticalScrollBarEnabled(false);
        this.K.setItemAnimator(null);
        this.K.setLayoutAnimation(null);
        org.telegram.ui.Components.ll0 ll0Var2 = this.K;
        int i15 = 4;
        uq0 uq0Var = new uq0(4);
        this.M = uq0Var;
        ll0Var2.setLayoutManager(uq0Var);
        this.M.O = new vq0(this);
        this.f0.addView(this.K, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var3 = this.K;
        zq0 zq0Var = new zq0(this, context);
        this.L = zq0Var;
        ll0Var3.setAdapter(zq0Var);
        this.K.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.K.setOnItemClickListener(new i(this, 21));
        if (this.H != 1) {
            this.K.setOnItemLongClickListener(new oq0(this, i14));
        }
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(new wq0(this));
        this.V = nl0Var;
        if (this.H != 1) {
            this.K.E.add(nl0Var);
        }
        xq0 xq0Var = new xq0(context, i10, getResourceProvider());
        this.O = xq0Var;
        xq0Var.setAlpha(0.0f);
        this.O.setVisibility(8);
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, this.O, 1, getResourceProvider());
        this.N = xw0Var;
        xw0Var.setAnimateLayoutChange(true);
        this.N.d.setTypeface(Typeface.DEFAULT);
        this.N.d.setTextSize(1, 16.0f);
        this.N.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        this.N.addView(this.O, 0);
        if (albumEntry != null) {
            this.N.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.N.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.N.e(false, false);
        this.f0.addView(this.N, w7.x5.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.K.setOnScrollListener(new pq0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.q0) {
            View view = new View(context);
            this.c0 = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.c0.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f0.addView(this.c0, w7.x5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.Z = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.Z.setVisibility(4);
            this.Z.setTranslationY(AndroidUtilities.dp(48.0f));
            this.f0.addView(this.Z, w7.x5.e(-1, 48, 83));
            this.Z.setOnTouchListener(new ci.d(2));
            org.telegram.ui.Components.hu huVar = this.d0;
            if (huVar != null) {
                huVar.o();
            }
            this.d0 = new org.telegram.ui.Components.hu(context, this.f0, null, 1, false, null);
            this.d0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.d0.setHint(LocaleController.getString(R.string.AddCaption));
            this.d0.s();
            org.telegram.ui.Components.zt editText = this.d0.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.Z.addView(this.d0, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.d0.setText(charSequence);
            }
            this.d0.getEditText().addTextChangedListener(new l0(this, 14));
            j0 j0Var = new j0(this, context, 17);
            this.a0 = j0Var;
            j0Var.setFocusable(true);
            this.a0.setFocusableInTouchMode(true);
            this.a0.setVisibility(4);
            this.a0.setScaleX(0.2f);
            this.a0.setScaleY(0.2f);
            this.a0.setAlpha(0.0f);
            this.f0.addView(this.a0, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.e0 = new ImageView(context);
            this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
            this.e0.setImageResource(R.drawable.attach_send);
            this.e0.setImportantForAccessibility(2);
            this.e0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.e0.setScaleType(ImageView.ScaleType.CENTER);
            int i16 = 18;
            this.e0.setOutlineProvider(new bi.z1(i16));
            this.a0.addView(this.e0, w7.x5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.e0.setOnClickListener(new l60(this, i16));
            this.e0.setOnLongClickListener(new u(this, i15));
            float dp = AndroidUtilities.dp(12.0f);
            TextPaint textPaint = this.h0;
            textPaint.setTextSize(dp);
            textPaint.setTypeface(AndroidUtilities.bold());
            t50 t50Var = new t50(this, context, 3);
            this.b0 = t50Var;
            t50Var.setAlpha(0.0f);
            this.b0.setScaleX(0.2f);
            this.b0.setScaleY(0.2f);
            this.f0.addView(this.b0, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.T != 0) {
                this.d0.setVisibility(8);
            }
        }
        this.e = (albumEntry != null || i13 == 0 || i13 == 1) && this.I;
        this.K.setEmptyView(this.N);
        org.telegram.ui.Components.ll0 ll0Var4 = this.K;
        ll0Var4.Y1 = true;
        ll0Var4.Z1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z10, boolean z11) {
        if (this.r) {
            this.r = false;
            if (this.x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
                this.x = 0;
            }
        }
        this.G = str;
        this.r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        TLObject userOrChat = messagesController.getUserOrChat(z10 ? messagesController2.gifSearchBot : messagesController2.imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z11 || this.F) {
                return;
            }
            this.F = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
            tL_contacts_resolveUsername.username = z10 ? messagesController3.gifSearchBot : messagesController3.imageSearchBot;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new di.u3(11, this, z10));
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        co coVar = this.U;
        if (coVar != null) {
            long a2 = coVar.a();
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
        this.x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.pb(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.x, this.classGuid);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z10) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.s0 == null || this.S) {
            return;
        }
        org.telegram.ui.Components.hu huVar = this.d0;
        if (huVar != null && huVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) obj).caption = this.d0.getText().toString();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).caption = this.d0.getText().toString();
            }
        }
        this.S = true;
        this.s0.h(i10, false, z10);
        if (this.T != 2) {
            ar0 ar0Var = this.s0;
            if (ar0Var == null || ar0Var.e()) {
                finishFragment();
            }
        }
    }

    public final void f0(int i10, boolean z10) {
        this.H = i10;
        this.I = z10;
        if (i10 <= 0 || this.a != 1) {
            return;
        }
        this.H = 1;
    }

    public final boolean g0(boolean z10, boolean z11) {
        if (this.d0 != null) {
            if (z10 != (this.Z.getTag() != null)) {
                AnimatorSet animatorSet = this.k0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.Z.setTag(z10 ? 1 : null);
                if (this.d0.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.d0.getEditText());
                }
                this.d0.k(true);
                if (z10) {
                    this.Z.setVisibility(0);
                    this.a0.setVisibility(0);
                }
                int i10 = 4;
                if (!z11) {
                    this.a0.setScaleX(z10 ? 1.0f : 0.2f);
                    this.a0.setScaleY(z10 ? 1.0f : 0.2f);
                    this.a0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.b0.setScaleX(z10 ? 1.0f : 0.2f);
                    this.b0.setScaleY(z10 ? 1.0f : 0.2f);
                    this.b0.setAlpha(z10 ? 1.0f : 0.0f);
                    this.Z.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
                    this.c0.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
                    if (!z10) {
                        this.Z.setVisibility(4);
                        this.a0.setVisibility(4);
                    }
                    return true;
                }
                this.k0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                j0 j0Var = this.a0;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(j0Var, (Property<j0, Float>) property, z10 ? 1.0f : 0.2f));
                j0 j0Var2 = this.a0;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(j0Var2, (Property<j0, Float>) property2, z10 ? 1.0f : 0.2f));
                j0 j0Var3 = this.a0;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(j0Var3, (Property<j0, Float>) property3, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<t50, Float>) property, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<t50, Float>) property2, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.b0, (Property<t50, Float>) property3, z10 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.Z;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.c0, (Property<View, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                this.k0.playTogether(arrayList);
                this.k0.setInterpolator(new DecelerateInterpolator());
                this.k0.setDuration(180L);
                this.k0.addListener(new e50(i10, this, z10));
                this.k0.start();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f0, 1, null, null, null, null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, this.w0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        org.telegram.ui.ActionBar.v0 v0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, this.v0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 32768, null, null, null, null, this.u0));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    public final void h0() {
        if (this.e) {
            int childCount = this.K.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.K.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.s5;
                MediaController.AlbumEntry albumEntry = this.J;
                ArrayList arrayList = this.c;
                if (z10) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (albumEntry != null) {
                        s5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        s5Var.setNum(this.e ? arrayList.indexOf(((MediaController.SearchImage) this.f.get(num.intValue())).id) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) childAt).b(arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        if (this.b.size() == 0) {
            this.b0.setPivotX(0.0f);
            this.b0.setPivotY(0.0f);
            g0(false, i10 != 0);
            return;
        }
        this.b0.invalidate();
        if (g0(true, i10 != 0) || i10 == 0) {
            this.b0.setPivotX(0.0f);
            this.b0.setPivotY(0.0f);
            return;
        }
        this.b0.setPivotX(AndroidUtilities.dp(21.0f));
        this.b0.setPivotY(AndroidUtilities.dp(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b0, (Property<t50, Float>) View.SCALE_X, i10 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.b0, (Property<t50, Float>) View.SCALE_Y, i10 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false)) > 0.721f;
    }

    public final void j0() {
        String str;
        zq0 zq0Var = this.L;
        if (zq0Var != null) {
            zq0Var.l();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.v) == null || TextUtils.isEmpty(str)))) {
            this.N.e(true, true);
        } else {
            this.N.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.hu huVar = this.d0;
        if (huVar == null || !huVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        huVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
            this.x = 0;
        }
        org.telegram.ui.Components.hu huVar = this.d0;
        if (huVar != null) {
            huVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPanTranslationUpdate(float f7) {
        org.telegram.ui.Components.ll0 ll0Var = this.K;
        if (ll0Var == null) {
            return;
        }
        if (!this.d0.e) {
            ll0Var.setTranslationY(f7);
        } else {
            this.fragmentView.setTranslationY(f7);
            this.K.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        zq0 zq0Var = this.L;
        if (zq0Var != null) {
            zq0Var.l();
        }
        org.telegram.ui.Components.hu huVar = this.d0;
        if (huVar != null) {
            huVar.s();
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.P;
        if (v0Var != null) {
            v0Var.z(true);
            if (!TextUtils.isEmpty(this.p0)) {
                this.P.H(this.p0, false);
                this.p0 = null;
                b0(this.P.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (!z10 || (v0Var = this.P) == null) {
            return;
        }
        AndroidUtilities.showKeyboard(v0Var.getSearchField());
    }
}
