package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class aq0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final un F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.o1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.g1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.ru M;
    public k0 N;
    public ImageView O;
    public vp0 P;
    public z10 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public zp0 V;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.mm0 h;
    public yp0 n;
    public FrameLayout r;
    public TextView s;
    public boolean v;
    public final int w;
    public boolean x;
    public final boolean y;

    public aq0(int i10, boolean z10, boolean z11, un unVar) {
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
        this.F = unVar;
        this.w = i10;
        this.y = z10;
        this.E = z11;
    }

    public static void V(aq0 aq0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            rq0 rq0Var = new rq0(0, albumEntry, aq0Var.b, aq0Var.c, aq0Var.w, aq0Var.E, aq0Var.F, false);
            Editable text = aq0Var.M.getText();
            aq0Var.a = text;
            rq0Var.d = text;
            org.telegram.ui.Components.ru ruVar = rq0Var.d0;
            if (ruVar != null) {
                ruVar.setText(text);
            }
            rq0Var.s0 = new wp0(aq0Var);
            rq0Var.g0(aq0Var.G, aq0Var.H);
            aq0Var.presentFragment(rq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!aq0Var.y) {
            rq0 rq0Var2 = new rq0(0, albumEntry, hashMap, arrayList, aq0Var.w, aq0Var.E, aq0Var.F, false);
            Editable text2 = aq0Var.M.getText();
            aq0Var.a = text2;
            rq0Var2.d = text2;
            org.telegram.ui.Components.ru ruVar2 = rq0Var2.d0;
            if (ruVar2 != null) {
                ruVar2.setText(text2);
            }
            rq0Var2.s0 = new tp0(aq0Var, hashMap, arrayList);
            rq0Var2.g0(aq0Var.G, aq0Var.H);
            aq0Var.presentFragment(rq0Var2);
            return;
        }
        vq0 vq0Var = new vq0(hashMap, arrayList, aq0Var.w, aq0Var.E, aq0Var.F);
        Editable text3 = aq0Var.M.getText();
        aq0Var.a = text3;
        rq0 rq0Var3 = vq0Var.a;
        if (rq0Var3 != null) {
            rq0Var3.d = text3;
            org.telegram.ui.Components.ru ruVar3 = rq0Var3.d0;
            if (ruVar3 != null) {
                ruVar3.setText(text3);
            }
        }
        xp0 xp0Var = new xp0(aq0Var, hashMap, arrayList);
        rq0 rq0Var4 = vq0Var.a;
        rq0Var4.s0 = xp0Var;
        rq0 rq0Var5 = vq0Var.b;
        rq0Var5.s0 = xp0Var;
        rq0Var4.t0 = new uq0(vq0Var, 0);
        rq0Var5.t0 = new uq0(vq0Var, 1);
        int i10 = aq0Var.G;
        boolean z10 = aq0Var.H;
        rq0Var4.g0(i10, z10);
        vq0Var.b.g0(i10, z10);
        aq0Var.presentFragment(vq0Var);
    }

    public final void W(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
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

    public final void X(boolean z10) {
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.da));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.h5;
        org.telegram.ui.ActionBar.f7.i(i10, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.m(kVar2, 5, i11, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, i11, null);
        int i12 = 3;
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new up0(this));
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        if (this.x) {
            l4.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        vp0 vp0Var = new vp0(this, context);
        this.P = vp0Var;
        org.telegram.ui.ActionBar.f7.i(i10, vp0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.h = mm0Var;
        mm0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var2 = this.h;
        yp0 yp0Var = new yp0(this, context);
        this.n = yp0Var;
        mm0Var2.setAdapter(yp0Var);
        org.telegram.ui.ActionBar.f7.I(this.h, i10, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i13 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.s, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new ei.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.r, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, org.telegram.ui.Components.gb1.h(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(i10, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, org.telegram.ui.Components.gb1.i(-1, 48, 83));
        this.L.setOnTouchListener(new ei.d(2));
        org.telegram.ui.Components.ru ruVar = this.M;
        if (ruVar != null) {
            ruVar.o();
        }
        this.M = new org.telegram.ui.Components.ru(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.ju editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        k0 k0Var = new k0(this, context, i13);
        this.N = k0Var;
        k0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, org.telegram.ui.Components.gb1.h(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.S5, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.f7.t(this.O, org.telegram.ui.ActionBar.y6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new ag.v0(21));
        this.N.addView(this.O, org.telegram.ui.Components.gb1.h(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new x50(this, 19));
        this.O.setOnLongClickListener(new t(this, i12));
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.S;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        z10 z10Var = new z10(this, context, i12);
        this.Q = z10Var;
        z10Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, org.telegram.ui.Components.gb1.h(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
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
            org.telegram.ui.Components.mm0 mm0Var = this.h;
            if (mm0Var != null && mm0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            yp0 yp0Var = this.n;
            if (yp0Var != null) {
                yp0Var.l();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.M;
        if (ruVar == null || !ruVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        ruVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.mm0 mm0Var = this.h;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.ru ruVar = this.M;
        if (ruVar != null) {
            ruVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        yp0 yp0Var = this.n;
        if (yp0Var != null) {
            yp0Var.l();
        }
        org.telegram.ui.Components.ru ruVar = this.M;
        if (ruVar != null) {
            ruVar.s();
        }
        org.telegram.ui.Components.mm0 mm0Var = this.h;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 5));
        }
    }
}
