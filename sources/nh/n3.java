package nh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable A;
    public final c3 B;
    public final org.telegram.ui.ActionBar.w0 C;
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
    public final org.telegram.ui.Components.d6 O;
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
    public final w2 d;
    public final ArrayList d0;
    public final x2 e;
    public bh.d e0;
    public final g3 f;
    public final FrameLayout h;
    public final jl0 n;
    public final d3 r;
    public final qw0 s;
    public final w3 v;
    public boolean w;
    public final org.telegram.ui.ActionBar.l x;
    public final TextView y;

    public n3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f9, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.J = -2;
        this.O = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.Q = true;
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.d0 = new ArrayList();
        this.K = f9;
        this.a = i10;
        this.b = c6Var;
        this.H = z10;
        this.I = z11;
        this.L = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), TLObject.FLAG_27);
        w2 w2Var = new w2(this, context, c6Var);
        this.d = w2Var;
        w2Var.setItemSelectorColorProvider(new m4.a(5));
        g3 g3Var = new g3(this);
        this.f = g3Var;
        w2Var.setAdapter(g3Var);
        x2 x2Var = new x2(this);
        this.e = x2Var;
        w2Var.setLayoutManager(x2Var);
        w2Var.setFastScrollEnabled(1);
        w2Var.setFastScrollVisible(true);
        w2Var.getFastScroll().setAlpha(0.0f);
        x2Var.O = new y2(this);
        w2Var.i(new z2());
        w2Var.setClipToPadding(false);
        addView(w2Var, i7.f6.e(-1, -1, 119));
        final int i11 = 0;
        w2Var.setOnItemClickListener(new zk0(this) { // from class: nh.q2
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void c(int i12, View view) {
                Utilities.Callback2 callback2;
                switch (i11) {
                    case 0:
                        n3 n3Var = this.b;
                        ArrayList arrayList2 = n3Var.U;
                        ArrayList arrayList3 = n3Var.d0;
                        if (i12 >= 2 && n3Var.S != null && (view instanceof j3)) {
                            j3 j3Var = (j3) view;
                            int i13 = i12 - 2;
                            if (!n3Var.V) {
                                if (n3Var.W) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        o7 o7Var = (o7) arrayList2.get(i13);
                                        n3Var.S.run(o7Var, o7Var.K ? n3.d(j3Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                n3Var.e(n3.f0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < n3Var.b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) n3Var.b0.get(i13);
                                if (arrayList3.isEmpty() && !n3Var.M) {
                                    Utilities.Callback2 callback22 = n3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = n3.d(j3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > n3Var.N) {
                                        int i14 = -n3Var.J;
                                        n3Var.J = i14;
                                        AndroidUtilities.shakeViewSpring(j3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(n3Var.d);
                                    n3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        n3 n3Var2 = this.b;
                        d3 d3Var = n3Var2.r;
                        org.telegram.ui.ActionBar.w0 w0Var = n3Var2.C;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < d3Var.c.size() && (callback2 = n3Var2.S) != null) {
                            callback2.run(d3Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        w2Var.setOnItemLongClickListener(new l4.s0(this, 14));
        w2Var.setOnScrollListener(new a3(this));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var);
        this.x = lVar;
        lVar.setBackgroundColor(-14737633);
        lVar.setTitleColor(-1);
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.B(436207615, false);
        lVar.C(-1, false);
        lVar.C(-1, true);
        addView(lVar, i7.f6.e(-1, -2, 55));
        lVar.setActionBarMenuOnItemClick(new b3(this));
        org.telegram.ui.ActionBar.a0 n10 = lVar.n();
        c3 c3Var = new c3(this, context, n10, c6Var);
        this.B = c3Var;
        c3Var.setSubMenuOpenSide(1);
        lVar.addView(c3Var, 0, i7.f6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i12 = 0;
        c3Var.setOnClickListener(new View.OnClickListener(this) { // from class: nh.r2
            public final /* synthetic */ n3 b;

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
                        n3 n3Var = this.b;
                        if (n3Var.E.getAlpha() >= 0.25f) {
                            n3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        n3 n3Var2 = this.b;
                        if (n3Var2.E.getAlpha() >= 0.25f) {
                            n3Var2.f(true);
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
        c3Var.addView(textView, i7.f6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        jl0 jl0Var = new jl0(context, c6Var);
        this.n = jl0Var;
        jl0Var.setLayoutManager(new f2.w(3));
        d3 d3Var = new d3(this);
        this.r = d3Var;
        jl0Var.setAdapter(d3Var);
        jl0Var.setOnScrollListener(new e3(this));
        jl0Var.setClipToPadding(true);
        jl0Var.i(new s2());
        frameLayout.addView(jl0Var, i7.f6.e(-1, -1, 119));
        t2 t2Var = new t2(context, c6Var);
        t2Var.setViewType(2);
        t2Var.setAlpha(0.0f);
        t2Var.setVisibility(8);
        frameLayout.addView(t2Var, i7.f6.e(-1, -1, 119));
        qw0 qw0Var = new qw0(context, t2Var, 11, c6Var);
        this.s = qw0Var;
        gh.s sVar = qw0Var.d;
        sVar.setTextSize(1, 16.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
        sVar.setTypeface(null);
        sVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new w3(this, false, new b0(this, 3));
        frameLayout.addView(qw0Var, i7.f6.e(-1, -1, 119));
        jl0Var.setEmptyView(qw0Var);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new v2(this);
        this.C = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i13 = 1;
        jl0Var.setOnItemClickListener(new zk0(this) { // from class: nh.q2
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.zk0
            public final void c(int i122, View view) {
                Utilities.Callback2 callback2;
                switch (i13) {
                    case 0:
                        n3 n3Var = this.b;
                        ArrayList arrayList2 = n3Var.U;
                        ArrayList arrayList3 = n3Var.d0;
                        if (i122 >= 2 && n3Var.S != null && (view instanceof j3)) {
                            j3 j3Var = (j3) view;
                            int i132 = i122 - 2;
                            if (!n3Var.V) {
                                if (n3Var.W) {
                                    if (i132 >= 0 && i132 < arrayList2.size()) {
                                        o7 o7Var = (o7) arrayList2.get(i132);
                                        n3Var.S.run(o7Var, o7Var.K ? n3.d(j3Var) : null);
                                        break;
                                    } else {
                                        i132 -= arrayList2.size();
                                    }
                                }
                            } else if (i132 == 0) {
                                n3Var.e(n3.f0, true);
                                break;
                            } else {
                                i132 = i122 - 3;
                            }
                            if (i132 >= 0 && i132 < n3Var.b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) n3Var.b0.get(i132);
                                if (arrayList3.isEmpty() && !n3Var.M) {
                                    Utilities.Callback2 callback22 = n3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = n3.d(j3Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > n3Var.N) {
                                        int i14 = -n3Var.J;
                                        n3Var.J = i14;
                                        AndroidUtilities.shakeViewSpring(j3Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(n3Var.d);
                                    n3Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        n3 n3Var2 = this.b;
                        d3 d3Var2 = n3Var2.r;
                        org.telegram.ui.ActionBar.w0 w0Var = n3Var2.C;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < d3Var2.c.size() && (callback2 = n3Var2.S) != null) {
                            callback2.run(d3Var2.c.get(i122), null);
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
                o7 o7Var = (o7) obj;
                if (!o7Var.g && !o7Var.w) {
                    this.U.add(o7Var);
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
            addView(linearLayout, i7.f6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
            this.F = o10;
            o10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(o10, i7.f6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                final int i15 = 1;
                o10.setOnClickListener(new View.OnClickListener(this) { // from class: nh.r2
                    public final /* synthetic */ n3 b;

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
                                n3 n3Var = this.b;
                                if (n3Var.E.getAlpha() >= 0.25f) {
                                    n3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                n3 n3Var2 = this.b;
                                if (n3Var2.E.getAlpha() >= 0.25f) {
                                    n3Var2.f(true);
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
            d o11 = org.telegram.messenger.x3.o(24, context, c6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            iq iqVar = new iq(R.drawable.mini_collage, 0);
            iqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            o11.g(spannableStringBuilder, false, true);
            linearLayout.addView(o11, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            o11.setOnClickListener(new View.OnClickListener(this) { // from class: nh.r2
                public final /* synthetic */ n3 b;

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
                            n3 n3Var = this.b;
                            if (n3Var.E.getAlpha() >= 0.25f) {
                                n3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            n3 n3Var2 = this.b;
                            if (n3Var2.E.getAlpha() >= 0.25f) {
                                n3Var2.f(true);
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
            i7.h6.b(imageView, 0.1f, 1.5f);
            addView(imageView, i7.f6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: nh.r2
                public final /* synthetic */ n3 b;

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
                            n3 n3Var = this.b;
                            if (n3Var.E.getAlpha() >= 0.25f) {
                                n3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            n3 n3Var2 = this.b;
                            if (n3Var2.E.getAlpha() >= 0.25f) {
                                n3Var2.f(true);
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

    public static Bitmap d(j3 j3Var) {
        Bitmap bitmap;
        if (j3Var == null || (bitmap = j3Var.a) == null || bitmap.isRecycled()) {
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
        g3 g3Var = this.f;
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
                        o7 o7Var = (o7) obj;
                        if (!o7Var.g && !o7Var.w) {
                            arrayList.add(o7Var);
                        }
                    }
                }
                h();
                i();
                if (g3Var != null) {
                    g3Var.l();
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
        if (g3Var != null) {
            g3Var.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g10 = g();
        boolean z10 = g10 <= ((float) j7.l1.d(32.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float e10 = this.O.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e10);
        if (z10 != this.w) {
            this.w = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.w ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.x;
        if (lVar != null) {
            lVar.setAlpha(e10);
            int i10 = e10 <= 0.0f ? 8 : 0;
            if (lVar.getVisibility() != i10) {
                lVar.setVisibility(i10);
            }
        }
        bh.d dVar = this.e0;
        if (dVar != null) {
            dVar.setAlpha(1.0f - e10);
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
        x2 x2Var = this.e;
        if (!z10) {
            x2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
            return;
        }
        uh.n nVar = new uh.n(getContext(), 2);
        nVar.a = 1;
        nVar.p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
        x2Var.w0(nVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        j3 j3Var;
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
            w2 w2Var = this.d;
            if (i10 >= size) {
                this.T.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(w2Var);
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
                    if (i11 >= w2Var.getChildCount()) {
                        j3Var = null;
                        break;
                    }
                    View childAt = w2Var.getChildAt(i11);
                    if (childAt instanceof j3) {
                        j3Var = (j3) childAt;
                        if (j3Var.O == photoEntry) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmap = d(j3Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        w2 w2Var = this.d;
        if (w2Var == null || w2Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < w2Var.getChildCount(); i11++) {
                View childAt = w2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        }
        return w2Var == null ? padding : AndroidUtilities.lerp(0, padding, w2Var.getAlpha());
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
        c3 c3Var = this.B;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c3Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.c0 = arrayList2;
        Collections.sort(arrayList2, new a4.v(arrayList, 5));
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
            c3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ag.n(29, this, albumEntry2));
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
            org.telegram.ui.b.q(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), jr.h, 320L);
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
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(jr.h).setDuration(320L).setListener(new bg.z2(13, this, z10)).start();
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
        j3.a0.clear();
        j3.b0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = j3.V;
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
        float f9;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        w2 w2Var = this.d;
        w2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        w2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        int dp4 = AndroidUtilities.dp(10.0f);
        TextView textView = this.y;
        textView.setPadding(0, i12, dp4, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f9 = 18.0f;
                textView.setTextSize(f9);
                super.onMeasure(i10, i11);
            }
        }
        f9 = 20.0f;
        textView.setTextSize(f9);
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
