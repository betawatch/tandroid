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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public final rn B;
    public int C;
    public boolean D;
    public org.telegram.ui.ActionBar.n1 E;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout F;
    public org.telegram.ui.ActionBar.f1[] G;
    public FrameLayout H;
    public org.telegram.ui.Components.tt I;
    public n0 J;
    public ImageView K;
    public ep0 L;
    public aj0 M;
    public View N;
    public final TextPaint O;
    public final RectF P;
    public final Paint Q;
    public ip0 R;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.zk0 h;
    public hp0 n;
    public FrameLayout r;
    public TextView s;
    public boolean v;
    public final int w;
    public boolean x;
    public final boolean y;

    public jp0(int i10, boolean z10, boolean z11, rn rnVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.x = true;
        this.D = true;
        this.O = new TextPaint(1);
        this.P = new RectF();
        this.Q = new Paint(1);
        this.B = rnVar;
        this.w = i10;
        this.y = z10;
        this.A = z11;
    }

    public static void U(jp0 jp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            aq0 aq0Var = new aq0(0, albumEntry, jp0Var.b, jp0Var.c, jp0Var.w, jp0Var.A, jp0Var.B, false);
            Editable text = jp0Var.I.getText();
            jp0Var.a = text;
            aq0Var.d = text;
            org.telegram.ui.Components.tt ttVar = aq0Var.Z;
            if (ttVar != null) {
                ttVar.setText(text);
            }
            aq0Var.o0 = new fp0(jp0Var);
            aq0Var.f0(jp0Var.C, jp0Var.D);
            jp0Var.presentFragment(aq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!jp0Var.y) {
            aq0 aq0Var2 = new aq0(0, albumEntry, hashMap, arrayList, jp0Var.w, jp0Var.A, jp0Var.B, false);
            Editable text2 = jp0Var.I.getText();
            jp0Var.a = text2;
            aq0Var2.d = text2;
            org.telegram.ui.Components.tt ttVar2 = aq0Var2.Z;
            if (ttVar2 != null) {
                ttVar2.setText(text2);
            }
            aq0Var2.o0 = new cp0(jp0Var, hashMap, arrayList);
            aq0Var2.f0(jp0Var.C, jp0Var.D);
            jp0Var.presentFragment(aq0Var2);
            return;
        }
        fq0 fq0Var = new fq0(hashMap, arrayList, jp0Var.w, jp0Var.A, jp0Var.B);
        Editable text3 = jp0Var.I.getText();
        jp0Var.a = text3;
        aq0 aq0Var3 = fq0Var.a;
        if (aq0Var3 != null) {
            aq0Var3.d = text3;
            org.telegram.ui.Components.tt ttVar3 = aq0Var3.Z;
            if (ttVar3 != null) {
                ttVar3.setText(text3);
            }
        }
        gp0 gp0Var = new gp0(jp0Var, hashMap, arrayList);
        aq0 aq0Var4 = fq0Var.a;
        aq0Var4.o0 = gp0Var;
        aq0 aq0Var5 = fq0Var.b;
        aq0Var5.o0 = gp0Var;
        aq0Var4.p0 = new eq0(fq0Var, 0);
        aq0Var5.p0 = new eq0(fq0Var, 1);
        int i10 = jp0Var.C;
        boolean z10 = jp0Var.D;
        aq0Var4.f0(i10, z10);
        fq0Var.b.f0(i10, z10);
        jp0Var.presentFragment(fq0Var);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (hashMap.isEmpty() || this.R == null || this.v) {
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
        this.R.a(arrayList2);
    }

    public final void W(boolean z10) {
        if (z10 == (this.H.getTag() != null)) {
            return;
        }
        this.H.setTag(z10 ? 1 : null);
        if (this.I.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.I.getEditText());
        }
        this.I.k(true);
        if (z10) {
            this.H.setVisibility(0);
            this.J.setVisibility(0);
        } else {
            this.H.setVisibility(4);
            this.J.setVisibility(4);
        }
        this.J.setScaleX(z10 ? 1.0f : 0.2f);
        this.J.setScaleY(z10 ? 1.0f : 0.2f);
        this.J.setAlpha(z10 ? 1.0f : 0.0f);
        this.M.setScaleX(z10 ? 1.0f : 0.2f);
        this.M.setScaleY(z10 ? 1.0f : 0.2f);
        this.M.setAlpha(z10 ? 1.0f : 0.0f);
        this.H.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
        this.N.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new dp0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i12 = 1;
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        ep0 ep0Var = new ep0(this, context);
        this.L = ep0Var;
        ep0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView = this.L;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.h = zk0Var;
        zk0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.k0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.L.addView(this.h, h7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.zk0 zk0Var2 = this.h;
        hp0 hp0Var = new hp0(this, context);
        this.n = hp0Var;
        zk0Var2.setAdapter(hp0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(LocaleController.getString(R.string.NoPhotos));
        this.L.addView(this.s, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new kh.e(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.L.addView(this.r, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, h7.z5.e(-2, -2, 17));
        View view = new View(context);
        this.N = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.N.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.N, h7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.H.setVisibility(4);
        this.H.setTranslationY(AndroidUtilities.dp(48.0f));
        this.L.addView(this.H, h7.z5.e(-1, 48, 83));
        this.H.setOnTouchListener(new kh.e(2));
        org.telegram.ui.Components.tt ttVar = this.I;
        if (ttVar != null) {
            ttVar.o();
        }
        this.I = new org.telegram.ui.Components.tt(context, this.L, null, 1, false, null);
        this.I.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.I.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.lt editText = this.I.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.H.addView(this.I, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.I.setText(charSequence);
        }
        n0 n0Var = new n0(this, context, 16);
        this.J = n0Var;
        n0Var.setFocusable(true);
        this.J.setFocusableInTouchMode(true);
        this.J.setVisibility(4);
        this.J.setScaleX(0.2f);
        this.J.setScaleY(0.2f);
        this.J.setAlpha(0.0f);
        this.L.addView(this.J, h7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.K = new ImageView(context);
        this.K.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T5, false)));
        this.K.setImageResource(R.drawable.attach_send);
        this.K.setImportantForAccessibility(2);
        this.K.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.K.setScaleType(ImageView.ScaleType.CENTER);
        this.K.setOutlineProvider(new cg.l1(17));
        this.J.addView(this.K, h7.z5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.K.setOnClickListener(new u50(this, 18));
        this.K.setOnLongClickListener(new v(this, 3));
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.O;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        aj0 aj0Var = new aj0(this, context, i12);
        this.M = aj0Var;
        aj0Var.setAlpha(0.0f);
        this.M.setScaleX(0.2f);
        this.M.setScaleY(0.2f);
        this.L.addView(this.M, h7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.w != 0) {
            this.I.setVisibility(8);
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
            org.telegram.ui.Components.zk0 zk0Var = this.h;
            if (zk0Var != null && zk0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            hp0 hp0Var = this.n;
            if (hp0Var != null) {
                hp0Var.l();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tt ttVar = this.I;
        if (ttVar == null || !ttVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        ttVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.zk0 zk0Var = this.h;
        if (zk0Var != null) {
            zk0Var.getViewTreeObserver().addOnPreDrawListener(new uh(this, 3));
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
        org.telegram.ui.Components.tt ttVar = this.I;
        if (ttVar != null) {
            ttVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        hp0 hp0Var = this.n;
        if (hp0Var != null) {
            hp0Var.l();
        }
        org.telegram.ui.Components.tt ttVar = this.I;
        if (ttVar != null) {
            ttVar.s();
        }
        org.telegram.ui.Components.zk0 zk0Var = this.h;
        if (zk0Var != null) {
            zk0Var.getViewTreeObserver().addOnPreDrawListener(new uh(this, 3));
        }
    }
}
