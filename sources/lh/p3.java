package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class p3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable A;
    public final e3 B;
    public final org.telegram.ui.ActionBar.v0 C;
    public final ImageView D;
    public final LinearLayout E;
    public final d F;
    public boolean G;
    public final boolean H;
    public final boolean I;
    public int J;
    public final float K;
    public final boolean L;
    public boolean M;
    public int N;
    public final org.telegram.ui.Components.y5 O;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public Utilities.Callback2 S;
    public Utilities.Callback3 T;
    public final ArrayList U;
    public boolean V;
    public boolean W;
    public final int a;
    public MediaController.AlbumEntry a0;
    public final org.telegram.ui.ActionBar.c6 b;
    public ArrayList b0;
    public final Paint c;
    public ArrayList c0;
    public final y2 d;
    public final ArrayList d0;
    public final z2 e;
    public ag.d e0;
    public final i3 f;
    public final FrameLayout h;
    public final zk0 n;
    public final f3 r;
    public final iw0 s;
    public final a4 v;
    public boolean w;
    public final org.telegram.ui.ActionBar.k x;
    public final TextView y;

    public p3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.J = -2;
        this.O = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.Q = true;
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.d0 = new ArrayList();
        this.K = f10;
        this.a = i10;
        this.b = c6Var;
        this.H = z10;
        this.I = z11;
        this.L = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), TLObject.FLAG_27);
        y2 y2Var = new y2(this, context, c6Var);
        this.d = y2Var;
        y2Var.setItemSelectorColorProvider(new ia.l(22));
        i3 i3Var = new i3(this);
        this.f = i3Var;
        y2Var.setAdapter(i3Var);
        z2 z2Var = new z2(this);
        this.e = z2Var;
        y2Var.setLayoutManager(z2Var);
        y2Var.setFastScrollEnabled(1);
        y2Var.setFastScrollVisible(true);
        y2Var.getFastScroll().setAlpha(0.0f);
        z2Var.O = new a3(this);
        y2Var.i(new b3());
        y2Var.setClipToPadding(false);
        addView(y2Var, h7.z5.e(-1, -1, 119));
        final int i11 = 0;
        y2Var.setOnItemClickListener(new pk0(this) { // from class: lh.s2
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.pk0
            public final void a(int i12, View view) {
                Utilities.Callback2 callback2;
                switch (i11) {
                    case 0:
                        p3 p3Var = this.b;
                        ArrayList arrayList2 = p3Var.U;
                        ArrayList arrayList3 = p3Var.d0;
                        if (i12 >= 2 && p3Var.S != null && (view instanceof l3)) {
                            l3 l3Var = (l3) view;
                            int i13 = i12 - 2;
                            if (!p3Var.V) {
                                if (p3Var.W) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        z7 z7Var = (z7) arrayList2.get(i13);
                                        p3Var.S.run(z7Var, z7Var.K ? p3.d(l3Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                p3Var.e(p3.f0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < p3Var.b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.b0.get(i13);
                                if (arrayList3.isEmpty() && !p3Var.M) {
                                    Utilities.Callback2 callback22 = p3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = p3.d(l3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > p3Var.N) {
                                        int i14 = -p3Var.J;
                                        p3Var.J = i14;
                                        AndroidUtilities.shakeViewSpring(l3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(p3Var.d);
                                    p3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        p3 p3Var2 = this.b;
                        f3 f3Var = p3Var2.r;
                        org.telegram.ui.ActionBar.v0 v0Var = p3Var2.C;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < f3Var.c.size() && (callback2 = p3Var2.S) != null) {
                            callback2.run(f3Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        y2Var.setOnItemLongClickListener(new p(this, 2));
        y2Var.setOnScrollListener(new c3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        this.x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.C(436207615, false);
        kVar.D(-1, false);
        kVar.D(-1, true);
        addView(kVar, h7.z5.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new d3(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        e3 e3Var = new e3(this, context, n10, c6Var);
        this.B = e3Var;
        e3Var.setSubMenuOpenSide(1);
        kVar.addView(e3Var, 0, h7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i12 = 0;
        e3Var.setOnClickListener(new View.OnClickListener(this) { // from class: lh.t2
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.B.M(null, null);
                        break;
                    case 1:
                        p3 p3Var = this.b;
                        if (p3Var.E.getAlpha() >= 0.25f) {
                            p3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        p3 p3Var2 = this.b;
                        if (p3Var2.E.getAlpha() >= 0.25f) {
                            p3Var2.f(true);
                            break;
                        }
                        break;
                    default:
                        this.b.f(false);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.A = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        e3Var.addView(textView, h7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        zk0 zk0Var = new zk0(context, c6Var);
        this.n = zk0Var;
        zk0Var.setLayoutManager(new f2.x(3));
        f3 f3Var = new f3(this);
        this.r = f3Var;
        zk0Var.setAdapter(f3Var);
        zk0Var.setOnScrollListener(new g3(this));
        zk0Var.setClipToPadding(true);
        zk0Var.i(new u2());
        frameLayout.addView(zk0Var, h7.z5.e(-1, -1, 119));
        v2 v2Var = new v2(context, c6Var);
        v2Var.setViewType(2);
        v2Var.setAlpha(0.0f);
        v2Var.setVisibility(8);
        frameLayout.addView(v2Var, h7.z5.e(-1, -1, 119));
        iw0 iw0Var = new iw0(context, v2Var, 11, c6Var);
        this.s = iw0Var;
        eh.s sVar = iw0Var.d;
        sVar.setTextSize(1, 16.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
        sVar.setTypeface(null);
        sVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new a4(this, false, new ag.n0(this, 28));
        frameLayout.addView(iw0Var, h7.z5.e(-1, -1, 119));
        zk0Var.setEmptyView(iw0Var);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new x2(this);
        this.C = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i13 = 1;
        zk0Var.setOnItemClickListener(new pk0(this) { // from class: lh.s2
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.pk0
            public final void a(int i122, View view) {
                Utilities.Callback2 callback2;
                switch (i13) {
                    case 0:
                        p3 p3Var = this.b;
                        ArrayList arrayList2 = p3Var.U;
                        ArrayList arrayList3 = p3Var.d0;
                        if (i122 >= 2 && p3Var.S != null && (view instanceof l3)) {
                            l3 l3Var = (l3) view;
                            int i132 = i122 - 2;
                            if (!p3Var.V) {
                                if (p3Var.W) {
                                    if (i132 >= 0 && i132 < arrayList2.size()) {
                                        z7 z7Var = (z7) arrayList2.get(i132);
                                        p3Var.S.run(z7Var, z7Var.K ? p3.d(l3Var) : null);
                                        break;
                                    } else {
                                        i132 -= arrayList2.size();
                                    }
                                }
                            } else if (i132 == 0) {
                                p3Var.e(p3.f0, true);
                                break;
                            } else {
                                i132 = i122 - 3;
                            }
                            if (i132 >= 0 && i132 < p3Var.b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.b0.get(i132);
                                if (arrayList3.isEmpty() && !p3Var.M) {
                                    Utilities.Callback2 callback22 = p3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = p3.d(l3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > p3Var.N) {
                                        int i14 = -p3Var.J;
                                        p3Var.J = i14;
                                        AndroidUtilities.shakeViewSpring(l3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(p3Var.d);
                                    p3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        p3 p3Var2 = this.b;
                        f3 f3Var2 = p3Var2.r;
                        org.telegram.ui.ActionBar.v0 v0Var = p3Var2.C;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < f3Var2.c.size() && (callback2 = p3Var2.S) != null) {
                            callback2.run(f3Var2.c.get(i122), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().w.b;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                z7 z7Var = (z7) obj;
                if (!z7Var.g && !z7Var.w) {
                    this.U.add(z7Var);
                }
            }
        }
        if (z11) {
            this.D = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, h7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d g10 = rl.g(24, context, c6Var, true);
            this.F = g10;
            g10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                final int i15 = 1;
                g10.setOnClickListener(new View.OnClickListener(this) { // from class: lh.t2
                    public final /* synthetic */ p3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.B.M(null, null);
                                break;
                            case 1:
                                p3 p3Var = this.b;
                                if (p3Var.E.getAlpha() >= 0.25f) {
                                    p3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                p3 p3Var2 = this.b;
                                if (p3Var2.E.getAlpha() >= 0.25f) {
                                    p3Var2.f(true);
                                    break;
                                }
                                break;
                            default:
                                this.b.f(false);
                                break;
                        }
                    }
                });
            }
            d g11 = rl.g(24, context, c6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            cq cqVar = new cq(R.drawable.mini_collage, 0);
            cqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            g11.g(spannableStringBuilder, false, true);
            linearLayout.addView(g11, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            g11.setOnClickListener(new View.OnClickListener(this) { // from class: lh.t2
                public final /* synthetic */ p3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.B.M(null, null);
                            break;
                        case 1:
                            p3 p3Var = this.b;
                            if (p3Var.E.getAlpha() >= 0.25f) {
                                p3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            p3 p3Var2 = this.b;
                            if (p3Var2.E.getAlpha() >= 0.25f) {
                                p3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
        } else {
            this.E = null;
            this.F = null;
            ImageView imageView = new ImageView(context);
            this.D = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            h7.b6.b(imageView, 0.1f, 1.5f);
            addView(imageView, h7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lh.t2
                public final /* synthetic */ p3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.B.M(null, null);
                            break;
                        case 1:
                            p3 p3Var = this.b;
                            if (p3Var.E.getAlpha() >= 0.25f) {
                                p3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            p3 p3Var2 = this.b;
                            if (p3Var2.E.getAlpha() >= 0.25f) {
                                p3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f0;
        if (albumEntry == null || (albumEntry == albumEntry2 && this.U.size() <= 0)) {
            ArrayList arrayList3 = this.c0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.a0 = MediaController.allMediaAlbumEntry;
            } else {
                this.a0 = (MediaController.AlbumEntry) this.c0.get(0);
            }
        } else {
            this.a0 = albumEntry;
        }
        this.b0 = b(this.a0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.a0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(l3 l3Var) {
        Bitmap bitmap;
        if (l3Var == null || (bitmap = l3Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < albumEntry.photos.size(); i10++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            if (!this.H || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        i3 i3Var = this.f;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == NotificationCenter.storiesDraftsUpdated) {
                ArrayList arrayList = this.U;
                arrayList.clear();
                if (!this.H) {
                    ArrayList arrayList2 = MessagesController.getInstance(this.a).getStoriesController().w.b;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        z7 z7Var = (z7) obj;
                        if (!z7Var.g && !z7Var.w) {
                            arrayList.add(z7Var);
                        }
                    }
                }
                h();
                i();
                if (i3Var != null) {
                    i3Var.l();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.a0 != null) {
            while (true) {
                if (i13 >= MediaController.allMediaAlbums.size()) {
                    break;
                }
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                int i14 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.a0;
                if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.a0 = albumEntry;
                    break;
                }
                i13++;
            }
        } else {
            ArrayList arrayList3 = this.c0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.a0 = MediaController.allMediaAlbumEntry;
            } else {
                this.a0 = (MediaController.AlbumEntry) this.c0.get(0);
            }
        }
        this.b0 = b(this.a0);
        this.d0.clear();
        i();
        if (i3Var != null) {
            i3Var.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g10 = g();
        boolean z10 = g10 <= ((float) i0.a.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float e9 = this.O.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e9);
        if (z10 != this.w) {
            this.w = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.w ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.x;
        if (kVar != null) {
            kVar.setAlpha(e9);
            int i10 = e9 <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        ag.d dVar = this.e0;
        if (dVar != null) {
            dVar.setAlpha(1.0f - e9);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.a0 = albumEntry;
        this.b0 = b(albumEntry);
        this.d0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.a0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f.l();
        z2 z2Var = this.e;
        if (!z10) {
            z2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        sh.n nVar = new sh.n(getContext(), 2);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        z2Var.w0(nVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        l3 l3Var;
        if (this.T == null) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.S.run((MediaController.PhotoEntry) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            y2 y2Var = this.d;
            if (i10 >= size) {
                this.T.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(y2Var);
                j();
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                bitmap = null;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= y2Var.getChildCount()) {
                        l3Var = null;
                        break;
                    }
                    View childAt = y2Var.getChildAt(i11);
                    if (childAt instanceof l3) {
                        l3Var = (l3) childAt;
                        if (l3Var.O == photoEntry) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmap = d(l3Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        y2 y2Var = this.d;
        if (y2Var == null || y2Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < y2Var.getChildCount(); i11++) {
                View childAt = y2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        }
        return y2Var == null ? padding : AndroidUtilities.lerp(0, padding, y2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.a0;
    }

    public String getTitle() {
        return LocaleController.getString(this.H ? R.string.AddImage : R.string.ChoosePhotoOrVideo);
    }

    public final void h() {
        a aVar;
        e3 e3Var = this.B;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e3Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.c0 = arrayList2;
        Collections.sort(arrayList2, new ag.h(arrayList, 4));
        ArrayList arrayList3 = this.U;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.c0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, albumEntry);
        }
        boolean isEmpty2 = this.c0.isEmpty();
        TextView textView = this.y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A, (Drawable) null);
        int size = this.c0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.c0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.b);
                }
            }
            e3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ag.q0(26, this, albumEntry2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.c0;
        boolean z10 = true;
        boolean z11 = arrayList2 != null && !arrayList2.isEmpty() && this.c0.get(0) == this.a0 && this.U.size() > 2;
        this.V = z11;
        if (z11 || (this.a0 != f0 && ((arrayList = this.c0) == null || arrayList.isEmpty() || this.c0.get(0) != this.a0))) {
            z10 = false;
        }
        this.W = z10;
    }

    public final void j() {
        ArrayList arrayList = this.d0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        ImageView imageView = this.D;
        if (imageView != null) {
            rl.o(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), er.h, 320L);
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null) {
            d dVar = this.F;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.P != z10) {
                this.P = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(er.h).setDuration(320L).setListener(new ag.x(12, this, z10)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        l3.a0.clear();
        l3.b0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = l3.V;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        y2 y2Var = this.d;
        y2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        y2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        int dp4 = AndroidUtilities.dp(10.0f);
        TextView textView = this.y;
        textView.setPadding(0, i12, dp4, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i10, i11);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.N = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.S = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.T = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
