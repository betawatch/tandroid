package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mi0 extends FrameLayout {
    public static final /* synthetic */ int O = 0;
    public boolean B;
    public mr C;
    public xc0 D;
    public xc0 E;
    public org.telegram.ui.jc0 F;
    public ki0 G;
    public TextView H;
    public boolean I;
    public TLRPC.User J;
    public int K;
    public boolean L;
    public ji0 M;
    public org.telegram.ui.lc0 N;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public Rect n;
    public boolean r;
    public AnimatorSet s;
    public ii0 v;
    public boolean w;
    public int x;
    public int y;

    public final void a() {
        ii0 ii0Var = this.v;
        if (this.r) {
            return;
        }
        this.r = true;
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var, (Property<ii0, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ii0Var.getMeasuredHeight()));
        if (this.B) {
            float measuredHeight = ii0Var.getMeasuredHeight();
            this.s.setDuration(Math.max(60, (int) (((measuredHeight - ii0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.B = false;
        } else {
            this.s.setDuration(250L);
        }
        this.s.setInterpolator(mr.f);
        this.s.addListener(new li0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        ii0 ii0Var = this.v;
        int i10 = 0;
        if (!this.r) {
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.f || this.e || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y10 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (this.e && !this.f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.y) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float translationY = ii0Var.getTranslationY() + y10;
                        ii0Var.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                    float translationY2 = ii0Var.getTranslationY();
                    if (this.f || translationY2 != 0.0f) {
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if ((ii0Var.getTranslationY() >= AndroidUtilities.getPixelsInCM(0.8f, false) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.B = true;
                            a();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.h = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ii0Var, (Property<ii0, Float>) View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, r6) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(mr.g);
                            this.h.addListener(new li0(this, i10));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        }
                        this.f = false;
                    } else {
                        this.e = false;
                        this.f = false;
                    }
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
            } else {
                this.b = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                this.c = y11;
                if (y11 < ii0Var.getTop() || this.b < ii0Var.getLeft() || this.b > ii0Var.getRight()) {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
                this.d = motionEvent.getPointerId(0);
                this.e = true;
                AnimatorSet animatorSet2 = this.h;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.h = null;
                }
                VelocityTracker velocityTracker2 = this.a;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            if ((!z4 && this.e) || this.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z4) {
        boolean z10;
        TextView textView = this.H;
        TLRPC.User user = this.J;
        ki0 ki0Var = this.G;
        float value = getValue();
        String formatDistance = LocaleController.formatDistance(value, 2, Boolean.valueOf(this.L));
        int i10 = (int) value;
        org.telegram.ui.cd0 cd0Var = this.F.b;
        ArrayList arrayList = cd0Var.d0;
        IMapsProvider.ICircle iCircle = cd0Var.L;
        if (iCircle != null) {
            iCircle.setRadius(i10);
            if (z4) {
                IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(cd0Var.t0.getLatitude(), cd0Var.t0.getLongitude()));
                try {
                    int max = Math.max(i10, MediaDataController.MAX_LINKS_COUNT);
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    double d = max;
                    IMapsProvider.LatLng p02 = org.telegram.ui.cd0.p0(center, d, d);
                    double d10 = -max;
                    onCreateLatLngBoundsBuilder.include(org.telegram.ui.cd0.p0(center, d10, d10));
                    onCreateLatLngBoundsBuilder.include(p02);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    try {
                        cd0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), (int) ((cd0Var.O.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(40.0f)) + cd0Var.P.getTranslationY()));
                        cd0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, 0), 500, null);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!DialogObject.isChatDialog(cd0Var.b0)) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.ui.wc0 wc0Var = (org.telegram.ui.wc0) arrayList.get(i11);
                if (wc0Var.b != null && !UserObject.isUserSelf(wc0Var.c)) {
                    TLRPC.GeoPoint geoPoint = wc0Var.b.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (cd0Var.t0.distanceTo(location) > i10) {
                    }
                }
            }
            z10 = false;
            if (z10 && user != null) {
                textView.setText(LocaleController.formatString("LocationNotifiationCloser", R.string.LocationNotifiationCloser, formatDistance));
                if (ki0Var.getTag() == null) {
                    ki0Var.setTag(1);
                    ki0Var.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                    textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                }
                return;
            }
            if (user != null) {
                ki0Var.setText(LocaleController.formatString("LocationNotifiationButtonGroup", R.string.LocationNotifiationButtonGroup, formatDistance));
            } else {
                ki0Var.setText(LocaleController.formatString("LocationNotifiationButtonUser", R.string.LocationNotifiationButtonUser, TextUtils.ellipsize(UserObject.getFirstName(user), ki0Var.getPaint(), Math.max(AndroidUtilities.dp(10.0f), (int) (((this.K - AndroidUtilities.dp(94.0f)) * 1.5f) - ((int) Math.ceil(ki0Var.getPaint().measureText(LocaleController.getString(R.string.LocationNotifiationButtonUser)))))), TextUtils.TruncateAt.END), formatDistance));
            }
            if (ki0Var.getTag() == null) {
                ki0Var.setTag(null);
                ki0Var.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                return;
            }
            return;
        }
        z10 = true;
        if (z10) {
        }
        if (user != null) {
        }
        if (ki0Var.getTag() == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.M;
    }

    public boolean getRadiusSet() {
        return this.I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1 > 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        r1 = r1 * 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r1 > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float getValue() {
        float f10;
        float value = this.D.getValue() * MediaDataController.MAX_STYLE_RUNS_COUNT;
        int value2 = this.E.getValue();
        boolean z4 = this.L;
        if (z4) {
            if (value2 == 1) {
                f10 = 47.349f;
            }
        } else if (value2 == 1) {
            f10 = 50.0f;
        }
        float f11 = value + f10;
        return z4 ? f11 * 1.60934f : f11;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i13 - i11;
        ii0 ii0Var = this.v;
        int measuredHeight = i20 - ii0Var.getMeasuredHeight();
        int i21 = i12 - i10;
        int measuredWidth = (i21 - ii0Var.getMeasuredWidth()) / 2;
        ii0Var.layout(measuredWidth, measuredHeight, ii0Var.getMeasuredWidth() + measuredWidth, ii0Var.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8 && childAt != ii0Var) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & 112;
                int i25 = i23 & 7;
                if (i25 == 1) {
                    i14 = ((i21 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i25 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i24 != 16) {
                        i17 = ((i20 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i24 != 80) {
                        i19 = layoutParams.topMargin;
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = i20 - measuredHeight2;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = i12 - measuredWidth2;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i24 != 16) {
                }
                i19 = i17 - i18;
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.n);
        setMeasuredDimension(size, size2);
        ii0 ii0Var = this.v;
        ii0Var.measure(View.MeasureSpec.makeMeasureSpec((this.x * 2) + size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ii0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), 0);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.r || b(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.e && !this.f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
