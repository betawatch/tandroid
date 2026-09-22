package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jq0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final bo F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.n1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.f1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.ju M;
    public j0 N;
    public ImageView O;
    public eq0 P;
    public s50 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public iq0 V;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.ll0 h;
    public hq0 n;
    public FrameLayout r;
    public TextView s;
    public boolean v;
    public final int w;
    public boolean x;
    public final boolean y;

    public jq0(int i10, boolean z10, boolean z11, bo boVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = boVar;
        this.w = i10;
        this.y = z10;
        this.E = z11;
    }

    public static void U(jq0 jq0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            ar0 ar0Var = new ar0(0, albumEntry, jq0Var.b, jq0Var.c, jq0Var.w, jq0Var.E, jq0Var.F, false);
            Editable text = jq0Var.M.getText();
            jq0Var.a = text;
            ar0Var.d = text;
            org.telegram.ui.Components.ju juVar = ar0Var.d0;
            if (juVar != null) {
                juVar.setText(text);
            }
            ar0Var.s0 = new fq0(jq0Var);
            ar0Var.f0(jq0Var.G, jq0Var.H);
            jq0Var.presentFragment(ar0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!jq0Var.y) {
            ar0 ar0Var2 = new ar0(0, albumEntry, hashMap, arrayList, jq0Var.w, jq0Var.E, jq0Var.F, false);
            Editable text2 = jq0Var.M.getText();
            jq0Var.a = text2;
            ar0Var2.d = text2;
            org.telegram.ui.Components.ju juVar2 = ar0Var2.d0;
            if (juVar2 != null) {
                juVar2.setText(text2);
            }
            ar0Var2.s0 = new cq0(jq0Var, hashMap, arrayList);
            ar0Var2.f0(jq0Var.G, jq0Var.H);
            jq0Var.presentFragment(ar0Var2);
            return;
        }
        gr0 gr0Var = new gr0(hashMap, arrayList, jq0Var.w, jq0Var.E, jq0Var.F);
        Editable text3 = jq0Var.M.getText();
        jq0Var.a = text3;
        ar0 ar0Var3 = gr0Var.a;
        if (ar0Var3 != null) {
            ar0Var3.d = text3;
            org.telegram.ui.Components.ju juVar3 = ar0Var3.d0;
            if (juVar3 != null) {
                juVar3.setText(text3);
            }
        }
        gq0 gq0Var = new gq0(jq0Var, hashMap, arrayList);
        ar0 ar0Var4 = gr0Var.a;
        ar0Var4.s0 = gq0Var;
        ar0 ar0Var5 = gr0Var.b;
        ar0Var5.s0 = gq0Var;
        ar0Var4.t0 = new fr0(gr0Var, 0);
        ar0Var5.t0 = new fr0(gr0Var, 1);
        int i10 = jq0Var.G;
        boolean z10 = jq0Var.H;
        ar0Var4.f0(i10, z10);
        gr0Var.b.f0(i10, z10);
        jq0Var.presentFragment(gr0Var);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (hashMap.isEmpty() || this.V == null || this.v) {
            return;
        }
        this.v = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            } else if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str2 = searchImage.imagePath;
                if (str2 != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                sendingMediaInfo.coverPath = searchImage.coverPath;
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                CharSequence charSequence2 = searchImage.caption;
                sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                sendingMediaInfo.entities = searchImage.entities;
                sendingMediaInfo.masks = searchImage.stickers;
                sendingMediaInfo.ttl = searchImage.ttl;
                TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                if (botInlineResult != null && searchImage.type == 1) {
                    sendingMediaInfo.inlineResult = botInlineResult;
                    sendingMediaInfo.params = searchImage.params;
                }
                searchImage.date = (int) (System.currentTimeMillis() / 1000);
            }
        }
        this.V.a(arrayList2);
    }

    public final void W(boolean z10) {
        if (z10 == (this.L.getTag() != null)) {
            return;
        }
        this.L.setTag(z10 ? 1 : null);
        if (this.M.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        this.N.setScaleX(z10 ? 1.0f : 0.2f);
        this.N.setScaleY(z10 ? 1.0f : 0.2f);
        this.N.setAlpha(z10 ? 1.0f : 0.0f);
        this.Q.setScaleX(z10 ? 1.0f : 0.2f);
        this.Q.setScaleY(z10 ? 1.0f : 0.2f);
        this.Q.setAlpha(z10 ? 1.0f : 0.0f);
        this.L.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
        this.R.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new dq0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i12 = 2;
        if (this.x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        eq0 eq0Var = new eq0(this, context);
        this.P = eq0Var;
        eq0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.h = ll0Var;
        ll0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var2 = this.h;
        hq0 hq0Var = new hq0(this, context);
        this.n = hq0Var;
        ll0Var2.setAdapter(hq0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i13 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.s, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new bi.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.r, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, w7.x5.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.x5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.x5.e(-1, 48, 83));
        this.L.setOnTouchListener(new bi.d(2));
        org.telegram.ui.Components.ju juVar = this.M;
        if (juVar != null) {
            juVar.o();
        }
        this.M = new org.telegram.ui.Components.ju(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.bu editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        j0 j0Var = new j0(this, context, 16);
        this.N = j0Var;
        j0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.S5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        this.O.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new ai.k2(i13));
        this.N.addView(this.O, w7.x5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new k60(this, i13));
        this.O.setOnLongClickListener(new u(this, 3));
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.S;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        s50 s50Var = new s50(this, context, i12);
        this.Q = s50Var;
        s50Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.w != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.albumsDidLoad) {
            if (i10 == NotificationCenter.closeChats) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i12 = this.w;
            if (i12 == 1 || i12 == 2 || i12 == 10 || !this.x) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.h;
            if (ll0Var != null && ll0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            hq0 hq0Var = this.n;
            if (hq0Var != null) {
                hq0Var.l();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.R4}, null, org.telegram.ui.ActionBar.i6.da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.i6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ju juVar = this.M;
        if (juVar == null || !juVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        juVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ll0 ll0Var = this.h;
        if (ll0Var != null) {
            ll0Var.getViewTreeObserver().addOnPreDrawListener(new ei(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        int i10 = this.w;
        if (i10 == 1 || i10 == 2 || i10 == 10 || !this.x) {
            this.d = MediaController.allPhotoAlbums;
        } else {
            this.d = MediaController.allMediaAlbums;
        }
        this.e = this.d == null;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.ju juVar = this.M;
        if (juVar != null) {
            juVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        hq0 hq0Var = this.n;
        if (hq0Var != null) {
            hq0Var.l();
        }
        org.telegram.ui.Components.ju juVar = this.M;
        if (juVar != null) {
            juVar.s();
        }
        org.telegram.ui.Components.ll0 ll0Var = this.h;
        if (ll0Var != null) {
            ll0Var.getViewTreeObserver().addOnPreDrawListener(new ei(this, 3));
        }
    }
}
