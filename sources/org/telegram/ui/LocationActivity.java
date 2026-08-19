package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Adapters.LocationActivitySearchAdapter;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.LocationDirectionCell;
import org.telegram.ui.Cells.LocationLoadingCell;
import org.telegram.ui.Cells.LocationPoweredCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MapPlaceholderDrawable;
import org.telegram.ui.Components.ProximitySheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.Stories.recorder.HintView2;

/* loaded from: classes4.dex */
public class LocationActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private LocationActivityAdapter adapter;
    private AnimatorSet animatorSet;
    private int askWithRadius;
    private boolean canUndo;
    private TLRPC.TL_channelLocation chatLocation;
    private boolean currentMapStyleDark;
    private LocationActivityDelegate delegate;
    private long dialogId;
    private ImageView emptyImageView;
    private TextView emptySubtitleTextView;
    private TextView emptyTitleTextView;
    private LinearLayout emptyView;
    private boolean firstWas;
    private IMapsProvider.ICameraUpdate forceUpdate;
    public boolean fromStories;
    private boolean hasScreenshot;
    private HintView2 hintView;
    private TLRPC.TL_channelLocation initialLocation;
    private boolean initialMaxZoom;
    private IMapsProvider.IMarker lastPressedMarker;
    private FrameLayout lastPressedMarkerView;
    private VenueLocation lastPressedVenue;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ImageView locationButton;
    private int locationType;
    private IMapsProvider.IMap map;
    private ActionBarMenuItem mapTypeButton;
    private IMapsProvider.IMapView mapView;
    private FrameLayout mapViewClip;
    private boolean mapsInitialized;
    private Runnable markAsReadRunnable;
    private View markerImageView;
    private int markerTop;
    private MessageObject messageObject;
    private IMapsProvider.ICameraUpdate moveToBounds;
    private Location myLocation;
    private boolean onResumeCalled;
    private ActionBarMenuItem otherItem;
    private MapOverlayView overlayView;
    private ChatActivity parentFragment;
    private ActionBarPopupWindow popupWindow;
    private double previousRadius;
    private boolean proximityAnimationInProgress;
    private ImageView proximityButton;
    private IMapsProvider.ICircle proximityCircle;
    private ProximitySheet proximitySheet;
    private boolean scrolling;
    private LocationActivitySearchAdapter searchAdapter;
    private SearchButton searchAreaButton;
    private boolean searchInProgress;
    private ActionBarMenuItem searchItem;
    private RecyclerListView searchListView;
    private TL_stories.MediaArea searchStoriesArea;
    private boolean searchWas;
    private boolean searchedForCustomLocations;
    private boolean searching;
    private View shadow;
    private Drawable shadowDrawable;
    private GraySectionCell sharedMediaHeader;
    private SharedMediaLayout sharedMediaLayout;
    private TextView showAllButton;
    private boolean showAllMode;
    private Boolean shownShowAllButton;
    private Runnable updateRunnable;
    private Location userLocation;
    private boolean userLocationMoved;
    private float yOffset;
    private UndoView[] undoView = new UndoView[2];
    private boolean checkGpsEnabled = true;
    private boolean locationDenied = false;
    private boolean isFirstLocation = true;
    private boolean firstFocus = true;
    private ArrayList markers = new ArrayList();
    private LongSparseArray markersMap = new LongSparseArray();
    private long selectedMarkerId = -1;
    private ArrayList placeMarkers = new ArrayList();
    private boolean checkPermission = true;
    private boolean checkBackgroundPermission = true;
    private int overScrollHeight = (AndroidUtilities.displaySize.x - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
    private boolean isSharingAllowed = true;
    private Bitmap[] bitmapCache = new Bitmap[7];

    public static class LiveLocation {
        public ImageReceiver avatarReceiver;
        public TLRPC.Chat chat;
        public IMapsProvider.IMarker directionMarker;
        public boolean hasRotation;
        public long id;
        public IMapsProvider.IMarker marker;
        public TLRPC.Message object;
        public TLRPC.User user;
    }

    public interface LocationActivityDelegate {
        void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j);
    }

    public static class VenueLocation {
        public IMapsProvider.IMarker marker;
        public int num;
        public TLRPC.TL_messageMediaVenue venue;
    }

    public static /* synthetic */ boolean $r8$lambda$K_SblFMYpnuCjrLTuOQWSwldEmo(View view, MotionEvent motionEvent) {
        return true;
    }

    protected boolean disablePermissionCheck() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    static /* synthetic */ float access$3116(LocationActivity locationActivity, float f) {
        float f2 = locationActivity.yOffset + f;
        locationActivity.yOffset = f2;
        return f2;
    }

    private static class SearchButton extends TextView {
        private float additionanTranslationY;
        private float currentTranslationY;

        public SearchButton(Context context) {
            super(context);
        }

        @Override // android.view.View
        public float getTranslationX() {
            return this.additionanTranslationY;
        }

        @Override // android.view.View
        public void setTranslationX(float f) {
            this.additionanTranslationY = f;
            updateTranslationY();
        }

        public void setTranslation(float f) {
            this.currentTranslationY = f;
            updateTranslationY();
        }

        private void updateTranslationY() {
            setTranslationY(this.currentTranslationY + this.additionanTranslationY);
        }
    }

    public class MapOverlayView extends FrameLayout {
        private HashMap views;

        public MapOverlayView(Context context) {
            super(context);
            this.views = new HashMap();
        }

        public void addInfoView(IMapsProvider.IMarker iMarker) {
            final VenueLocation venueLocation = (VenueLocation) iMarker.getTag();
            if (venueLocation == null || LocationActivity.this.lastPressedVenue == venueLocation) {
                return;
            }
            LocationActivity.this.showSearchPlacesButton(false);
            if (LocationActivity.this.lastPressedMarker != null) {
                removeInfoView(LocationActivity.this.lastPressedMarker);
                LocationActivity.this.lastPressedMarker = null;
            }
            LocationActivity.this.lastPressedVenue = venueLocation;
            LocationActivity.this.lastPressedMarker = iMarker;
            Context context = getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, LayoutHelper.createFrame(-2, 114.0f));
            LocationActivity.this.lastPressedMarkerView = new FrameLayout(context);
            LocationActivity.this.lastPressedMarkerView.setBackgroundResource(R.drawable.venue_tooltip);
            LocationActivity.this.lastPressedMarkerView.getBackground().setColorFilter(new PorterDuffColorFilter(LocationActivity.this.getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
            frameLayout.addView(LocationActivity.this.lastPressedMarkerView, LayoutHelper.createFrame(-2, 71.0f));
            LocationActivity.this.lastPressedMarkerView.setAlpha(0.0f);
            LocationActivity.this.lastPressedMarkerView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$MapOverlayView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LocationActivity.MapOverlayView.$r8$lambda$P9lfQWAZdkR9ImpFeAJNt4c-eSM(LocationActivity.MapOverlayView.this, venueLocation, view);
                }
            });
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            textView.setTextColor(LocationActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            LocationActivity.this.lastPressedMarkerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setMaxLines(1);
            textView2.setEllipsize(truncateAt);
            textView2.setSingleLine(true);
            textView2.setTextColor(LocationActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            LocationActivity.this.lastPressedMarkerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(venueLocation.venue.title);
            textView2.setText(LocaleController.getString(R.string.TapToSendLocation));
            final FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(36.0f), LocationCell.getColorForIndex(venueLocation.num)));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImage("https://ss3.4sqi.net/img/categories_v2/" + venueLocation.venue.venue_type + "_64.png", null, null);
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(30, 30, 17));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.LocationActivity.MapOverlayView.1
                private final float[] animatorValues = {0.0f, 1.0f};
                private boolean startedInner;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float interpolation;
                    float lerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
                    if (lerp >= 0.7f && !this.startedInner && LocationActivity.this.lastPressedMarkerView != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        this.startedInner = true;
                    }
                    if (lerp <= 0.5f) {
                        interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(lerp / 0.5f) * 1.1f;
                    } else if (lerp <= 0.75f) {
                        interpolation = 1.1f - (CubicBezierInterpolator.EASE_OUT.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
                    } else {
                        interpolation = (CubicBezierInterpolator.EASE_OUT.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
                    }
                    frameLayout2.setScaleX(interpolation);
                    frameLayout2.setScaleY(interpolation);
                }
            });
            ofFloat.setDuration(360L);
            ofFloat.start();
            this.views.put(iMarker, frameLayout);
            LocationActivity.this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), NotificationCenter.dialogsUnreadPollVotesCounterChanged, null);
        }

        public static /* synthetic */ void $r8$lambda$P9lfQWAZdkR9ImpFeAJNt4c-eSM(final MapOverlayView mapOverlayView, final VenueLocation venueLocation, View view) {
            if (LocationActivity.this.parentFragment == null || !LocationActivity.this.parentFragment.isInScheduleMode()) {
                LocationActivity.this.delegate.didSelectLocation(venueLocation.venue, LocationActivity.this.locationType, true, 0, 0L);
                LocationActivity.this.finishFragment();
            } else {
                AlertsCreator.createScheduleDatePickerDialog(LocationActivity.this.getParentActivity(), LocationActivity.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.LocationActivity$MapOverlayView$$ExternalSyntheticLambda1
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i, int i2) {
                        LocationActivity.MapOverlayView.$r8$lambda$niKgILWKtkIQa0O5T050Ptz2oMU(LocationActivity.MapOverlayView.this, venueLocation, z, i, i2);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$niKgILWKtkIQa0O5T050Ptz2oMU(MapOverlayView mapOverlayView, VenueLocation venueLocation, boolean z, int i, int i2) {
            LocationActivity.this.delegate.didSelectLocation(venueLocation.venue, LocationActivity.this.locationType, z, i, 0L);
            LocationActivity.this.finishFragment();
        }

        public void removeInfoView(IMapsProvider.IMarker iMarker) {
            View view = (View) this.views.get(iMarker);
            if (view != null) {
                removeView(view);
                this.views.remove(iMarker);
            }
        }

        public void updatePositions() {
            if (LocationActivity.this.map == null) {
                return;
            }
            IMapsProvider.IProjection projection = LocationActivity.this.map.getProjection();
            for (Map.Entry entry : this.views.entrySet()) {
                IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY((screenLocation.y - view.getMeasuredHeight()) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public LocationActivity(int i) {
        this.locationType = i;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public LocationActivity searchStories(TL_stories.MediaArea mediaArea) {
        this.searchStoriesArea = mediaArea;
        return this;
    }

    public void setInitialMaxZoom(boolean z) {
        this.initialMaxZoom = z;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.mapView;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.destroy();
        }
        LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
        if (locationActivitySearchAdapter != null) {
            locationActivitySearchAdapter.destroy();
        }
        Runnable runnable = this.updateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRunnable = null;
        }
        Runnable runnable2 = this.markAsReadRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.markAsReadRunnable = null;
        }
        int size = this.markers.size();
        for (int i = 0; i < size; i++) {
            LiveLocation liveLocation = (LiveLocation) this.markers.get(i);
            ImageReceiver imageReceiver = liveLocation.avatarReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                liveLocation.avatarReceiver = null;
            }
        }
    }

    private UndoView getUndoView() {
        if (this.undoView[0].getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(true, 2);
            this.mapViewClip.removeView(this.undoView[0]);
            this.mapViewClip.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    public void setSharingAllowed(boolean z) {
        this.isSharingAllowed = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0a28 A[LOOP:0: B:95:0x0a26->B:96:0x0a28, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v54, types: [org.telegram.ui.Adapters.LocationActivityAdapter] */
    /* JADX WARN: Type inference failed for: r0v56, types: [org.telegram.ui.Components.RecyclerListView] */
    /* JADX WARN: Type inference failed for: r0v62, types: [androidx.recyclerview.widget.DefaultItemAnimator] */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11, types: [int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View createView(final Context context) {
        boolean z;
        INavigationLayout iNavigationLayout;
        Rect rect;
        int i;
        FrameLayout.LayoutParams layoutParams;
        MessageObject messageObject;
        MessageObject messageObject2;
        RecyclerListView recyclerListView;
        boolean z2;
        TLRPC.Chat chat;
        FrameLayout.LayoutParams layoutParams2;
        Rect rect2;
        ActionBarMenu actionBarMenu;
        int i2;
        char c;
        ?? r8;
        int i3;
        MessageObject messageObject3;
        MessageObject messageObject4;
        boolean z3;
        TLRPC.TL_channelLocation tL_channelLocation;
        MessageObject messageObject5;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i4;
        int checkSelfPermission;
        this.searchWas = false;
        this.searching = false;
        this.searchInProgress = false;
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.destroy();
        }
        LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
        if (locationActivitySearchAdapter != null) {
            locationActivitySearchAdapter.destroy();
        }
        if (this.chatLocation != null) {
            Location location = new Location("network");
            this.userLocation = location;
            location.setLatitude(this.chatLocation.geo_point.lat);
            this.userLocation.setLongitude(this.chatLocation.geo_point._long);
        } else if (this.messageObject != null) {
            Location location2 = new Location("network");
            this.userLocation = location2;
            location2.setLatitude(this.messageObject.messageOwner.media.geo.lat);
            this.userLocation.setLongitude(this.messageObject.messageOwner.media.geo._long);
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null) {
            checkSelfPermission = getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
            if (checkSelfPermission != 0) {
                z = true;
                this.locationDenied = z;
                ActionBar actionBar = this.actionBar;
                int i5 = Theme.key_dialogBackground;
                actionBar.setBackgroundColor(getThemedColor(i5));
                ActionBar actionBar2 = this.actionBar;
                int i6 = Theme.key_dialogTextBlack;
                actionBar2.setTitleColor(getThemedColor(i6));
                this.actionBar.setItemsColor(getThemedColor(i6), false);
                this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_dialogButtonSelector), false);
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.setAllowOverlayTitle(true);
                iNavigationLayout = this.parentLayout;
                if (iNavigationLayout != null && iNavigationLayout.isLayersLayout()) {
                    this.actionBar.setOccupyStatusBar(false);
                }
                this.actionBar.setAddToContainer(false);
                this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.LocationActivity.1
                    @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
                    public void onItemClick(int i7) {
                        if (i7 == -1) {
                            LocationActivity.this.finishFragment();
                            return;
                        }
                        if (i7 != 1) {
                            if (i7 == 5) {
                                LocationActivity.this.openShareLiveLocation(false, 0);
                                return;
                            } else {
                                if (i7 == 6) {
                                    LocationActivity.this.openDirections(null);
                                    return;
                                }
                                return;
                            }
                        }
                        try {
                            double d = LocationActivity.this.messageObject.messageOwner.media.geo.lat;
                            double d2 = LocationActivity.this.messageObject.messageOwner.media.geo._long;
                            LocationActivity.this.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                });
                ActionBarMenu createMenu = this.actionBar.createMenu();
                if (this.chatLocation == null) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    MessageObject messageObject6 = this.messageObject;
                    if (messageObject6 != null) {
                        if (messageObject6.isLiveLocation()) {
                            this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                            ActionBarMenuItem addItem = createMenu.addItem(0, R.drawable.ic_ab_other, getResourceProvider());
                            this.otherItem = addItem;
                            addItem.addSubItem(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
                        } else {
                            String str = this.messageObject.messageOwner.media.title;
                            if (str != null && str.length() > 0) {
                                this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                            } else {
                                this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                            }
                            if (this.locationType != 3) {
                                ActionBarMenuItem addItem2 = createMenu.addItem(0, R.drawable.ic_ab_other, getResourceProvider());
                                this.otherItem = addItem2;
                                addItem2.addSubItem(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                                if (!getLocationController().isSharingLocation(this.dialogId) && this.isSharingAllowed) {
                                    this.otherItem.addSubItem(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                                }
                                this.otherItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                            }
                        }
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                        if (this.locationType != 4) {
                            this.overlayView = new MapOverlayView(context);
                            ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, R.drawable.outline_header_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() { // from class: org.telegram.ui.LocationActivity.2
                                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
                                public void onSearchExpand() {
                                    LocationActivity.this.searching = true;
                                }

                                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
                                public void onSearchCollapse() {
                                    LocationActivity.this.searching = false;
                                    LocationActivity.this.searchWas = false;
                                    LocationActivity.this.searchAdapter.searchDelayed(null, null);
                                    LocationActivity.this.updateEmptyView();
                                    if (LocationActivity.this.locationType == 8) {
                                        if (LocationActivity.this.otherItem != null) {
                                            LocationActivity.this.otherItem.setVisibility(0);
                                        }
                                        LocationActivity.this.listView.setVisibility(0);
                                        LocationActivity.this.mapViewClip.setVisibility(0);
                                        LocationActivity.this.searchListView.setAdapter(null);
                                        LocationActivity.this.searchListView.setVisibility(8);
                                    }
                                }

                                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemSearchListener
                                public void onTextChanged(EditText editText) {
                                    if (LocationActivity.this.searchAdapter == null) {
                                        return;
                                    }
                                    String obj = editText.getText().toString();
                                    if (obj.length() != 0) {
                                        LocationActivity.this.searchWas = true;
                                        LocationActivity.this.searchItem.setShowSearchProgress(true);
                                        if (LocationActivity.this.otherItem != null) {
                                            LocationActivity.this.otherItem.setVisibility(8);
                                        }
                                        LocationActivity.this.listView.setVisibility(8);
                                        LocationActivity.this.mapViewClip.setVisibility(8);
                                        if (LocationActivity.this.searchListView.getAdapter() != LocationActivity.this.searchAdapter) {
                                            LocationActivity.this.searchListView.setAdapter(LocationActivity.this.searchAdapter);
                                        }
                                        LocationActivity.this.searchListView.setVisibility(0);
                                        LocationActivity locationActivity = LocationActivity.this;
                                        locationActivity.searchInProgress = locationActivity.searchAdapter.getItemCount() == 0;
                                    } else {
                                        if (LocationActivity.this.otherItem != null) {
                                            LocationActivity.this.otherItem.setVisibility(0);
                                        }
                                        LocationActivity.this.listView.setVisibility(0);
                                        LocationActivity.this.mapViewClip.setVisibility(0);
                                        LocationActivity.this.searchListView.setAdapter(null);
                                        LocationActivity.this.searchListView.setVisibility(8);
                                    }
                                    LocationActivity.this.updateEmptyView();
                                    LocationActivity.this.searchAdapter.searchDelayed(obj, LocationActivity.this.userLocation);
                                }
                            });
                            this.searchItem = actionBarMenuItemSearchListener;
                            int i7 = R.string.Search;
                            actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(i7));
                            this.searchItem.setContentDescription(LocaleController.getString(i7));
                            EditTextBoldCursor searchField = this.searchItem.getSearchField();
                            searchField.setTextColor(getThemedColor(i6));
                            searchField.setCursorColor(getThemedColor(i6));
                            searchField.setHintTextColor(getThemedColor(Theme.key_chat_messagePanelHint));
                        }
                    }
                }
                NestedFrameLayout nestedFrameLayout = new NestedFrameLayout(context);
                this.fragmentView = nestedFrameLayout;
                nestedFrameLayout.setBackgroundColor(getThemedColor(i5));
                Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.shadowDrawable = mutate;
                int themedColor = getThemedColor(i5);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                rect = new Rect();
                this.shadowDrawable.getPadding(rect);
                i = this.locationType;
                if (i != 0 || i == 1) {
                    layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
                }
                layoutParams.gravity = 83;
                FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.LocationActivity.3
                    @Override // android.widget.FrameLayout, android.view.View
                    protected void onMeasure(int i8, int i9) {
                        super.onMeasure(i8, i9);
                        if (LocationActivity.this.overlayView != null) {
                            LocationActivity.this.overlayView.updatePositions();
                        }
                    }
                };
                this.mapViewClip = frameLayout;
                frameLayout.setBackgroundDrawable(new MapPlaceholderDrawable(isActiveThemeDark()));
                messageObject = this.messageObject;
                if ((messageObject == null && ((i4 = this.locationType) == 0 || i4 == 1)) || (messageObject != null && this.locationType == 3)) {
                    SearchButton searchButton = new SearchButton(context);
                    this.searchAreaButton = searchButton;
                    searchButton.setTranslationX(-AndroidUtilities.dp(80.0f));
                    Drawable createSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(40.0f), getThemedColor(Theme.key_location_actionBackground), getThemedColor(Theme.key_location_actionPressedBackground));
                    ScaleStateListAnimator.apply(this.searchAreaButton);
                    this.searchAreaButton.setTranslationZ(AndroidUtilities.dp(2.0f));
                    this.searchAreaButton.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
                    this.searchAreaButton.setBackgroundDrawable(createSimpleSelectorRoundRectDrawable);
                    this.searchAreaButton.setTextColor(getThemedColor(Theme.key_location_actionActiveIcon));
                    this.searchAreaButton.setTextSize(1, 14.0f);
                    this.searchAreaButton.setTypeface(AndroidUtilities.bold());
                    this.searchAreaButton.setGravity(17);
                    this.searchAreaButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                    this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
                    if (this.locationType == 3) {
                        this.searchAreaButton.setText(LocaleController.getString(R.string.OpenInMaps));
                        this.searchAreaButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LocationActivity.$r8$lambda$TgBAlPNLxVqLqRqMIPgRH6hXbOo(LocationActivity.this, view);
                            }
                        });
                        this.searchAreaButton.setTranslationX(0.0f);
                    } else {
                        this.searchAreaButton.setText(LocaleController.getString(R.string.PlacesInThisArea));
                        this.searchAreaButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda11
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                LocationActivity.$r8$lambda$fzvvmd5fwtwkkQSJe_vOdygbx4U(LocationActivity.this, view);
                            }
                        });
                    }
                }
                int i8 = Theme.key_location_actionIcon;
                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor(i8), getResourceProvider());
                this.mapTypeButton = actionBarMenuItem;
                actionBarMenuItem.setClickable(true);
                this.mapTypeButton.setSubMenuOpenSide(2);
                this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
                this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
                this.mapTypeButton.addSubItem(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
                this.mapTypeButton.addSubItem(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
                this.mapTypeButton.addSubItem(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
                this.mapTypeButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                int dp = AndroidUtilities.dp(40.0f);
                int i9 = Theme.key_location_actionBackground;
                int themedColor2 = getThemedColor(i9);
                int i10 = Theme.key_location_actionPressedBackground;
                Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(dp, themedColor2, getThemedColor(i10));
                ScaleStateListAnimator.apply(this.mapTypeButton);
                this.mapTypeButton.setTranslationZ(AndroidUtilities.dp(2.0f));
                ActionBarMenuItem actionBarMenuItem2 = this.mapTypeButton;
                ViewOutlineProvider viewOutlineProvider = ViewOutlineProviderImpl.BOUNDS_OVAL;
                actionBarMenuItem2.setOutlineProvider(viewOutlineProvider);
                this.mapTypeButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
                this.mapTypeButton.setIcon(R.drawable.msg_map_type);
                this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
                this.mapTypeButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda12
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocationActivity.this.mapTypeButton.toggleSubMenu();
                    }
                });
                this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda13
                    @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
                    public final void onItemClick(int i11) {
                        LocationActivity.$r8$lambda$nW2fiSepowAwRnCceqFn92NpP3o(LocationActivity.this, i11);
                    }
                });
                this.locationButton = new ImageView(context);
                Drawable createSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i9), getThemedColor(i10));
                ScaleStateListAnimator.apply(this.locationButton);
                this.locationButton.setTranslationZ(AndroidUtilities.dp(2.0f));
                this.locationButton.setOutlineProvider(viewOutlineProvider);
                this.locationButton.setBackground(createSimpleSelectorCircleDrawable2);
                this.locationButton.setImageResource(R.drawable.msg_current_location);
                ImageView imageView = this.locationButton;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView.setScaleType(scaleType);
                ImageView imageView2 = this.locationButton;
                int i11 = Theme.key_location_actionActiveIcon;
                imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), mode));
                this.locationButton.setTag(Integer.valueOf(i11));
                this.locationButton.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
                FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
                createFrame.bottomMargin += layoutParams3.height - rect.top;
                this.mapViewClip.addView(this.locationButton, createFrame);
                this.locationButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda14
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocationActivity.$r8$lambda$EmhefR8ZnXkolfaki0AKR-kaJLY(LocationActivity.this, view);
                    }
                });
                TextView textView = new TextView(context);
                this.showAllButton = textView;
                textView.setGravity(17);
                this.showAllButton.setTranslationZ(AndroidUtilities.dp(2.0f));
                this.showAllButton.setTextSize(1, 15.0f);
                this.showAllButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourceProvider));
                this.showAllButton.setTypeface(AndroidUtilities.bold());
                this.showAllButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                this.showAllButton.setText(LocaleController.getString(R.string.LocationsShowAll));
                this.showAllButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i9), getThemedColor(i10), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
                FrameLayout.LayoutParams createFrame2 = LayoutHelper.createFrame(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
                createFrame2.bottomMargin += layoutParams3.height - rect.top;
                this.mapViewClip.addView(this.showAllButton, createFrame2);
                ScaleStateListAnimator.apply(this.showAllButton);
                this.showAllButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda15
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocationActivity.$r8$lambda$Dou7wgDFunZJ0ZmRFBEO3bAbI6Q(LocationActivity.this, view);
                    }
                });
                showShowAllButton(false, false);
                this.proximityButton = new ImageView(context);
                Drawable createSimpleSelectorCircleDrawable3 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i9), getThemedColor(i10));
                ScaleStateListAnimator.apply(this.proximityButton);
                this.proximityButton.setTranslationZ(AndroidUtilities.dp(2.0f));
                this.proximityButton.setOutlineProvider(viewOutlineProvider);
                this.proximityButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i8), mode));
                this.proximityButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable3);
                this.proximityButton.setScaleType(scaleType);
                this.proximityButton.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
                this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
                this.proximityButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda16
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocationActivity.$r8$lambda$P48XeYVvsix6VEHSSVETgKPkfhc(LocationActivity.this, view);
                    }
                });
                TLRPC.Chat chat2 = DialogObject.isChatDialog(this.dialogId) ? getMessagesController().getChat(Long.valueOf(-this.dialogId)) : null;
                messageObject2 = this.messageObject;
                if (messageObject2 != null || !messageObject2.isLiveLocation() || this.messageObject.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat2) && !chat2.megagroup)) {
                    this.proximityButton.setVisibility(8);
                    this.proximityButton.setImageResource(R.drawable.msg_location_alert);
                } else {
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                        this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
                    } else {
                        if (DialogObject.isUserDialog(this.dialogId) && this.messageObject.getFromChatId() == getUserConfig().getClientUserId()) {
                            this.proximityButton.setVisibility(4);
                            this.proximityButton.setAlpha(0.0f);
                            this.proximityButton.setScaleX(0.4f);
                            this.proximityButton.setScaleY(0.4f);
                        }
                        this.proximityButton.setImageResource(R.drawable.msg_location_alert);
                    }
                }
                HintView2 hintView2 = new HintView2(context, 1);
                this.hintView = hintView2;
                hintView2.setLayerType(2, null);
                this.hintView.setDuration(4000L);
                this.hintView.setJoint(1.0f, -25.0f);
                this.hintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                this.mapViewClip.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.emptyView = linearLayout;
                linearLayout.setOrientation(1);
                this.emptyView.setGravity(1);
                this.emptyView.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
                this.emptyView.setVisibility(8);
                nestedFrameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
                this.emptyView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda17
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return LocationActivity.$r8$lambda$K_SblFMYpnuCjrLTuOQWSwldEmo(view, motionEvent);
                    }
                });
                ImageView imageView3 = new ImageView(context);
                this.emptyImageView = imageView3;
                imageView3.setImageResource(R.drawable.location_empty);
                this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), mode));
                this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
                TextView textView2 = new TextView(context);
                this.emptyTitleTextView = textView2;
                int i12 = Theme.key_dialogEmptyText;
                textView2.setTextColor(getThemedColor(i12));
                this.emptyTitleTextView.setGravity(17);
                this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
                this.emptyTitleTextView.setTextSize(1, 17.0f);
                this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoPlacesFound));
                this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
                TextView textView3 = new TextView(context);
                this.emptySubtitleTextView = textView3;
                textView3.setTextColor(getThemedColor(i12));
                this.emptySubtitleTextView.setGravity(17);
                this.emptySubtitleTextView.setTextSize(1, 15.0f);
                this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
                this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
                RecyclerListView recyclerListView2 = new RecyclerListView(context);
                this.listView = recyclerListView2;
                int i13 = this.locationType;
                long j = this.dialogId;
                Theme.ResourcesProvider resourceProvider = getResourceProvider();
                boolean z4 = this.fromStories;
                if (this.locationType == 8) {
                    recyclerListView = recyclerListView2;
                    z2 = true;
                } else {
                    recyclerListView = recyclerListView2;
                    z2 = false;
                }
                LocationActivityAdapter locationActivityAdapter2 = new LocationActivityAdapter(context, i13, j, false, resourceProvider, false, z4, z2) { // from class: org.telegram.ui.LocationActivity.4
                    private boolean firstSet = true;

                    @Override // org.telegram.ui.Adapters.LocationActivityAdapter
                    protected void onDirectionClick() {
                        LocationActivity.this.openDirections(null);
                    }

                    @Override // org.telegram.ui.Adapters.LocationActivityAdapter
                    public void setLiveLocations(ArrayList arrayList) {
                        int i14;
                        if (LocationActivity.this.messageObject != null && LocationActivity.this.messageObject.isLiveLocation()) {
                            if (arrayList != null) {
                                i14 = 0;
                                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                    LiveLocation liveLocation = (LiveLocation) arrayList.get(i15);
                                    if (liveLocation != null && !UserObject.isUserSelf(liveLocation.user)) {
                                        i14++;
                                    }
                                }
                            } else {
                                i14 = 0;
                            }
                            if (this.firstSet && i14 == 1) {
                                LocationActivity.this.selectedMarkerId = ((LiveLocation) arrayList.get(0)).id;
                            }
                            this.firstSet = false;
                            LocationActivity.this.otherItem.setVisibility(i14 != 1 ? 8 : 0);
                        }
                        super.setLiveLocations(arrayList);
                    }
                };
                this.adapter = locationActivityAdapter2;
                recyclerListView.setAdapter(locationActivityAdapter2);
                RecyclerListView recyclerListView3 = this.listView;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
                this.layoutManager = linearLayoutManager;
                recyclerListView3.setLayoutManager(linearLayoutManager);
                if (this.searchStoriesArea != null) {
                    this.sharedMediaHeader = new GraySectionCell(context, this.resourceProvider);
                    i3 = 1;
                    actionBarMenu = createMenu;
                    layoutParams2 = layoutParams3;
                    rect2 = rect;
                    chat = chat2;
                    SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, 0L, new SharedMediaLayout.SharedMediaPreloader(this), 0, null, null, null, 8, 0, this, new SharedMediaLayout.Delegate() { // from class: org.telegram.ui.LocationActivity.5
                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public boolean canSearchMembers() {
                            return false;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public TLRPC.Chat getCurrentChat() {
                            return null;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public boolean isFragmentOpened() {
                            return true;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z5, boolean z6, View view) {
                            return false;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public void scrollToSharedMedia() {
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public RecyclerListView getListView() {
                            return LocationActivity.this.listView;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout.Delegate
                        public void updateSelectedMediaTabText() {
                            int storiesCount = LocationActivity.this.sharedMediaLayout == null ? 0 : LocationActivity.this.sharedMediaLayout.getStoriesCount(8);
                            LocationActivity.this.sharedMediaHeader.setText(LocaleController.formatPluralString("LocationStories", storiesCount, new Object[0]));
                            if (LocationActivity.this.adapter.setSharedMediaLayoutVisible(storiesCount > 0)) {
                                LocationActivity.this.listView.smoothScrollBy(0, AndroidUtilities.dp(200.0f));
                            }
                        }
                    }, 0, getResourceProvider()) { // from class: org.telegram.ui.LocationActivity.6
                        @Override // org.telegram.ui.Components.SharedMediaLayout
                        protected boolean customTabs() {
                            return true;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout
                        public int mediaPageTopMargin() {
                            return 32;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout
                        public int overrideColumnsCount() {
                            return 3;
                        }

                        @Override // org.telegram.ui.Components.SharedMediaLayout
                        public TL_stories.MediaArea getStoriesArea() {
                            return LocationActivity.this.searchStoriesArea;
                        }
                    };
                    this.sharedMediaLayout = sharedMediaLayout;
                    sharedMediaLayout.setBackgroundColor(getThemedColor(i5));
                    i2 = -1;
                    this.sharedMediaLayout.addView(this.sharedMediaHeader, LayoutHelper.createFrame(-1, 32, 55));
                    this.adapter.setSharedMediaLayout(this.sharedMediaLayout);
                    c = 2;
                    this.listView.setOverScrollMode(2);
                    DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                    r8 = 0;
                    defaultItemAnimator.setSupportsChangeAnimations(false);
                    defaultItemAnimator.setDelayAnimations(false);
                    defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    defaultItemAnimator.setDurations(350L);
                    this.listView.setItemAnimator(defaultItemAnimator);
                } else {
                    chat = chat2;
                    layoutParams2 = layoutParams3;
                    rect2 = rect;
                    actionBarMenu = createMenu;
                    i2 = -1;
                    c = 2;
                    r8 = 0;
                    i3 = 1;
                }
                this.adapter.setMyLocationDenied(this.locationDenied, r8);
                this.adapter.setUpdateRunnable(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationActivity.this.updateClipView(false);
                    }
                });
                this.listView.setVerticalScrollBarEnabled(r8);
                nestedFrameLayout.addView(this.listView, LayoutHelper.createFrame(i2, i2, 51));
                messageObject3 = this.messageObject;
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
                    this.adapter.setAddressNameOverride(this.messageObject.messageOwner.media.address);
                }
                this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.LocationActivity.7
                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i14) {
                        LocationActivity.this.scrolling = i14 != 0;
                        if (LocationActivity.this.scrolling || LocationActivity.this.forceUpdate == null) {
                            return;
                        }
                        LocationActivity.this.forceUpdate = null;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i14, int i15) {
                        LocationActivity.this.updateClipView(false);
                        if (LocationActivity.this.forceUpdate != null) {
                            LocationActivity.access$3116(LocationActivity.this, i15);
                        }
                    }
                });
                ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(r8);
                this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda1
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
                    public final boolean onItemClick(View view, int i14) {
                        return LocationActivity.$r8$lambda$RRG4mZjmsEWVcWSO16To_y4HczE(LocationActivity.this, context, view, i14);
                    }
                });
                this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda2
                    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                    public final void onItemClick(View view, int i14) {
                        LocationActivity.$r8$lambda$11Q_tDtm04F3_CcRhPlbNJTcsXc(LocationActivity.this, view, i14);
                    }
                });
                this.adapter.setDelegate(this.dialogId, new BaseLocationAdapter.BaseLocationAdapterDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda3
                    @Override // org.telegram.ui.Adapters.BaseLocationAdapter.BaseLocationAdapterDelegate
                    public final void didLoadSearchResult(ArrayList arrayList) {
                        LocationActivity.this.updatePlacesMarkers(arrayList);
                    }
                });
                this.adapter.setOverScrollHeight(this.overScrollHeight);
                nestedFrameLayout.addView(this.mapViewClip, LayoutHelper.createFrame(i2, i2, 51));
                IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
                this.mapView = onCreateMapView;
                onCreateMapView.getView().setAlpha(0.0f);
                this.mapView.setOnDispatchTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda4
                    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
                    public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                        return LocationActivity.$r8$lambda$zEZ5BV3rTdK9PEXsOKpIIJkLIYg(LocationActivity.this, motionEvent, iCallableMethod);
                    }
                });
                this.mapView.setOnInterceptTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda5
                    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
                    public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                        return LocationActivity.$r8$lambda$_VrR_enDxKsuEuK7304x0HoWBqk(LocationActivity.this, motionEvent, iCallableMethod);
                    }
                });
                this.mapView.setOnLayoutListener(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationActivity.$r8$lambda$_4CJmc_SEs9KtpPe6Lx0pjbTCEE(LocationActivity.this);
                    }
                });
                final IMapsProvider.IMapView iMapView = this.mapView;
                new Thread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationActivity.$r8$lambda$REILUOus-J1dJa5AlJtsmIEkDok(LocationActivity.this, iMapView);
                    }
                }).start();
                messageObject4 = this.messageObject;
                if (messageObject4 != null && this.chatLocation == null) {
                    TLRPC.Chat chat3 = chat;
                    if (chat3 != null && this.locationType == 4 && this.dialogId != 0) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        frameLayout2.setBackgroundResource(R.drawable.livepin);
                        this.mapViewClip.addView(frameLayout2, LayoutHelper.createFrame(62, 76, 49));
                        BackupImageView backupImageView = new BackupImageView(context);
                        backupImageView.setRoundRadius(AndroidUtilities.dp(26.0f));
                        backupImageView.setForUserOrChat(chat3, new AvatarDrawable(chat3));
                        frameLayout2.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                        this.markerImageView = frameLayout2;
                        frameLayout2.setTag(Integer.valueOf(i3));
                    }
                    if (this.markerImageView == null) {
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setImageResource(R.drawable.map_pin2);
                        this.mapViewClip.addView(imageView4, LayoutHelper.createFrame(28, 48, 49));
                        this.markerImageView = imageView4;
                    }
                    RecyclerListView recyclerListView4 = new RecyclerListView(context);
                    this.searchListView = recyclerListView4;
                    recyclerListView4.setVisibility(8);
                    z3 = true;
                    this.searchListView.setLayoutManager(new LinearLayoutManager(context, 1, r8));
                    LocationActivitySearchAdapter locationActivitySearchAdapter2 = new LocationActivitySearchAdapter(context, getResourceProvider(), false, this.locationType == 8) { // from class: org.telegram.ui.LocationActivity.9
                        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                        public void notifyDataSetChanged() {
                            if (LocationActivity.this.searchItem != null) {
                                LocationActivity.this.searchItem.setShowSearchProgress(LocationActivity.this.searchAdapter.isSearching());
                            }
                            if (LocationActivity.this.emptySubtitleTextView != null) {
                                LocationActivity.this.emptySubtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, LocationActivity.this.searchAdapter.getLastSearchString())));
                            }
                            super.notifyDataSetChanged();
                        }
                    };
                    this.searchAdapter = locationActivitySearchAdapter2;
                    locationActivitySearchAdapter2.setDelegate(0L, new BaseLocationAdapter.BaseLocationAdapterDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda8
                        @Override // org.telegram.ui.Adapters.BaseLocationAdapter.BaseLocationAdapterDelegate
                        public final void didLoadSearchResult(ArrayList arrayList) {
                            LocationActivity.$r8$lambda$iNvxHMlkUW13ygyX7FXr23dkUxI(LocationActivity.this, arrayList);
                        }
                    });
                    nestedFrameLayout.addView(this.searchListView, LayoutHelper.createFrame(i2, i2, 51));
                    this.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.LocationActivity.10
                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrollStateChanged(RecyclerView recyclerView, int i14) {
                            if (i14 == 1 && LocationActivity.this.searching && LocationActivity.this.searchWas) {
                                AndroidUtilities.hideKeyboard(LocationActivity.this.getParentActivity().getCurrentFocus());
                            }
                        }
                    });
                    final ActionBarMenu actionBarMenu2 = actionBarMenu;
                    this.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda9
                        @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                        public final void onItemClick(View view, int i14) {
                            LocationActivity.$r8$lambda$Lkhjmr4Sf3Hfzo2Bd7FhOlG41h8(LocationActivity.this, actionBarMenu2, view, i14);
                        }
                    });
                } else {
                    z3 = true;
                    if ((messageObject4 != null && !messageObject4.isLiveLocation()) || this.chatLocation != null) {
                        tL_channelLocation = this.chatLocation;
                        if (tL_channelLocation == null) {
                            this.adapter.setChatLocation(tL_channelLocation);
                        } else {
                            MessageObject messageObject7 = this.messageObject;
                            if (messageObject7 != null) {
                                this.adapter.setMessageObject(messageObject7);
                            }
                        }
                    }
                }
                messageObject5 = this.messageObject;
                if (messageObject5 != null && this.locationType == 6) {
                    this.adapter.setMessageObject(messageObject5);
                }
                while (r8 < c) {
                    this.undoView[r8] = new UndoView(context);
                    this.undoView[r8].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
                    this.undoView[r8].setTranslationZ(AndroidUtilities.dp(5.0f));
                    this.mapViewClip.addView(this.undoView[r8], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    r8++;
                }
                final Rect rect3 = rect2;
                View view = new View(context) { // from class: org.telegram.ui.LocationActivity.11
                    private RectF rect = new RectF();

                    @Override // android.view.View
                    protected void onDraw(Canvas canvas) {
                        LocationActivity.this.shadowDrawable.setBounds(-rect3.left, 0, getMeasuredWidth() + rect3.right, getMeasuredHeight());
                        LocationActivity.this.shadowDrawable.draw(canvas);
                        if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                            int dp2 = AndroidUtilities.dp(36.0f);
                            this.rect.set((getMeasuredWidth() - dp2) / 2, rect3.top + AndroidUtilities.dp(10.0f), (getMeasuredWidth() + dp2) / 2, r1 + AndroidUtilities.dp(4.0f));
                            int themedColor3 = LocationActivity.this.getThemedColor(Theme.key_sheet_scrollUp);
                            Color.alpha(themedColor3);
                            Theme.dialogs_onlineCirclePaint.setColor(themedColor3);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                        }
                    }
                };
                this.shadow = view;
                view.setTranslationZ(AndroidUtilities.dp(6.0f));
                this.mapViewClip.addView(this.shadow, layoutParams2);
                if (this.messageObject == null && this.chatLocation == null && this.initialLocation != null) {
                    this.userLocationMoved = z3;
                    ImageView imageView5 = this.locationButton;
                    int i14 = Theme.key_location_actionIcon;
                    imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                    this.locationButton.setTag(Integer.valueOf(i14));
                }
                nestedFrameLayout.addView(this.actionBar);
                updateEmptyView();
                return this.fragmentView;
            }
        }
        z = false;
        this.locationDenied = z;
        ActionBar actionBar3 = this.actionBar;
        int i52 = Theme.key_dialogBackground;
        actionBar3.setBackgroundColor(getThemedColor(i52));
        ActionBar actionBar22 = this.actionBar;
        int i62 = Theme.key_dialogTextBlack;
        actionBar22.setTitleColor(getThemedColor(i62));
        this.actionBar.setItemsColor(getThemedColor(i62), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_dialogButtonSelector), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() { // from class: org.telegram.ui.LocationActivity.1
            @Override // org.telegram.ui.ActionBar.ActionBar.ActionBarMenuOnItemClick
            public void onItemClick(int i72) {
                if (i72 == -1) {
                    LocationActivity.this.finishFragment();
                    return;
                }
                if (i72 != 1) {
                    if (i72 == 5) {
                        LocationActivity.this.openShareLiveLocation(false, 0);
                        return;
                    } else {
                        if (i72 == 6) {
                            LocationActivity.this.openDirections(null);
                            return;
                        }
                        return;
                    }
                }
                try {
                    double d = LocationActivity.this.messageObject.messageOwner.media.geo.lat;
                    double d2 = LocationActivity.this.messageObject.messageOwner.media.geo._long;
                    LocationActivity.this.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        ActionBarMenu createMenu2 = this.actionBar.createMenu();
        if (this.chatLocation == null) {
        }
        NestedFrameLayout nestedFrameLayout2 = new NestedFrameLayout(context);
        this.fragmentView = nestedFrameLayout2;
        nestedFrameLayout2.setBackgroundColor(getThemedColor(i52));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate2;
        int themedColor3 = getThemedColor(i52);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        mutate2.setColorFilter(new PorterDuffColorFilter(themedColor3, mode2));
        rect = new Rect();
        this.shadowDrawable.getPadding(rect);
        i = this.locationType;
        if (i != 0) {
        }
        layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top);
        layoutParams.gravity = 83;
        FrameLayout frameLayout3 = new FrameLayout(context) { // from class: org.telegram.ui.LocationActivity.3
            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i82, int i92) {
                super.onMeasure(i82, i92);
                if (LocationActivity.this.overlayView != null) {
                    LocationActivity.this.overlayView.updatePositions();
                }
            }
        };
        this.mapViewClip = frameLayout3;
        frameLayout3.setBackgroundDrawable(new MapPlaceholderDrawable(isActiveThemeDark()));
        messageObject = this.messageObject;
        if (messageObject == null) {
            SearchButton searchButton2 = new SearchButton(context);
            this.searchAreaButton = searchButton2;
            searchButton2.setTranslationX(-AndroidUtilities.dp(80.0f));
            Drawable createSimpleSelectorRoundRectDrawable2 = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(40.0f), getThemedColor(Theme.key_location_actionBackground), getThemedColor(Theme.key_location_actionPressedBackground));
            ScaleStateListAnimator.apply(this.searchAreaButton);
            this.searchAreaButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.searchAreaButton.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
            this.searchAreaButton.setBackgroundDrawable(createSimpleSelectorRoundRectDrawable2);
            this.searchAreaButton.setTextColor(getThemedColor(Theme.key_location_actionActiveIcon));
            this.searchAreaButton.setTextSize(1, 14.0f);
            this.searchAreaButton.setTypeface(AndroidUtilities.bold());
            this.searchAreaButton.setGravity(17);
            this.searchAreaButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (this.locationType == 3) {
            }
            int i82 = Theme.key_location_actionIcon;
            FrameLayout.LayoutParams layoutParams32 = layoutParams;
            ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor(i82), getResourceProvider());
            this.mapTypeButton = actionBarMenuItem3;
            actionBarMenuItem3.setClickable(true);
            this.mapTypeButton.setSubMenuOpenSide(2);
            this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
            this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
            this.mapTypeButton.addSubItem(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
            this.mapTypeButton.addSubItem(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
            this.mapTypeButton.addSubItem(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
            this.mapTypeButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            int dp2 = AndroidUtilities.dp(40.0f);
            int i92 = Theme.key_location_actionBackground;
            int themedColor22 = getThemedColor(i92);
            int i102 = Theme.key_location_actionPressedBackground;
            Drawable createSimpleSelectorCircleDrawable4 = Theme.createSimpleSelectorCircleDrawable(dp2, themedColor22, getThemedColor(i102));
            ScaleStateListAnimator.apply(this.mapTypeButton);
            this.mapTypeButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            ActionBarMenuItem actionBarMenuItem22 = this.mapTypeButton;
            ViewOutlineProvider viewOutlineProvider2 = ViewOutlineProviderImpl.BOUNDS_OVAL;
            actionBarMenuItem22.setOutlineProvider(viewOutlineProvider2);
            this.mapTypeButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable4);
            this.mapTypeButton.setIcon(R.drawable.msg_map_type);
            this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
            this.mapTypeButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LocationActivity.this.mapTypeButton.toggleSubMenu();
                }
            });
            this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda13
                @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
                public final void onItemClick(int i112) {
                    LocationActivity.$r8$lambda$nW2fiSepowAwRnCceqFn92NpP3o(LocationActivity.this, i112);
                }
            });
            this.locationButton = new ImageView(context);
            Drawable createSimpleSelectorCircleDrawable22 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i92), getThemedColor(i102));
            ScaleStateListAnimator.apply(this.locationButton);
            this.locationButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.locationButton.setOutlineProvider(viewOutlineProvider2);
            this.locationButton.setBackground(createSimpleSelectorCircleDrawable22);
            this.locationButton.setImageResource(R.drawable.msg_current_location);
            ImageView imageView6 = this.locationButton;
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
            imageView6.setScaleType(scaleType2);
            ImageView imageView22 = this.locationButton;
            int i112 = Theme.key_location_actionActiveIcon;
            imageView22.setColorFilter(new PorterDuffColorFilter(getThemedColor(i112), mode2));
            this.locationButton.setTag(Integer.valueOf(i112));
            this.locationButton.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
            FrameLayout.LayoutParams createFrame3 = LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
            createFrame3.bottomMargin += layoutParams32.height - rect.top;
            this.mapViewClip.addView(this.locationButton, createFrame3);
            this.locationButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LocationActivity.$r8$lambda$EmhefR8ZnXkolfaki0AKR-kaJLY(LocationActivity.this, view2);
                }
            });
            TextView textView4 = new TextView(context);
            this.showAllButton = textView4;
            textView4.setGravity(17);
            this.showAllButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.showAllButton.setTextSize(1, 15.0f);
            this.showAllButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourceProvider));
            this.showAllButton.setTypeface(AndroidUtilities.bold());
            this.showAllButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.showAllButton.setText(LocaleController.getString(R.string.LocationsShowAll));
            this.showAllButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i92), getThemedColor(i102), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
            FrameLayout.LayoutParams createFrame22 = LayoutHelper.createFrame(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
            createFrame22.bottomMargin += layoutParams32.height - rect.top;
            this.mapViewClip.addView(this.showAllButton, createFrame22);
            ScaleStateListAnimator.apply(this.showAllButton);
            this.showAllButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LocationActivity.$r8$lambda$Dou7wgDFunZJ0ZmRFBEO3bAbI6Q(LocationActivity.this, view2);
                }
            });
            showShowAllButton(false, false);
            this.proximityButton = new ImageView(context);
            Drawable createSimpleSelectorCircleDrawable32 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i92), getThemedColor(i102));
            ScaleStateListAnimator.apply(this.proximityButton);
            this.proximityButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.proximityButton.setOutlineProvider(viewOutlineProvider2);
            this.proximityButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i82), mode2));
            this.proximityButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable32);
            this.proximityButton.setScaleType(scaleType2);
            this.proximityButton.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
            this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
            this.proximityButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LocationActivity.$r8$lambda$P48XeYVvsix6VEHSSVETgKPkfhc(LocationActivity.this, view2);
                }
            });
            if (DialogObject.isChatDialog(this.dialogId)) {
            }
            messageObject2 = this.messageObject;
            if (messageObject2 != null) {
            }
            this.proximityButton.setVisibility(8);
            this.proximityButton.setImageResource(R.drawable.msg_location_alert);
            HintView2 hintView22 = new HintView2(context, 1);
            this.hintView = hintView22;
            hintView22.setLayerType(2, null);
            this.hintView.setDuration(4000L);
            this.hintView.setJoint(1.0f, -25.0f);
            this.hintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.mapViewClip.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.emptyView = linearLayout2;
            linearLayout2.setOrientation(1);
            this.emptyView.setGravity(1);
            this.emptyView.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
            this.emptyView.setVisibility(8);
            nestedFrameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
            this.emptyView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda17
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return LocationActivity.$r8$lambda$K_SblFMYpnuCjrLTuOQWSwldEmo(view2, motionEvent);
                }
            });
            ImageView imageView32 = new ImageView(context);
            this.emptyImageView = imageView32;
            imageView32.setImageResource(R.drawable.location_empty);
            this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), mode2));
            this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
            TextView textView22 = new TextView(context);
            this.emptyTitleTextView = textView22;
            int i122 = Theme.key_dialogEmptyText;
            textView22.setTextColor(getThemedColor(i122));
            this.emptyTitleTextView.setGravity(17);
            this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
            this.emptyTitleTextView.setTextSize(1, 17.0f);
            this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoPlacesFound));
            this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
            TextView textView32 = new TextView(context);
            this.emptySubtitleTextView = textView32;
            textView32.setTextColor(getThemedColor(i122));
            this.emptySubtitleTextView.setGravity(17);
            this.emptySubtitleTextView.setTextSize(1, 15.0f);
            this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
            this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
            RecyclerListView recyclerListView22 = new RecyclerListView(context);
            this.listView = recyclerListView22;
            int i132 = this.locationType;
            long j2 = this.dialogId;
            Theme.ResourcesProvider resourceProvider2 = getResourceProvider();
            boolean z42 = this.fromStories;
            if (this.locationType == 8) {
            }
            LocationActivityAdapter locationActivityAdapter22 = new LocationActivityAdapter(context, i132, j2, false, resourceProvider2, false, z42, z2) { // from class: org.telegram.ui.LocationActivity.4
                private boolean firstSet = true;

                @Override // org.telegram.ui.Adapters.LocationActivityAdapter
                protected void onDirectionClick() {
                    LocationActivity.this.openDirections(null);
                }

                @Override // org.telegram.ui.Adapters.LocationActivityAdapter
                public void setLiveLocations(ArrayList arrayList) {
                    int i142;
                    if (LocationActivity.this.messageObject != null && LocationActivity.this.messageObject.isLiveLocation()) {
                        if (arrayList != null) {
                            i142 = 0;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                LiveLocation liveLocation = (LiveLocation) arrayList.get(i15);
                                if (liveLocation != null && !UserObject.isUserSelf(liveLocation.user)) {
                                    i142++;
                                }
                            }
                        } else {
                            i142 = 0;
                        }
                        if (this.firstSet && i142 == 1) {
                            LocationActivity.this.selectedMarkerId = ((LiveLocation) arrayList.get(0)).id;
                        }
                        this.firstSet = false;
                        LocationActivity.this.otherItem.setVisibility(i142 != 1 ? 8 : 0);
                    }
                    super.setLiveLocations(arrayList);
                }
            };
            this.adapter = locationActivityAdapter22;
            recyclerListView.setAdapter(locationActivityAdapter22);
            RecyclerListView recyclerListView32 = this.listView;
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, 1, false);
            this.layoutManager = linearLayoutManager2;
            recyclerListView32.setLayoutManager(linearLayoutManager2);
            if (this.searchStoriesArea != null) {
            }
            this.adapter.setMyLocationDenied(this.locationDenied, r8);
            this.adapter.setUpdateRunnable(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.this.updateClipView(false);
                }
            });
            this.listView.setVerticalScrollBarEnabled(r8);
            nestedFrameLayout2.addView(this.listView, LayoutHelper.createFrame(i2, i2, 51));
            messageObject3 = this.messageObject;
            if (messageObject3 != null) {
                this.adapter.setAddressNameOverride(this.messageObject.messageOwner.media.address);
            }
            this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.LocationActivity.7
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i142) {
                    LocationActivity.this.scrolling = i142 != 0;
                    if (LocationActivity.this.scrolling || LocationActivity.this.forceUpdate == null) {
                        return;
                    }
                    LocationActivity.this.forceUpdate = null;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i142, int i15) {
                    LocationActivity.this.updateClipView(false);
                    if (LocationActivity.this.forceUpdate != null) {
                        LocationActivity.access$3116(LocationActivity.this, i15);
                    }
                }
            });
            ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(r8);
            this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
                public final boolean onItemClick(View view2, int i142) {
                    return LocationActivity.$r8$lambda$RRG4mZjmsEWVcWSO16To_y4HczE(LocationActivity.this, context, view2, i142);
                }
            });
            this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda2
                @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
                public final void onItemClick(View view2, int i142) {
                    LocationActivity.$r8$lambda$11Q_tDtm04F3_CcRhPlbNJTcsXc(LocationActivity.this, view2, i142);
                }
            });
            this.adapter.setDelegate(this.dialogId, new BaseLocationAdapter.BaseLocationAdapterDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda3
                @Override // org.telegram.ui.Adapters.BaseLocationAdapter.BaseLocationAdapterDelegate
                public final void didLoadSearchResult(ArrayList arrayList) {
                    LocationActivity.this.updatePlacesMarkers(arrayList);
                }
            });
            this.adapter.setOverScrollHeight(this.overScrollHeight);
            nestedFrameLayout2.addView(this.mapViewClip, LayoutHelper.createFrame(i2, i2, 51));
            IMapsProvider.IMapView onCreateMapView2 = ApplicationLoader.getMapsProvider().onCreateMapView(context);
            this.mapView = onCreateMapView2;
            onCreateMapView2.getView().setAlpha(0.0f);
            this.mapView.setOnDispatchTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda4
                @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                    return LocationActivity.$r8$lambda$zEZ5BV3rTdK9PEXsOKpIIJkLIYg(LocationActivity.this, motionEvent, iCallableMethod);
                }
            });
            this.mapView.setOnInterceptTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda5
                @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                    return LocationActivity.$r8$lambda$_VrR_enDxKsuEuK7304x0HoWBqk(LocationActivity.this, motionEvent, iCallableMethod);
                }
            });
            this.mapView.setOnLayoutListener(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$_4CJmc_SEs9KtpPe6Lx0pjbTCEE(LocationActivity.this);
                }
            });
            final IMapsProvider.IMapView iMapView2 = this.mapView;
            new Thread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$REILUOus-J1dJa5AlJtsmIEkDok(LocationActivity.this, iMapView2);
                }
            }).start();
            messageObject4 = this.messageObject;
            if (messageObject4 != null) {
            }
            z3 = true;
            if (messageObject4 != null) {
                tL_channelLocation = this.chatLocation;
                if (tL_channelLocation == null) {
                }
                messageObject5 = this.messageObject;
                if (messageObject5 != null) {
                    this.adapter.setMessageObject(messageObject5);
                }
                while (r8 < c) {
                }
                final Rect rect32 = rect2;
                View view2 = new View(context) { // from class: org.telegram.ui.LocationActivity.11
                    private RectF rect = new RectF();

                    @Override // android.view.View
                    protected void onDraw(Canvas canvas) {
                        LocationActivity.this.shadowDrawable.setBounds(-rect32.left, 0, getMeasuredWidth() + rect32.right, getMeasuredHeight());
                        LocationActivity.this.shadowDrawable.draw(canvas);
                        if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                            int dp22 = AndroidUtilities.dp(36.0f);
                            this.rect.set((getMeasuredWidth() - dp22) / 2, rect32.top + AndroidUtilities.dp(10.0f), (getMeasuredWidth() + dp22) / 2, r1 + AndroidUtilities.dp(4.0f));
                            int themedColor32 = LocationActivity.this.getThemedColor(Theme.key_sheet_scrollUp);
                            Color.alpha(themedColor32);
                            Theme.dialogs_onlineCirclePaint.setColor(themedColor32);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                        }
                    }
                };
                this.shadow = view2;
                view2.setTranslationZ(AndroidUtilities.dp(6.0f));
                this.mapViewClip.addView(this.shadow, layoutParams2);
                if (this.messageObject == null) {
                    this.userLocationMoved = z3;
                    ImageView imageView52 = this.locationButton;
                    int i142 = Theme.key_location_actionIcon;
                    imageView52.setColorFilter(new PorterDuffColorFilter(getThemedColor(i142), PorterDuff.Mode.MULTIPLY));
                    this.locationButton.setTag(Integer.valueOf(i142));
                }
                nestedFrameLayout2.addView(this.actionBar);
                updateEmptyView();
                return this.fragmentView;
            }
            tL_channelLocation = this.chatLocation;
            if (tL_channelLocation == null) {
            }
            messageObject5 = this.messageObject;
            if (messageObject5 != null) {
            }
            while (r8 < c) {
            }
            final Rect rect322 = rect2;
            View view22 = new View(context) { // from class: org.telegram.ui.LocationActivity.11
                private RectF rect = new RectF();

                @Override // android.view.View
                protected void onDraw(Canvas canvas) {
                    LocationActivity.this.shadowDrawable.setBounds(-rect322.left, 0, getMeasuredWidth() + rect322.right, getMeasuredHeight());
                    LocationActivity.this.shadowDrawable.draw(canvas);
                    if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                        int dp22 = AndroidUtilities.dp(36.0f);
                        this.rect.set((getMeasuredWidth() - dp22) / 2, rect322.top + AndroidUtilities.dp(10.0f), (getMeasuredWidth() + dp22) / 2, r1 + AndroidUtilities.dp(4.0f));
                        int themedColor32 = LocationActivity.this.getThemedColor(Theme.key_sheet_scrollUp);
                        Color.alpha(themedColor32);
                        Theme.dialogs_onlineCirclePaint.setColor(themedColor32);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    }
                }
            };
            this.shadow = view22;
            view22.setTranslationZ(AndroidUtilities.dp(6.0f));
            this.mapViewClip.addView(this.shadow, layoutParams2);
            if (this.messageObject == null) {
            }
            nestedFrameLayout2.addView(this.actionBar);
            updateEmptyView();
            return this.fragmentView;
        }
        SearchButton searchButton22 = new SearchButton(context);
        this.searchAreaButton = searchButton22;
        searchButton22.setTranslationX(-AndroidUtilities.dp(80.0f));
        Drawable createSimpleSelectorRoundRectDrawable22 = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(40.0f), getThemedColor(Theme.key_location_actionBackground), getThemedColor(Theme.key_location_actionPressedBackground));
        ScaleStateListAnimator.apply(this.searchAreaButton);
        this.searchAreaButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.searchAreaButton.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
        this.searchAreaButton.setBackgroundDrawable(createSimpleSelectorRoundRectDrawable22);
        this.searchAreaButton.setTextColor(getThemedColor(Theme.key_location_actionActiveIcon));
        this.searchAreaButton.setTextSize(1, 14.0f);
        this.searchAreaButton.setTypeface(AndroidUtilities.bold());
        this.searchAreaButton.setGravity(17);
        this.searchAreaButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        if (this.locationType == 3) {
        }
        int i822 = Theme.key_location_actionIcon;
        FrameLayout.LayoutParams layoutParams322 = layoutParams;
        ActionBarMenuItem actionBarMenuItem32 = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor(i822), getResourceProvider());
        this.mapTypeButton = actionBarMenuItem32;
        actionBarMenuItem32.setClickable(true);
        this.mapTypeButton.setSubMenuOpenSide(2);
        this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.mapTypeButton.addSubItem(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.mapTypeButton.addSubItem(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.mapTypeButton.addSubItem(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.mapTypeButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int dp22 = AndroidUtilities.dp(40.0f);
        int i922 = Theme.key_location_actionBackground;
        int themedColor222 = getThemedColor(i922);
        int i1022 = Theme.key_location_actionPressedBackground;
        Drawable createSimpleSelectorCircleDrawable42 = Theme.createSimpleSelectorCircleDrawable(dp22, themedColor222, getThemedColor(i1022));
        ScaleStateListAnimator.apply(this.mapTypeButton);
        this.mapTypeButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        ActionBarMenuItem actionBarMenuItem222 = this.mapTypeButton;
        ViewOutlineProvider viewOutlineProvider22 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        actionBarMenuItem222.setOutlineProvider(viewOutlineProvider22);
        this.mapTypeButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable42);
        this.mapTypeButton.setIcon(R.drawable.msg_map_type);
        this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.mapTypeButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view23) {
                LocationActivity.this.mapTypeButton.toggleSubMenu();
            }
        });
        this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda13
            @Override // org.telegram.ui.ActionBar.ActionBarMenuItem.ActionBarMenuItemDelegate
            public final void onItemClick(int i1122) {
                LocationActivity.$r8$lambda$nW2fiSepowAwRnCceqFn92NpP3o(LocationActivity.this, i1122);
            }
        });
        this.locationButton = new ImageView(context);
        Drawable createSimpleSelectorCircleDrawable222 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i922), getThemedColor(i1022));
        ScaleStateListAnimator.apply(this.locationButton);
        this.locationButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.locationButton.setOutlineProvider(viewOutlineProvider22);
        this.locationButton.setBackground(createSimpleSelectorCircleDrawable222);
        this.locationButton.setImageResource(R.drawable.msg_current_location);
        ImageView imageView62 = this.locationButton;
        ImageView.ScaleType scaleType22 = ImageView.ScaleType.CENTER;
        imageView62.setScaleType(scaleType22);
        ImageView imageView222 = this.locationButton;
        int i1122 = Theme.key_location_actionActiveIcon;
        imageView222.setColorFilter(new PorterDuffColorFilter(getThemedColor(i1122), mode2));
        this.locationButton.setTag(Integer.valueOf(i1122));
        this.locationButton.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams createFrame32 = LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        createFrame32.bottomMargin += layoutParams322.height - rect.top;
        this.mapViewClip.addView(this.locationButton, createFrame32);
        this.locationButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view23) {
                LocationActivity.$r8$lambda$EmhefR8ZnXkolfaki0AKR-kaJLY(LocationActivity.this, view23);
            }
        });
        TextView textView42 = new TextView(context);
        this.showAllButton = textView42;
        textView42.setGravity(17);
        this.showAllButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.showAllButton.setTextSize(1, 15.0f);
        this.showAllButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourceProvider));
        this.showAllButton.setTypeface(AndroidUtilities.bold());
        this.showAllButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.showAllButton.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.showAllButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i922), getThemedColor(i1022), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams createFrame222 = LayoutHelper.createFrame(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        createFrame222.bottomMargin += layoutParams322.height - rect.top;
        this.mapViewClip.addView(this.showAllButton, createFrame222);
        ScaleStateListAnimator.apply(this.showAllButton);
        this.showAllButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view23) {
                LocationActivity.$r8$lambda$Dou7wgDFunZJ0ZmRFBEO3bAbI6Q(LocationActivity.this, view23);
            }
        });
        showShowAllButton(false, false);
        this.proximityButton = new ImageView(context);
        Drawable createSimpleSelectorCircleDrawable322 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i922), getThemedColor(i1022));
        ScaleStateListAnimator.apply(this.proximityButton);
        this.proximityButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.proximityButton.setOutlineProvider(viewOutlineProvider22);
        this.proximityButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i822), mode2));
        this.proximityButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable322);
        this.proximityButton.setScaleType(scaleType22);
        this.proximityButton.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.proximityButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view23) {
                LocationActivity.$r8$lambda$P48XeYVvsix6VEHSSVETgKPkfhc(LocationActivity.this, view23);
            }
        });
        if (DialogObject.isChatDialog(this.dialogId)) {
        }
        messageObject2 = this.messageObject;
        if (messageObject2 != null) {
        }
        this.proximityButton.setVisibility(8);
        this.proximityButton.setImageResource(R.drawable.msg_location_alert);
        HintView2 hintView222 = new HintView2(context, 1);
        this.hintView = hintView222;
        hintView222.setLayerType(2, null);
        this.hintView.setDuration(4000L);
        this.hintView.setJoint(1.0f, -25.0f);
        this.hintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.mapViewClip.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout22 = new LinearLayout(context);
        this.emptyView = linearLayout22;
        linearLayout22.setOrientation(1);
        this.emptyView.setGravity(1);
        this.emptyView.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.emptyView.setVisibility(8);
        nestedFrameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda17
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view23, MotionEvent motionEvent) {
                return LocationActivity.$r8$lambda$K_SblFMYpnuCjrLTuOQWSwldEmo(view23, motionEvent);
            }
        });
        ImageView imageView322 = new ImageView(context);
        this.emptyImageView = imageView322;
        imageView322.setImageResource(R.drawable.location_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), mode2));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView222 = new TextView(context);
        this.emptyTitleTextView = textView222;
        int i1222 = Theme.key_dialogEmptyText;
        textView222.setTextColor(getThemedColor(i1222));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoPlacesFound));
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView322 = new TextView(context);
        this.emptySubtitleTextView = textView322;
        textView322.setTextColor(getThemedColor(i1222));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView222 = new RecyclerListView(context);
        this.listView = recyclerListView222;
        int i1322 = this.locationType;
        long j22 = this.dialogId;
        Theme.ResourcesProvider resourceProvider22 = getResourceProvider();
        boolean z422 = this.fromStories;
        if (this.locationType == 8) {
        }
        LocationActivityAdapter locationActivityAdapter222 = new LocationActivityAdapter(context, i1322, j22, false, resourceProvider22, false, z422, z2) { // from class: org.telegram.ui.LocationActivity.4
            private boolean firstSet = true;

            @Override // org.telegram.ui.Adapters.LocationActivityAdapter
            protected void onDirectionClick() {
                LocationActivity.this.openDirections(null);
            }

            @Override // org.telegram.ui.Adapters.LocationActivityAdapter
            public void setLiveLocations(ArrayList arrayList) {
                int i1422;
                if (LocationActivity.this.messageObject != null && LocationActivity.this.messageObject.isLiveLocation()) {
                    if (arrayList != null) {
                        i1422 = 0;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            LiveLocation liveLocation = (LiveLocation) arrayList.get(i15);
                            if (liveLocation != null && !UserObject.isUserSelf(liveLocation.user)) {
                                i1422++;
                            }
                        }
                    } else {
                        i1422 = 0;
                    }
                    if (this.firstSet && i1422 == 1) {
                        LocationActivity.this.selectedMarkerId = ((LiveLocation) arrayList.get(0)).id;
                    }
                    this.firstSet = false;
                    LocationActivity.this.otherItem.setVisibility(i1422 != 1 ? 8 : 0);
                }
                super.setLiveLocations(arrayList);
            }
        };
        this.adapter = locationActivityAdapter222;
        recyclerListView.setAdapter(locationActivityAdapter222);
        RecyclerListView recyclerListView322 = this.listView;
        LinearLayoutManager linearLayoutManager22 = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager22;
        recyclerListView322.setLayoutManager(linearLayoutManager22);
        if (this.searchStoriesArea != null) {
        }
        this.adapter.setMyLocationDenied(this.locationDenied, r8);
        this.adapter.setUpdateRunnable(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.this.updateClipView(false);
            }
        });
        this.listView.setVerticalScrollBarEnabled(r8);
        nestedFrameLayout2.addView(this.listView, LayoutHelper.createFrame(i2, i2, 51));
        messageObject3 = this.messageObject;
        if (messageObject3 != null) {
        }
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.LocationActivity.7
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i1422) {
                LocationActivity.this.scrolling = i1422 != 0;
                if (LocationActivity.this.scrolling || LocationActivity.this.forceUpdate == null) {
                    return;
                }
                LocationActivity.this.forceUpdate = null;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i1422, int i15) {
                LocationActivity.this.updateClipView(false);
                if (LocationActivity.this.forceUpdate != null) {
                    LocationActivity.access$3116(LocationActivity.this, i15);
                }
            }
        });
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(r8);
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda1
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemLongClickListener
            public final boolean onItemClick(View view23, int i1422) {
                return LocationActivity.$r8$lambda$RRG4mZjmsEWVcWSO16To_y4HczE(LocationActivity.this, context, view23, i1422);
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda2
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view23, int i1422) {
                LocationActivity.$r8$lambda$11Q_tDtm04F3_CcRhPlbNJTcsXc(LocationActivity.this, view23, i1422);
            }
        });
        this.adapter.setDelegate(this.dialogId, new BaseLocationAdapter.BaseLocationAdapterDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda3
            @Override // org.telegram.ui.Adapters.BaseLocationAdapter.BaseLocationAdapterDelegate
            public final void didLoadSearchResult(ArrayList arrayList) {
                LocationActivity.this.updatePlacesMarkers(arrayList);
            }
        });
        this.adapter.setOverScrollHeight(this.overScrollHeight);
        nestedFrameLayout2.addView(this.mapViewClip, LayoutHelper.createFrame(i2, i2, 51));
        IMapsProvider.IMapView onCreateMapView22 = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.mapView = onCreateMapView22;
        onCreateMapView22.getView().setAlpha(0.0f);
        this.mapView.setOnDispatchTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                return LocationActivity.$r8$lambda$zEZ5BV3rTdK9PEXsOKpIIJkLIYg(LocationActivity.this, motionEvent, iCallableMethod);
            }
        });
        this.mapView.setOnInterceptTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                return LocationActivity.$r8$lambda$_VrR_enDxKsuEuK7304x0HoWBqk(LocationActivity.this, motionEvent, iCallableMethod);
            }
        });
        this.mapView.setOnLayoutListener(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$_4CJmc_SEs9KtpPe6Lx0pjbTCEE(LocationActivity.this);
            }
        });
        final IMapsProvider.IMapView iMapView22 = this.mapView;
        new Thread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$REILUOus-J1dJa5AlJtsmIEkDok(LocationActivity.this, iMapView22);
            }
        }).start();
        messageObject4 = this.messageObject;
        if (messageObject4 != null) {
        }
        z3 = true;
        if (messageObject4 != null) {
        }
        tL_channelLocation = this.chatLocation;
        if (tL_channelLocation == null) {
        }
        messageObject5 = this.messageObject;
        if (messageObject5 != null) {
        }
        while (r8 < c) {
        }
        final Rect rect3222 = rect2;
        View view222 = new View(context) { // from class: org.telegram.ui.LocationActivity.11
            private RectF rect = new RectF();

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                LocationActivity.this.shadowDrawable.setBounds(-rect3222.left, 0, getMeasuredWidth() + rect3222.right, getMeasuredHeight());
                LocationActivity.this.shadowDrawable.draw(canvas);
                if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                    int dp222 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - dp222) / 2, rect3222.top + AndroidUtilities.dp(10.0f), (getMeasuredWidth() + dp222) / 2, r1 + AndroidUtilities.dp(4.0f));
                    int themedColor32 = LocationActivity.this.getThemedColor(Theme.key_sheet_scrollUp);
                    Color.alpha(themedColor32);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor32);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
            }
        };
        this.shadow = view222;
        view222.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.mapViewClip.addView(this.shadow, layoutParams2);
        if (this.messageObject == null) {
        }
        nestedFrameLayout2.addView(this.actionBar);
        updateEmptyView();
        return this.fragmentView;
    }

    public static /* synthetic */ void $r8$lambda$TgBAlPNLxVqLqRqMIPgRH6hXbOo(LocationActivity locationActivity, View view) {
        locationActivity.getClass();
        try {
            TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$fzvvmd5fwtwkkQSJe_vOdygbx4U(LocationActivity locationActivity, View view) {
        locationActivity.showSearchPlacesButton(false);
        locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true, true);
        locationActivity.searchedForCustomLocations = true;
        locationActivity.showResults();
    }

    public static /* synthetic */ void $r8$lambda$nW2fiSepowAwRnCceqFn92NpP3o(LocationActivity locationActivity, int i) {
        IMapsProvider.IMap iMap = locationActivity.map;
        if (iMap == null) {
            return;
        }
        if (i == 2) {
            iMap.setMapType(0);
        } else if (i == 3) {
            iMap.setMapType(1);
        } else if (i == 4) {
            iMap.setMapType(2);
        }
    }

    public static /* synthetic */ void $r8$lambda$EmhefR8ZnXkolfaki0AKR-kaJLY(LocationActivity locationActivity, View view) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = locationActivity.getParentActivity()) != null) {
            checkSelfPermission = parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
            if (checkSelfPermission != 0) {
                locationActivity.showPermissionAlert(false);
                return;
            }
        }
        if (locationActivity.checkGpsEnabled() || locationActivity.locationType == 3) {
            if ((locationActivity.messageObject != null && locationActivity.locationType != 3) || locationActivity.chatLocation != null) {
                if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                }
            } else if (locationActivity.myLocation != null && locationActivity.map != null) {
                ImageView imageView = locationActivity.locationButton;
                int i = Theme.key_location_actionActiveIcon;
                imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
                locationActivity.locationButton.setTag(Integer.valueOf(i));
                locationActivity.adapter.setCustomLocation(null);
                locationActivity.userLocationMoved = false;
                locationActivity.showSearchPlacesButton(false);
                locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                if (locationActivity.searchedForCustomLocations && locationActivity.locationType != 8) {
                    Location location = locationActivity.myLocation;
                    if (location != null) {
                        locationActivity.adapter.searchPlacesWithQuery(null, location, true, true);
                    }
                    locationActivity.searchedForCustomLocations = false;
                    locationActivity.showResults();
                }
            }
            locationActivity.removeInfoView();
        }
    }

    public static /* synthetic */ void $r8$lambda$Dou7wgDFunZJ0ZmRFBEO3bAbI6Q(LocationActivity locationActivity, View view) {
        locationActivity.selectedMarkerId = -1L;
        locationActivity.userLocationMoved = true;
        if (locationActivity.fitAllLiveLocations(true)) {
            locationActivity.showAllMode = true;
            locationActivity.showShowAllButton(false, true);
        }
    }

    public static /* synthetic */ void $r8$lambda$P48XeYVvsix6VEHSSVETgKPkfhc(final LocationActivity locationActivity, View view) {
        if (locationActivity.getParentActivity() == null || locationActivity.myLocation == null || !locationActivity.checkGpsEnabled() || locationActivity.map == null) {
            return;
        }
        HintView2 hintView2 = locationActivity.hintView;
        if (hintView2 != null) {
            hintView2.hide();
        }
        MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
        final LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
        if (locationActivity.canUndo) {
            locationActivity.undoView[0].hide(true, 1);
        }
        if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
            locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
            IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
            if (iCircle != null) {
                iCircle.remove();
                locationActivity.proximityCircle = null;
            }
            locationActivity.canUndo = true;
            locationActivity.getUndoView().showWithAction(0L, 25, (Object) 0, (Object) null, new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda31
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$Q_LlaQ_pJUOQ0vyh0pe4PjIS41c(LocationActivity.this);
                }
            }, new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda32
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$PsRkB9tvx_d_jt0bw68lOHQ6dWY(LocationActivity.this, sharingLocationInfo);
                }
            });
            return;
        }
        locationActivity.openProximityAlert();
    }

    public static /* synthetic */ void $r8$lambda$Q_LlaQ_pJUOQ0vyh0pe4PjIS41c(LocationActivity locationActivity) {
        locationActivity.getLocationController().setProximityLocation(locationActivity.dialogId, 0, true);
        locationActivity.canUndo = false;
    }

    public static /* synthetic */ void $r8$lambda$PsRkB9tvx_d_jt0bw68lOHQ6dWY(LocationActivity locationActivity, LocationController.SharingLocationInfo sharingLocationInfo) {
        locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert2);
        locationActivity.createCircle(sharingLocationInfo.proximityMeters);
        locationActivity.canUndo = false;
    }

    public static /* synthetic */ boolean $r8$lambda$RRG4mZjmsEWVcWSO16To_y4HczE(final LocationActivity locationActivity, Context context, View view, int i) {
        if (locationActivity.locationType == 2) {
            Object item = locationActivity.adapter.getItem(i);
            if (item instanceof LiveLocation) {
                final LiveLocation liveLocation = (LiveLocation) item;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context);
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) locationActivity.getParentActivity(), true, true, locationActivity.getResourceProvider());
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions);
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        LocationActivity.$r8$lambda$z7CaaqKyZYWtTzHO4YWlxEB1lNk(LocationActivity.this, liveLocation, view2);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                int i2 = -2;
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i2, i2) { // from class: org.telegram.ui.LocationActivity.8
                    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
                    public void dismiss() {
                        super.dismiss();
                        LocationActivity.this.popupWindow = null;
                    }
                };
                locationActivity.popupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setOutsideTouchable(true);
                locationActivity.popupWindow.setClippingEnabled(true);
                locationActivity.popupWindow.setInputMethodMode(2);
                locationActivity.popupWindow.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                locationActivity.popupWindow.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                locationActivity.popupWindow.dimBehind();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void $r8$lambda$z7CaaqKyZYWtTzHO4YWlxEB1lNk(LocationActivity locationActivity, LiveLocation liveLocation, View view) {
        locationActivity.openDirections(liveLocation);
        ActionBarPopupWindow actionBarPopupWindow = locationActivity.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public static /* synthetic */ void $r8$lambda$11Q_tDtm04F3_CcRhPlbNJTcsXc(final LocationActivity locationActivity, View view, int i) {
        MessageObject messageObject;
        final TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        locationActivity.selectedMarkerId = -1L;
        int i2 = locationActivity.locationType;
        if (i2 == 4) {
            if (i != 1 || (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) locationActivity.adapter.getItem(i)) == null) {
                return;
            }
            if (locationActivity.dialogId == 0) {
                locationActivity.delegate.didSelectLocation(tL_messageMediaVenue, 4, true, 0, 0L);
                locationActivity.finishFragment();
                return;
            }
            final AlertDialog[] alertDialogArr = {new AlertDialog(locationActivity.getParentActivity(), 3)};
            TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
            tL_channels_editLocation.address = tL_messageMediaVenue.address;
            tL_channels_editLocation.channel = locationActivity.getMessagesController().getInputChannel(-locationActivity.dialogId);
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_channels_editLocation.geo_point = tL_inputGeoPoint;
            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
            tL_inputGeoPoint.lat = geoPoint.lat;
            tL_inputGeoPoint._long = geoPoint._long;
            final int sendRequest = locationActivity.getConnectionsManager().sendRequest(tL_channels_editLocation, new RequestDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda33
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LocationActivity.$r8$lambda$0umiyO448BkBMLobQhXDvxQN2hQ(LocationActivity.this, alertDialogArr, tL_messageMediaVenue, tLObject, tL_error);
                }
            });
            alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda34
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    LocationActivity.this.getConnectionsManager().cancelRequest(sendRequest, true);
                }
            });
            locationActivity.showDialog(alertDialogArr[0]);
            return;
        }
        if (i2 == 5) {
            IMapsProvider.IMap iMap = locationActivity.map;
            if (iMap != null) {
                IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                TLRPC.GeoPoint geoPoint2 = locationActivity.chatLocation.geo_point;
                iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), locationActivity.map.getMaxZoomLevel() - 4.0f));
                return;
            }
            return;
        }
        if (i == 1 && (messageObject = locationActivity.messageObject) != null && (!messageObject.isLiveLocation() || locationActivity.locationType == 6)) {
            IMapsProvider.IMap iMap2 = locationActivity.map;
            if (iMap2 != null) {
                IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                TLRPC.GeoPoint geoPoint3 = locationActivity.messageObject.messageOwner.media.geo;
                iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), locationActivity.map.getMaxZoomLevel() - 4.0f));
                return;
            }
            return;
        }
        if (i == 1 && locationActivity.locationType != 2) {
            if (locationActivity.delegate == null || locationActivity.userLocation == null) {
                return;
            }
            FrameLayout frameLayout = locationActivity.lastPressedMarkerView;
            if (frameLayout != null) {
                frameLayout.callOnClick();
                return;
            }
            final TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaGeo.geo = tL_geoPoint;
            tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(locationActivity.userLocation.getLatitude());
            tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(locationActivity.userLocation.getLongitude());
            ChatActivity chatActivity = locationActivity.parentFragment;
            if (chatActivity != null && chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(locationActivity.getParentActivity(), locationActivity.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda35
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i3, int i4) {
                        LocationActivity.$r8$lambda$hKNgNW_QmbtibPUMoDavOyPn0Mw(LocationActivity.this, tL_messageMediaGeo, z, i3, i4);
                    }
                });
                return;
            } else {
                locationActivity.delegate.didSelectLocation(tL_messageMediaGeo, locationActivity.locationType, true, 0, 0L);
                locationActivity.finishFragment();
                return;
            }
        }
        if (locationActivity.locationType == 2 && locationActivity.getLocationController().isSharingLocation(locationActivity.dialogId) && locationActivity.adapter.getItemViewType(i) == 7) {
            locationActivity.getLocationController().removeSharingLocation(locationActivity.dialogId);
            locationActivity.adapter.notifyDataSetChanged();
            locationActivity.finishFragment();
            return;
        }
        if (locationActivity.locationType == 2 && locationActivity.getLocationController().isSharingLocation(locationActivity.dialogId) && locationActivity.adapter.getItemViewType(i) == 6) {
            locationActivity.openShareLiveLocation(locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId).period != Integer.MAX_VALUE, 0);
            return;
        }
        if ((i == 2 && locationActivity.locationType == 1) || ((i == 1 && locationActivity.locationType == 2) || (i == 3 && locationActivity.locationType == 3))) {
            if (locationActivity.getLocationController().isSharingLocation(locationActivity.dialogId)) {
                locationActivity.getLocationController().removeSharingLocation(locationActivity.dialogId);
                locationActivity.adapter.notifyDataSetChanged();
                locationActivity.finishFragment();
                return;
            }
            locationActivity.openShareLiveLocation(false, 0);
            return;
        }
        final Object item = locationActivity.adapter.getItem(i);
        if (item instanceof TLRPC.TL_messageMediaVenue) {
            ChatActivity chatActivity2 = locationActivity.parentFragment;
            if (chatActivity2 != null && chatActivity2.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(locationActivity.getParentActivity(), locationActivity.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda36
                    @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                    public final void didSelectDate(boolean z, int i3, int i4) {
                        LocationActivity.$r8$lambda$fVDYpJ7uhdo1bBE6j4I2_AFWe18(LocationActivity.this, item, z, i3, i4);
                    }
                });
                return;
            } else {
                locationActivity.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) item, locationActivity.locationType, true, 0, 0L);
                locationActivity.finishFragment();
                return;
            }
        }
        if (item instanceof LiveLocation) {
            LiveLocation liveLocation = (LiveLocation) item;
            locationActivity.selectedMarkerId = liveLocation.id;
            if (locationActivity.showAllMode) {
                locationActivity.showAllMode = false;
                locationActivity.updateShowAllButton();
            }
            locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation.marker.getPosition(), locationActivity.map.getMaxZoomLevel() - 4.0f));
        }
    }

    public static /* synthetic */ void $r8$lambda$0umiyO448BkBMLobQhXDvxQN2hQ(final LocationActivity locationActivity, final AlertDialog[] alertDialogArr, final TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLObject tLObject, TLRPC.TL_error tL_error) {
        locationActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$W4VsvrIVZPTY3nYhOfxRpuhyBvQ(LocationActivity.this, alertDialogArr, tL_messageMediaVenue);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$W4VsvrIVZPTY3nYhOfxRpuhyBvQ(LocationActivity locationActivity, AlertDialog[] alertDialogArr, TLRPC.TL_messageMediaVenue tL_messageMediaVenue) {
        locationActivity.getClass();
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        locationActivity.delegate.didSelectLocation(tL_messageMediaVenue, 4, true, 0, 0L);
        locationActivity.finishFragment();
    }

    public static /* synthetic */ void $r8$lambda$hKNgNW_QmbtibPUMoDavOyPn0Mw(LocationActivity locationActivity, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, boolean z, int i, int i2) {
        locationActivity.delegate.didSelectLocation(tL_messageMediaGeo, locationActivity.locationType, z, i, 0L);
        locationActivity.finishFragment();
    }

    public static /* synthetic */ void $r8$lambda$fVDYpJ7uhdo1bBE6j4I2_AFWe18(LocationActivity locationActivity, Object obj, boolean z, int i, int i2) {
        locationActivity.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) obj, locationActivity.locationType, z, i, 0L);
        locationActivity.finishFragment();
    }

    public static /* synthetic */ boolean $r8$lambda$zEZ5BV3rTdK9PEXsOKpIIJkLIYg(LocationActivity locationActivity, MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        if (locationActivity.yOffset != 0.0f) {
            motionEvent2 = MotionEvent.obtain(motionEvent);
            motionEvent2.offsetLocation(0.0f, (-locationActivity.yOffset) / 2.0f);
            motionEvent3 = motionEvent2;
        } else {
            motionEvent2 = null;
            motionEvent3 = motionEvent;
        }
        boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent3)).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    public static /* synthetic */ boolean $r8$lambda$_VrR_enDxKsuEuK7304x0HoWBqk(LocationActivity locationActivity, MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        if (locationActivity.messageObject == null && locationActivity.chatLocation == null) {
            if (motionEvent.getAction() == 0) {
                AnimatorSet animatorSet = locationActivity.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                locationActivity.animatorSet = animatorSet2;
                animatorSet2.setDuration(200L);
                locationActivity.animatorSet.playTogether(ObjectAnimator.ofFloat(locationActivity.markerImageView, (Property<View, Float>) View.TRANSLATION_Y, locationActivity.markerTop - AndroidUtilities.dp(10.0f)));
                locationActivity.animatorSet.start();
            } else if (motionEvent.getAction() == 1) {
                AnimatorSet animatorSet3 = locationActivity.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                locationActivity.yOffset = 0.0f;
                AnimatorSet animatorSet4 = new AnimatorSet();
                locationActivity.animatorSet = animatorSet4;
                animatorSet4.setDuration(200L);
                locationActivity.animatorSet.playTogether(ObjectAnimator.ofFloat(locationActivity.markerImageView, (Property<View, Float>) View.TRANSLATION_Y, locationActivity.markerTop));
                locationActivity.animatorSet.start();
                locationActivity.adapter.fetchLocationAddress();
            }
            if (motionEvent.getAction() == 2) {
                if (!locationActivity.userLocationMoved) {
                    ImageView imageView = locationActivity.locationButton;
                    int i = Theme.key_location_actionIcon;
                    imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
                    locationActivity.locationButton.setTag(Integer.valueOf(i));
                    locationActivity.userLocationMoved = true;
                }
                IMapsProvider.IMap iMap = locationActivity.map;
                if (iMap != null && (location = locationActivity.userLocation) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    locationActivity.userLocation.setLongitude(locationActivity.map.getCameraPosition().target.longitude);
                }
                locationActivity.adapter.setCustomLocation(locationActivity.userLocation);
            }
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    public static /* synthetic */ void $r8$lambda$_4CJmc_SEs9KtpPe6Lx0pjbTCEE(final LocationActivity locationActivity) {
        locationActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$tLtM38EkFHu4452UixqWxUt0tEQ(LocationActivity.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$tLtM38EkFHu4452UixqWxUt0tEQ(LocationActivity locationActivity) {
        IMapsProvider.ICameraUpdate iCameraUpdate = locationActivity.moveToBounds;
        if (iCameraUpdate != null) {
            locationActivity.map.moveCamera(iCameraUpdate);
            locationActivity.moveToBounds = null;
        }
    }

    public static /* synthetic */ void $r8$lambda$REILUOus-J1dJa5AlJtsmIEkDok(final LocationActivity locationActivity, final IMapsProvider.IMapView iMapView) {
        locationActivity.getClass();
        try {
            iMapView.onCreate(null);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$TrFWnepWLNrPEwUt4XyTa94JvqI(LocationActivity.this, iMapView);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$TrFWnepWLNrPEwUt4XyTa94JvqI(final LocationActivity locationActivity, IMapsProvider.IMapView iMapView) {
        if (locationActivity.mapView == null || locationActivity.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            locationActivity.mapView.getMapAsync(new Consumer() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda43
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    LocationActivity.$r8$lambda$hWA6pZVkQMbvd3luV55G7My1jq4(LocationActivity.this, (IMapsProvider.IMap) obj);
                }
            });
            locationActivity.mapsInitialized = true;
            if (locationActivity.onResumeCalled) {
                locationActivity.mapView.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$hWA6pZVkQMbvd3luV55G7My1jq4(LocationActivity locationActivity, IMapsProvider.IMap iMap) {
        locationActivity.map = iMap;
        int mapThemeResId = locationActivity.getMapThemeResId();
        if (mapThemeResId != 0) {
            locationActivity.currentMapStyleDark = true;
            locationActivity.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, mapThemeResId));
        }
        locationActivity.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
        locationActivity.onMapInit();
    }

    public static /* synthetic */ void $r8$lambda$iNvxHMlkUW13ygyX7FXr23dkUxI(LocationActivity locationActivity, ArrayList arrayList) {
        locationActivity.searchInProgress = false;
        locationActivity.updateEmptyView();
    }

    public static /* synthetic */ void $r8$lambda$Lkhjmr4Sf3Hfzo2Bd7FhOlG41h8(final LocationActivity locationActivity, ActionBarMenu actionBarMenu, View view, int i) {
        float maxZoomLevel;
        float f;
        final TLRPC.TL_messageMediaVenue item = locationActivity.searchAdapter.getItem(i);
        if (item != null && item.icon != null && locationActivity.locationType == 8 && locationActivity.map != null) {
            locationActivity.userLocationMoved = true;
            actionBarMenu.closeSearchField(true);
            if ("pin".equals(item.icon)) {
                maxZoomLevel = locationActivity.map.getMaxZoomLevel();
                f = 4.0f;
            } else {
                maxZoomLevel = locationActivity.map.getMaxZoomLevel();
                f = 9.0f;
            }
            float f2 = maxZoomLevel - f;
            IMapsProvider.IMap iMap = locationActivity.map;
            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
            TLRPC.GeoPoint geoPoint = item.geo;
            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f2));
            Location location = locationActivity.userLocation;
            if (location != null) {
                location.setLatitude(item.geo.lat);
                locationActivity.userLocation.setLongitude(item.geo._long);
            }
            locationActivity.adapter.setCustomLocation(locationActivity.userLocation);
            return;
        }
        if (item == null || locationActivity.delegate == null) {
            return;
        }
        ChatActivity chatActivity = locationActivity.parentFragment;
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(locationActivity.getParentActivity(), locationActivity.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda27
                @Override // org.telegram.ui.Components.AlertsCreator.ScheduleDatePickerDelegate
                public final void didSelectDate(boolean z, int i2, int i3) {
                    LocationActivity.$r8$lambda$vHeczambowCoFeQr4T4g6M9jX3Q(LocationActivity.this, item, z, i2, i3);
                }
            });
        } else {
            locationActivity.delegate.didSelectLocation(item, locationActivity.locationType, true, 0, 0L);
            locationActivity.finishFragment();
        }
    }

    public static /* synthetic */ void $r8$lambda$vHeczambowCoFeQr4T4g6M9jX3Q(LocationActivity locationActivity, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, boolean z, int i, int i2) {
        locationActivity.delegate.didSelectLocation(tL_messageMediaVenue, locationActivity.locationType, z, i, 0L);
        locationActivity.finishFragment();
    }

    private void updateShowAllButton() {
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.showAllButton == null) {
            return;
        }
        if (this.showAllMode) {
            showShowAllButton(false, true);
            fitAllLiveLocations(true);
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        int size = this.markers.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Message message = ((LiveLocation) this.markers.get(i3)).object;
            if (message != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                i2++;
            }
        }
        boolean z = this.markersMap.get(getUserConfig().getClientUserId()) != null;
        if (this.myLocation != null && !z) {
            i2++;
        }
        showShowAllButton(i2 >= 2, true);
    }

    private boolean fitAllLiveLocations(boolean z) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.map == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        int size = this.markers.size();
        for (int i2 = 0; i2 < size; i2++) {
            LiveLocation liveLocation = (LiveLocation) this.markers.get(i2);
            IMapsProvider.IMarker iMarker = liveLocation.marker;
            if (iMarker != null && (message = liveLocation.object) != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                arrayList.add(iMarker.getPosition());
            }
        }
        boolean z2 = this.markersMap.get(getUserConfig().getClientUserId()) != null;
        Location location = this.myLocation;
        if (location != null && !z2) {
            arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.myLocation.getLongitude()));
        }
        if (arrayList.size() < 2) {
            return false;
        }
        try {
            IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
            int size2 = arrayList.size();
            double d = -1.7976931348623157E308d;
            double d2 = Double.MAX_VALUE;
            double d3 = Double.MAX_VALUE;
            int i3 = 0;
            double d4 = -1.7976931348623157E308d;
            while (i3 < size2) {
                IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i3);
                onCreateLatLngBoundsBuilder.include(latLng);
                int i4 = size2;
                double d5 = latLng.latitude;
                if (d5 < d2) {
                    d2 = d5;
                }
                if (d5 > d) {
                    d = d5;
                }
                double d6 = latLng.longitude;
                if (d6 < d3) {
                    d3 = d6;
                }
                if (d6 > d4) {
                    d4 = d6;
                }
                i3++;
                size2 = i4;
            }
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d2 + d) / 2.0d, (d3 + d4) / 2.0d);
            double radians = Math.toRadians(d - d2) * 6366198.0d;
            double radians2 = Math.toRadians(d4 - d3) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
            if (radians < 30.0d || radians2 < 30.0d) {
                onCreateLatLngBoundsBuilder.include(move(latLng2, 15.0d, 15.0d));
                onCreateLatLngBoundsBuilder.include(move(latLng2, -15.0d, -15.0d));
            }
            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(onCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f));
            if (z) {
                this.map.animateCamera(newCameraUpdateLatLngBounds, 500, null);
            } else {
                this.map.moveCamera(newCameraUpdateLatLngBounds);
            }
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    private void showShowAllButton(final boolean z, boolean z2) {
        Boolean bool = this.shownShowAllButton;
        if (bool == null || bool.booleanValue() != z) {
            this.shownShowAllButton = Boolean.valueOf(z);
            if (!z2) {
                this.showAllButton.setVisibility(z ? 0 : 8);
                this.showAllButton.setAlpha(z ? 1.0f : 0.0f);
                this.showAllButton.setScaleX(z ? 1.0f : 0.7f);
                this.showAllButton.setScaleY(z ? 1.0f : 0.7f);
                return;
            }
            this.showAllButton.setVisibility(0);
            this.showAllButton.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$5H0RgzlYtlen6ONNYZaA7H0F7dw(LocationActivity.this, z);
                }
            }).start();
        }
    }

    public static /* synthetic */ void $r8$lambda$5H0RgzlYtlen6ONNYZaA7H0F7dw(LocationActivity locationActivity, boolean z) {
        if (z) {
            locationActivity.getClass();
        } else {
            locationActivity.showAllButton.setVisibility(8);
        }
    }

    private boolean isActiveThemeDark() {
        return (getResourceProvider() == null && Theme.getActiveTheme().isDark()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f;
    }

    private int getMapThemeResId() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f) {
            return R.raw.mapstyle_night;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openDirections(LiveLocation liveLocation) {
        double d;
        double d2;
        String str;
        TLRPC.Message message;
        if (liveLocation != null && (message = liveLocation.object) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.chatLocation.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.myLocation != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.myLocation.getLatitude()), Double.valueOf(this.myLocation.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateEmptyView() {
        if (this.searching) {
            if (this.searchInProgress) {
                this.searchListView.setEmptyView(null);
                this.emptyView.setVisibility(8);
                this.searchListView.setVisibility(8);
                return;
            }
            this.searchListView.setEmptyView(this.emptyView);
            return;
        }
        this.emptyView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSearchPlacesButton(boolean z) {
        SearchButton searchButton;
        Location location;
        Location location2;
        if (this.locationType == 3) {
            z = true;
        }
        if (z && (searchButton = this.searchAreaButton) != null && searchButton.getTag() == null && ((location = this.myLocation) == null || (location2 = this.userLocation) == null || location2.distanceTo(location) < 300.0f)) {
            z = false;
        }
        SearchButton searchButton2 = this.searchAreaButton;
        if (searchButton2 != null) {
            if (!z || searchButton2.getTag() == null) {
                if (z || this.searchAreaButton.getTag() != null) {
                    this.searchAreaButton.setTag(z ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.searchAreaButton, (Property<SearchButton, Float>) View.TRANSLATION_X, z ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatorSet.start();
                }
            }
        }
    }

    private Bitmap createUserBitmap(LiveLocation liveLocation) {
        Bitmap bitmap = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC.User user = liveLocation.user;
                if (user != null) {
                    avatarDrawable.setInfo(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = liveLocation.chat;
                    if (chat != null) {
                        avatarDrawable.setInfo(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                avatarDrawable.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                avatarDrawable.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = liveLocation.avatarReceiver;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : liveLocation.avatarReceiver.getBitmap();
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float dp = AndroidUtilities.dp(50.0f) / bitmap2.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(dp, dp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th) {
                th = th;
                bitmap = createBitmap;
                FileLog.e(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private long getMessageId(TLRPC.Message message) {
        if (message.from_id != null) {
            return MessageObject.getFromChatId(message);
        }
        return MessageObject.getDialogId(message);
    }

    private void openProximityAlert() {
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle == null) {
            createCircle(500);
        } else {
            this.previousRadius = iCircle.getRadius();
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        ProximitySheet proximitySheet = new ProximitySheet(getParentActivity(), user, new ProximitySheet.onRadiusPickerChange() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda39
            @Override // org.telegram.ui.Components.ProximitySheet.onRadiusPickerChange
            public final boolean run(boolean z, int i) {
                return LocationActivity.$r8$lambda$a2-VZvzX3eqzxSL1Ksnx9xJjLGQ(LocationActivity.this, z, i);
            }
        }, new ProximitySheet.onRadiusPickerChange() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda40
            @Override // org.telegram.ui.Components.ProximitySheet.onRadiusPickerChange
            public final boolean run(boolean z, int i) {
                return LocationActivity.$r8$lambda$B9yShH8cAkPxwdKUIlksAx4j_Fc(LocationActivity.this, user, z, i);
            }
        }, new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$w4L7yDc386107Km3CKUUjatx2_8(LocationActivity.this);
            }
        });
        this.proximitySheet = proximitySheet;
        ((FrameLayout) this.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1, -1.0f));
        this.proximitySheet.show();
    }

    public static /* synthetic */ boolean $r8$lambda$a2-VZvzX3eqzxSL1Ksnx9xJjLGQ(LocationActivity locationActivity, boolean z, int i) {
        IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
        if (iCircle != null) {
            iCircle.setRadius(i);
            if (z) {
                locationActivity.moveToBounds(i, true, true);
            }
        }
        if (!DialogObject.isChatDialog(locationActivity.dialogId)) {
            int size = locationActivity.markers.size();
            for (int i2 = 0; i2 < size; i2++) {
                LiveLocation liveLocation = (LiveLocation) locationActivity.markers.get(i2);
                if (liveLocation.object != null && !UserObject.isUserSelf(liveLocation.user)) {
                    TLRPC.GeoPoint geoPoint = liveLocation.object.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (locationActivity.myLocation.distanceTo(location) > i) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$B9yShH8cAkPxwdKUIlksAx4j_Fc(final LocationActivity locationActivity, final TLRPC.User user, boolean z, final int i) {
        if (locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId) == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.ShareLocationAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ShareLocationAlertText));
            builder.setPositiveButton(LocaleController.getString(R.string.ShareLocationAlertButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda48
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    LocationActivity.this.shareLiveLocation(user, RichMessageLayout.PART_MAX_HEIGHT_DP, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            locationActivity.showDialog(builder.create());
            return false;
        }
        locationActivity.proximitySheet.setRadiusSet();
        locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert2);
        locationActivity.getUndoView().showWithAction(0L, 24, Integer.valueOf(i), user, (Runnable) null, (Runnable) null);
        locationActivity.getLocationController().setProximityLocation(locationActivity.dialogId, i, true);
        return true;
    }

    public static /* synthetic */ void $r8$lambda$w4L7yDc386107Km3CKUUjatx2_8(LocationActivity locationActivity) {
        IMapsProvider.IMap iMap = locationActivity.map;
        if (iMap != null) {
            iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
        }
        if (!locationActivity.proximitySheet.getRadiusSet()) {
            double d = locationActivity.previousRadius;
            if (d > 0.0d) {
                locationActivity.proximityCircle.setRadius(d);
            } else {
                IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                if (iCircle != null) {
                    iCircle.remove();
                    locationActivity.proximityCircle = null;
                }
            }
        }
        locationActivity.proximitySheet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openShareLiveLocation(final boolean z, final int i) {
        Activity parentActivity;
        int checkSelfPermission;
        if (this.delegate == null || disablePermissionCheck() || getParentActivity() == null || this.myLocation == null || !checkGpsEnabled()) {
            return;
        }
        if (this.checkBackgroundPermission && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.askWithRadius = i;
            this.checkBackgroundPermission = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400) {
                checkSelfPermission = parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION");
                if (checkSelfPermission != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    AlertsCreator.createBackgroundLocationPermissionDialog(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda19
                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.openShareLiveLocation(z, LocationActivity.this.askWithRadius);
                        }
                    }, null).show();
                    return;
                }
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        showDialog(AlertsCreator.createLocationUpdateDialog(getParentActivity(), z, user, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda20
            @Override // org.telegram.messenger.MessagesStorage.IntCallback
            public final void run(int i2) {
                LocationActivity.$r8$lambda$gq2QOm54qXkPzF6G6eXocZ6G9mI(LocationActivity.this, z, user, i, i2);
            }
        }, null));
    }

    public static /* synthetic */ void $r8$lambda$gq2QOm54qXkPzF6G6eXocZ6G9mI(LocationActivity locationActivity, boolean z, TLRPC.User user, int i, int i2) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z) {
            LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = locationActivity.getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(locationActivity.currentAccount).getLastKnownLocation();
                tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
                tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i3 = sharingLocationInfo.lastSentProximityMeters;
                int i4 = sharingLocationInfo.proximityMeters;
                if (i3 != i4) {
                    inputMedia.proximity_notification_radius = i4;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = LocationController.getHeading(lastKnownLocation);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i5 = inputMedia2.flags;
                inputMedia2.flags = i5 | 4;
                int i6 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i7 = i2 == Integer.MAX_VALUE ? ConnectionsManager.DEFAULT_DATACENTER_ID : sharingLocationInfo.period + i2;
                sharingLocationInfo.period = i7;
                inputMedia2.period = i7;
                if (i2 != Integer.MAX_VALUE) {
                    i6 = sharingLocationInfo.stopTime + i2;
                }
                sharingLocationInfo.stopTime = i6;
                inputMedia2.flags = i5 | 6;
                MessageObject messageObject = sharingLocationInfo.messageObject;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i7;
                    locationActivity.getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                locationActivity.getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        locationActivity.shareLiveLocation(user, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shareLiveLocation(TLRPC.User user, int i, int i2) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.myLocation.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.myLocation.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.myLocation);
        int i3 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i;
        tL_messageMediaGeoLive.proximity_notification_radius = i2;
        tL_messageMediaGeoLive.flags = i3 | 9;
        this.delegate.didSelectLocation(tL_messageMediaGeoLive, this.locationType, true, 0, 0L);
        if (i2 > 0) {
            this.proximitySheet.setRadiusSet();
            this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
            ProximitySheet proximitySheet = this.proximitySheet;
            if (proximitySheet != null) {
                proximitySheet.dismiss();
            }
            getUndoView().showWithAction(0L, 24, Integer.valueOf(i2), user, (Runnable) null, (Runnable) null);
            return;
        }
        finishFragment();
    }

    private Bitmap createPlaceBitmap(int i) {
        Bitmap bitmap = this.bitmapCache[i % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(LocationCell.getColorForIndex(i));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            this.bitmapCache[i % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlacesMarkers(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int size = this.placeMarkers.size();
        for (int i = 0; i < size; i++) {
            ((VenueLocation) this.placeMarkers.get(i)).marker.remove();
        }
        this.placeMarkers.clear();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
            try {
                IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                position.icon(createPlaceBitmap(i2));
                position.anchor(0.5f, 0.5f);
                position.title(tL_messageMediaVenue.title);
                position.snippet(tL_messageMediaVenue.address);
                VenueLocation venueLocation = new VenueLocation();
                venueLocation.num = i2;
                IMapsProvider.IMarker addMarker = this.map.addMarker(position);
                venueLocation.marker = addMarker;
                venueLocation.venue = tL_messageMediaVenue;
                addMarker.setTag(venueLocation);
                this.placeMarkers.add(venueLocation);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupAvatarReceiver(final LiveLocation liveLocation) {
        if (liveLocation.avatarReceiver != null) {
            return;
        }
        TLRPC.User user = liveLocation.user;
        TLRPC.Chat chat = liveLocation.chat;
        if (user == null && chat == 0) {
            return;
        }
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        if (user != null) {
            avatarDrawable.setInfo(this.currentAccount, user);
        } else {
            avatarDrawable.setInfo(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda23
            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                LocationActivity.$r8$lambda$SUh1QrRRlUkKQzsTAqQ5jiXZfdw(LocationActivity.this, liveLocation, imageReceiver2, z, z2, z3);
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, avatarDrawable);
        liveLocation.avatarReceiver = imageReceiver;
    }

    public static /* synthetic */ void $r8$lambda$SUh1QrRRlUkKQzsTAqQ5jiXZfdw(LocationActivity locationActivity, LiveLocation liveLocation, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap createUserBitmap;
        locationActivity.getClass();
        if (!z || z2 || liveLocation.marker == null || (createUserBitmap = locationActivity.createUserBitmap(liveLocation)) == null) {
            return;
        }
        liveLocation.marker.setIcon(createUserBitmap);
    }

    private LiveLocation addUserMarker(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        LiveLocation liveLocation = (LiveLocation) this.markersMap.get(MessageObject.getFromChatId(message));
        if (liveLocation == null) {
            liveLocation = new LiveLocation();
            liveLocation.object = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                liveLocation.user = getMessagesController().getUser(Long.valueOf(liveLocation.object.from_id.user_id));
                liveLocation.id = liveLocation.object.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    liveLocation.user = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    liveLocation.chat = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                liveLocation.id = dialogId;
            }
            setupAvatarReceiver(liveLocation);
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap createUserBitmap = createUserBitmap(liveLocation);
                if (createUserBitmap != null) {
                    position.icon(createUserBitmap);
                    position.anchor(0.5f, 0.907f);
                    liveLocation.marker = this.map.addMarker(position);
                    if (!UserObject.isUserSelf(liveLocation.user)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.map.addMarker(flat);
                        liveLocation.directionMarker = addMarker;
                        int i = message.media.heading;
                        if (i != 0) {
                            addMarker.setRotation(i);
                            liveLocation.directionMarker.setIcon(R.drawable.map_pin_cone2);
                            liveLocation.hasRotation = true;
                        } else {
                            addMarker.setRotation(0);
                            liveLocation.directionMarker.setIcon(R.drawable.map_pin_circle);
                            liveLocation.hasRotation = false;
                        }
                    }
                    this.markers.add(liveLocation);
                    this.markersMap.put(liveLocation.id, liveLocation);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
                    if (liveLocation.id == getUserConfig().getClientUserId() && sharingLocationInfo != null && liveLocation.object.id == sharingLocationInfo.mid && (location = this.myLocation) != null) {
                        liveLocation.marker.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.myLocation.getLongitude()));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            liveLocation.object = message;
            liveLocation.marker.setPosition(latLng);
            if (this.selectedMarkerId == liveLocation.id) {
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(liveLocation.marker.getPosition()));
            }
        }
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            proximitySheet.updateText(true, true);
        }
        updateShowAllButton();
        return liveLocation;
    }

    private LiveLocation addUserMarker(TLRPC.TL_channelLocation tL_channelLocation) {
        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        LiveLocation liveLocation = new LiveLocation();
        if (DialogObject.isUserDialog(this.dialogId)) {
            liveLocation.user = getMessagesController().getUser(Long.valueOf(this.dialogId));
        } else {
            liveLocation.chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        }
        liveLocation.id = this.dialogId;
        setupAvatarReceiver(liveLocation);
        try {
            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
            Bitmap createUserBitmap = createUserBitmap(liveLocation);
            if (createUserBitmap != null) {
                position.icon(createUserBitmap);
                position.anchor(0.5f, 0.907f);
                liveLocation.marker = this.map.addMarker(position);
                if (!UserObject.isUserSelf(liveLocation.user)) {
                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                    flat.icon(R.drawable.map_pin_circle);
                    flat.anchor(0.5f, 0.5f);
                    liveLocation.directionMarker = this.map.addMarker(flat);
                }
                this.markers.add(liveLocation);
                this.markersMap.put(liveLocation.id, liveLocation);
                return liveLocation;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return liveLocation;
    }

    private void onMapInit() {
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i;
        if (this.map == null) {
            return;
        }
        this.mapView.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
        final float minZoomLevel = this.initialMaxZoom ? this.map.getMinZoomLevel() + 4.0f : this.map.getMaxZoomLevel() - 4.0f;
        TLRPC.TL_channelLocation tL_channelLocation = this.chatLocation;
        if (tL_channelLocation != null) {
            this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(addUserMarker(tL_channelLocation).marker.getPosition(), minZoomLevel));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    LiveLocation addUserMarker = addUserMarker(this.messageObject.messageOwner);
                    if (!getRecentLocations()) {
                        this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(addUserMarker.marker.getPosition(), minZoomLevel));
                    }
                } else {
                    IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(this.userLocation.getLatitude(), this.userLocation.getLongitude());
                    try {
                        this.map.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).icon(R.drawable.map_pin2));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, minZoomLevel));
                    this.firstFocus = false;
                    getRecentLocations();
                }
            } else {
                Location location = new Location("network");
                this.userLocation = location;
                TLRPC.TL_channelLocation tL_channelLocation2 = this.initialLocation;
                if (tL_channelLocation2 != null) {
                    TLRPC.GeoPoint geoPoint = tL_channelLocation2.geo_point;
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), minZoomLevel));
                    this.userLocation.setLatitude(this.initialLocation.geo_point.lat);
                    this.userLocation.setLongitude(this.initialLocation.geo_point._long);
                    this.userLocation.setAccuracy(this.initialLocation.geo_point.accuracy_radius);
                    this.adapter.setCustomLocation(this.userLocation);
                } else {
                    location.setLatitude(20.659322d);
                    this.userLocation.setLongitude(-11.40625d);
                }
            }
        }
        try {
            this.map.setMyLocationEnabled(true);
        } catch (Exception e2) {
            FileLog.e((Throwable) e2, false);
        }
        this.map.getUiSettings().setMyLocationButtonEnabled(false);
        this.map.getUiSettings().setZoomControlsEnabled(false);
        this.map.getUiSettings().setCompassEnabled(false);
        this.map.setOnCameraMoveStartedListener(new IMapsProvider.OnCameraMoveStartedListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda44
            @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
            public final void onCameraMoveStarted(int i2) {
                LocationActivity.$r8$lambda$rwi6Epx2enBrubD340jxaP1OO5I(LocationActivity.this, i2);
            }
        });
        this.map.setOnMyLocationChangeListener(new Consumer() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda45
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                LocationActivity.$r8$lambda$hGsT8eIO4sX9TIZhWKB7bLKz3SA(LocationActivity.this, (Location) obj);
            }
        });
        this.map.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda46
            @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
            public final boolean onClick(IMapsProvider.IMarker iMarker) {
                return LocationActivity.$r8$lambda$O0bihf5o18LMV7WwFMsDXhfOlWU(LocationActivity.this, minZoomLevel, iMarker);
            }
        });
        this.map.setOnCameraMoveListener(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$Lj8YDNyPXvxI9f330EoIBiCDpHM(LocationActivity.this);
            }
        });
        Location lastLocation = getLastLocation();
        this.myLocation = lastLocation;
        positionMarker(lastLocation);
        if (this.checkGpsEnabled && getParentActivity() != null) {
            this.checkGpsEnabled = false;
            checkGpsEnabled();
        }
        ImageView imageView = this.proximityButton;
        if (imageView == null || imageView.getVisibility() != 0 || (sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId)) == null || (i = sharingLocationInfo.proximityMeters) <= 0) {
            return;
        }
        createCircle(i);
    }

    public static /* synthetic */ void $r8$lambda$rwi6Epx2enBrubD340jxaP1OO5I(LocationActivity locationActivity, int i) {
        View childAt;
        RecyclerView.ViewHolder findContainingViewHolder;
        if (i != 1) {
            locationActivity.getClass();
            return;
        }
        locationActivity.showSearchPlacesButton(true);
        locationActivity.removeInfoView();
        locationActivity.selectedMarkerId = -1L;
        if (locationActivity.showAllMode) {
            locationActivity.showAllMode = false;
            locationActivity.updateShowAllButton();
        }
        if (locationActivity.scrolling) {
            return;
        }
        int i2 = locationActivity.locationType;
        if ((i2 == 0 || i2 == 1) && locationActivity.listView.getChildCount() > 0 && (childAt = locationActivity.listView.getChildAt(0)) != null && (findContainingViewHolder = locationActivity.listView.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() == 0) {
            int dp = locationActivity.locationType == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = locationActivity.map.getCameraPosition();
                locationActivity.forceUpdate = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                locationActivity.listView.smoothScrollBy(0, top + dp);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$hGsT8eIO4sX9TIZhWKB7bLKz3SA(LocationActivity locationActivity, Location location) {
        locationActivity.positionMarker(location);
        locationActivity.getLocationController().setMapLocation(location, locationActivity.isFirstLocation);
        locationActivity.isFirstLocation = false;
    }

    public static /* synthetic */ boolean $r8$lambda$O0bihf5o18LMV7WwFMsDXhfOlWU(LocationActivity locationActivity, float f, IMapsProvider.IMarker iMarker) {
        locationActivity.getClass();
        if (!(iMarker.getTag() instanceof VenueLocation)) {
            return true;
        }
        locationActivity.markerImageView.setVisibility(4);
        if (!locationActivity.userLocationMoved) {
            ImageView imageView = locationActivity.locationButton;
            int i = Theme.key_location_actionIcon;
            imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            locationActivity.locationButton.setTag(Integer.valueOf(i));
            locationActivity.userLocationMoved = true;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= locationActivity.markers.size()) {
                break;
            }
            LiveLocation liveLocation = (LiveLocation) locationActivity.markers.get(i2);
            if (liveLocation == null || liveLocation.marker != iMarker) {
                i2++;
            } else {
                locationActivity.selectedMarkerId = liveLocation.id;
                if (locationActivity.showAllMode) {
                    locationActivity.showAllMode = false;
                    locationActivity.updateShowAllButton();
                }
                locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation.marker.getPosition(), f));
            }
        }
        locationActivity.overlayView.addInfoView(iMarker);
        return true;
    }

    public static /* synthetic */ void $r8$lambda$Lj8YDNyPXvxI9f330EoIBiCDpHM(LocationActivity locationActivity) {
        MapOverlayView mapOverlayView = locationActivity.overlayView;
        if (mapOverlayView != null) {
            mapOverlayView.updatePositions();
        }
    }

    private boolean checkGpsEnabled() {
        if (disablePermissionCheck()) {
            return false;
        }
        if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        try {
            if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTopAnimation(R.raw.permission_request_location, 72, false, getThemedColor(Theme.key_dialogTopBackground));
                builder.setMessage(LocaleController.getString(R.string.GpsDisabledAlertText));
                builder.setPositiveButton(LocaleController.getString(R.string.ConnectingToProxyEnable), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda25
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LocationActivity.$r8$lambda$olPIGZjPMdYpubrZYnTegg3uUJo(LocationActivity.this, alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return true;
    }

    public static /* synthetic */ void $r8$lambda$olPIGZjPMdYpubrZYnTegg3uUJo(LocationActivity locationActivity, AlertDialog alertDialog, int i) {
        if (locationActivity.getParentActivity() == null) {
            return;
        }
        try {
            locationActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    private void createCircle(int i) {
        if (this.map == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        onCreateCircleOptions.radius(i);
        if (isActiveThemeDark()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.proximityCircle = this.map.addCircle(onCreateCircleOptions);
    }

    private void removeInfoView() {
        if (this.lastPressedMarker != null) {
            this.markerImageView.setVisibility(0);
            this.overlayView.removeInfoView(this.lastPressedMarker);
            this.lastPressedMarker = null;
            this.lastPressedVenue = null;
            this.lastPressedMarkerView = null;
        }
    }

    private void showPermissionAlert(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTopAnimation(R.raw.permission_request_location, 72, false, getThemedColor(Theme.key_dialogTopBackground));
        if (z) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationNavigation)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends)));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda37
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                LocationActivity.$r8$lambda$_jLp2z-RJpPLifIkYSwg5jMY-64(LocationActivity.this, alertDialog, i);
            }
        });
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    public static /* synthetic */ void $r8$lambda$_jLp2z-RJpPLifIkYSwg5jMY-64(LocationActivity locationActivity, AlertDialog alertDialog, int i) {
        if (locationActivity.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            locationActivity.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        try {
            if (this.mapView.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.mapView.getView().getParent()).removeView(this.mapView.getView());
            }
        } catch (Exception unused) {
        }
        FrameLayout frameLayout = this.mapViewClip;
        if (frameLayout != null) {
            frameLayout.addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.dp(10.0f), 51));
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null) {
                try {
                    if (mapOverlayView.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.overlayView.getParent()).removeView(this.overlayView);
                    }
                } catch (Exception unused2) {
                }
                this.mapViewClip.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.dp(10.0f), 51));
            }
            updateClipView(false);
            maybeShowProximityHint();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, -1, 51));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeShowProximityHint() {
        SharedPreferences globalMainSettings;
        int i;
        ImageView imageView = this.proximityButton;
        if (imageView == null || imageView.getVisibility() != 0 || this.proximityAnimationInProgress || (i = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i + 1).commit();
        if (DialogObject.isUserDialog(this.dialogId)) {
            this.hintView.setText(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.dialogId)))));
        } else {
            this.hintView.setText(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.hintView.show();
    }

    private void showResults() {
        if (this.adapter.getItemCount() != 0 && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            int dp = AndroidUtilities.dp(258.0f) + this.listView.getChildAt(0).getTop();
            if (dp < 0 || dp > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.listView.smoothScrollBy(0, dp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateClipView(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            i = (int) findViewHolderForAdapterPosition.itemView.getY();
            i2 = this.overScrollHeight + Math.min(i, 0);
        } else {
            i = -this.mapViewClip.getMeasuredHeight();
            i2 = 0;
        }
        if (((FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams()) != null) {
            if (i2 <= 0) {
                if (this.mapView.getView().getVisibility() == 0) {
                    this.mapView.getView().setVisibility(4);
                    this.mapViewClip.setVisibility(4);
                    MapOverlayView mapOverlayView = this.overlayView;
                    if (mapOverlayView != null) {
                        mapOverlayView.setVisibility(4);
                    }
                }
            } else if (this.mapView.getView().getVisibility() == 4) {
                this.mapView.getView().setVisibility(0);
                this.mapViewClip.setVisibility(0);
                MapOverlayView mapOverlayView2 = this.overlayView;
                if (mapOverlayView2 != null) {
                    mapOverlayView2.setVisibility(0);
                }
            }
            this.mapViewClip.setTranslationY(Math.min(0, i));
            int i3 = -i;
            int i4 = i3 / 2;
            this.mapView.getView().setTranslationY(Math.max(0, i4));
            MapOverlayView mapOverlayView3 = this.overlayView;
            if (mapOverlayView3 != null) {
                mapOverlayView3.setTranslationY(Math.max(0, i4));
            }
            int measuredHeight = this.overScrollHeight - this.mapTypeButton.getMeasuredHeight();
            int i5 = this.locationType;
            float min = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i5 == 0 || i5 == 1) ? 30 : 10)), i3);
            this.mapTypeButton.setTranslationY(min);
            this.proximityButton.setTranslationY(min);
            HintView2 hintView2 = this.hintView;
            if (hintView2 != null) {
                hintView2.setTranslationY(min);
            }
            SearchButton searchButton = this.searchAreaButton;
            if (searchButton != null) {
                searchButton.setTranslation(min);
            }
            View view = this.markerImageView;
            if (view != null) {
                int dp = (i3 - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f)) + (i2 / 2);
                this.markerTop = dp;
                view.setTranslationY(dp);
            }
            if (z) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != this.overScrollHeight + AndroidUtilities.dp(10.0f)) {
                layoutParams2.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams2);
            }
            MapOverlayView mapOverlayView4 = this.overlayView;
            if (mapOverlayView4 == null || (layoutParams = (FrameLayout.LayoutParams) mapOverlayView4.getLayoutParams()) == null || layoutParams.height == this.overScrollHeight + AndroidUtilities.dp(10.0f)) {
                return;
            }
            layoutParams.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
            this.overlayView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixLayoutInternal(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (this.listView != null) {
            int currentActionBarHeight = (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i = this.locationType;
            if (i == 6) {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.dp(66.0f)) - currentActionBarHeight;
            } else if (i == 2) {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.dp(73.0f)) - currentActionBarHeight;
            } else {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.dp(66.0f)) - currentActionBarHeight;
            }
            SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
            if (sharedMediaLayout != null && sharedMediaLayout.getStoriesCount(8) > 0) {
                this.overScrollHeight -= AndroidUtilities.dp(200.0f);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.listView.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            this.listView.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.overScrollHeight;
            this.mapViewClip.setLayoutParams(layoutParams3);
            RecyclerListView recyclerListView = this.searchListView;
            if (recyclerListView != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) recyclerListView.getLayoutParams();
                layoutParams4.topMargin = currentActionBarHeight;
                this.searchListView.setLayoutParams(layoutParams4);
            }
            this.adapter.setOverScrollHeight(this.overScrollHeight);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams5);
            }
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) != null) {
                layoutParams.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
                this.overlayView.setLayoutParams(layoutParams);
            }
            this.adapter.notifyDataSetChanged();
            if (z) {
                int i2 = this.locationType;
                final int i3 = i2 == 3 ? 73 : (i2 == 1 || i2 == 2) ? 66 : 0;
                this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.dp(i3));
                updateClipView(false);
                this.listView.post(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationActivity.$r8$lambda$7BjLbOcv18xoahGEToRCj7hXlRM(LocationActivity.this, i3);
                    }
                });
                return;
            }
            updateClipView(false);
        }
    }

    public static /* synthetic */ void $r8$lambda$7BjLbOcv18xoahGEToRCj7hXlRM(LocationActivity locationActivity, int i) {
        locationActivity.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.dp(i));
        locationActivity.updateClipView(false);
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                return location;
            }
        }
        return location;
    }

    private void positionMarker(Location location) {
        int i;
        if (location == null) {
            return;
        }
        this.myLocation = new Location(location);
        LiveLocation liveLocation = (LiveLocation) this.markersMap.get(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
        if (liveLocation != null && sharingLocationInfo != null && liveLocation.object.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            liveLocation.marker.setPosition(latLng);
            IMapsProvider.IMarker iMarker = liveLocation.directionMarker;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.selectedMarkerId == liveLocation.id) {
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(liveLocation.marker.getPosition()));
            }
        }
        if (this.messageObject == null && this.chatLocation == null && this.map != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            LocationActivityAdapter locationActivityAdapter = this.adapter;
            if (locationActivityAdapter != null) {
                if (!this.searchedForCustomLocations && (i = this.locationType) != 4 && i != 8) {
                    locationActivityAdapter.searchPlacesWithQuery(null, this.myLocation, true);
                }
                this.adapter.setGpsLocation(this.myLocation);
            }
            if (!this.userLocationMoved) {
                this.userLocation = new Location(location);
                if (this.firstWas) {
                    this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.firstWas = true;
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.map.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.adapter.setGpsLocation(this.myLocation);
        }
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            proximitySheet.updateText(true, true);
        }
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        }
        updateShowAllButton();
    }

    public void setMessageObject(MessageObject messageObject) {
        this.messageObject = messageObject;
        this.dialogId = messageObject.getDialogId();
    }

    public void setChatLocation(long j, TLRPC.TL_channelLocation tL_channelLocation) {
        this.dialogId = -j;
        this.chatLocation = tL_channelLocation;
    }

    public void setDialogId(long j) {
        this.dialogId = j;
    }

    public void setInitialLocation(TLRPC.TL_channelLocation tL_channelLocation) {
        this.initialLocation = tL_channelLocation;
    }

    private static IMapsProvider.LatLng move(IMapsProvider.LatLng latLng, double d, double d2) {
        double meterToLongitude = meterToLongitude(d2, latLng.latitude);
        return new IMapsProvider.LatLng(latLng.latitude + meterToLatitude(d), latLng.longitude + meterToLongitude);
    }

    private static double meterToLongitude(double d, double d2) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(d2)) * 6366198.0d));
    }

    private static double meterToLatitude(double d) {
        return Math.toDegrees(d / 6366198.0d);
    }

    private void fetchRecentLocations(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.firstFocus ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                addUserMarker(message);
                if (this.proximityButton.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
                    this.proximityButton.setVisibility(0);
                    this.proximityAnimationInProgress = true;
                    this.proximityButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.LocationActivity.12
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            LocationActivity.this.proximityAnimationInProgress = false;
                            LocationActivity.this.maybeShowProximityHint();
                        }
                    }).start();
                }
            }
        }
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.firstFocus) {
                this.listView.smoothScrollBy(0, AndroidUtilities.dp(99.0f));
            }
            this.firstFocus = false;
            this.adapter.setLiveLocations(this.markers);
            if (this.messageObject.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng move = move(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(move(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(move);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.dp(113.0f));
                            this.moveToBounds = newCameraUpdateLatLngBounds;
                            this.map.moveCamera(newCameraUpdateLatLngBounds);
                            this.moveToBounds = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private void moveToBounds(int i, boolean z, boolean z2) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
        onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        try {
            if (z) {
                int max = Math.max(i, 250);
                IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                double d = max;
                IMapsProvider.LatLng move = move(center, d, d);
                double d2 = -max;
                onCreateLatLngBoundsBuilder.include(move(center, d2, d2));
                onCreateLatLngBoundsBuilder.include(move);
                IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                try {
                    this.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), (int) ((this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(40.0f)) + this.mapViewClip.getTranslationY()));
                    if (z2) {
                        this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, 0), 500, null);
                        return;
                    } else {
                        this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, 0));
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            int currentTime = getConnectionsManager().getCurrentTime();
            int size = this.markers.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.Message message = ((LiveLocation) this.markers.get(i2)).object;
                int i3 = message.date;
                TLRPC.MessageMedia messageMedia = message.media;
                if (i3 + messageMedia.period > currentTime) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
            }
            IMapsProvider.LatLng center2 = onCreateLatLngBoundsBuilder.build().getCenter();
            IMapsProvider.LatLng move2 = move(center2, 100.0d, 100.0d);
            onCreateLatLngBoundsBuilder.include(move(center2, -100.0d, -100.0d));
            onCreateLatLngBoundsBuilder.include(move2);
            IMapsProvider.ILatLngBounds build2 = onCreateLatLngBoundsBuilder.build();
            try {
                this.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(100.0f));
                this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build2, 0));
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        } catch (Exception unused) {
        }
    }

    private boolean getRecentLocations() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.get(this.messageObject.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            fetchRecentLocations(arrayList);
        }
        if (DialogObject.isChatDialog(this.dialogId)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        final long dialogId = this.messageObject.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new RequestDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda49
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LocationActivity.$r8$lambda$7kqjVBzLaay9cVDhuYCYEVAwg24(LocationActivity.this, dialogId, tLObject, tL_error);
            }
        });
        return arrayList != null;
    }

    public static /* synthetic */ void $r8$lambda$7kqjVBzLaay9cVDhuYCYEVAwg24(final LocationActivity locationActivity, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        locationActivity.getClass();
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda50
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$A_MYyoDILHgnK9TczEY5pmgLDEI(LocationActivity.this, tLObject, j);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$A_MYyoDILHgnK9TczEY5pmgLDEI(final LocationActivity locationActivity, TLObject tLObject, long j) {
        if (locationActivity.map == null) {
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i = 0;
        while (i < messages_messages.messages.size()) {
            if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                messages_messages.messages.remove(i);
                i--;
            }
            i++;
        }
        locationActivity.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        locationActivity.getMessagesController().putUsers(messages_messages.users, false);
        locationActivity.getMessagesController().putChats(messages_messages.chats, false);
        locationActivity.getLocationController().locationsCache.put(j, messages_messages.messages);
        locationActivity.getNotificationCenter().postNotificationName(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j));
        locationActivity.fetchRecentLocations(messages_messages.messages);
        locationActivity.getLocationController().markLiveLoactionsAsRead(locationActivity.dialogId);
        if (locationActivity.markAsReadRunnable == null) {
            Runnable runnable = new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    LocationActivity.$r8$lambda$wQTKJKmlfCwLsLGDJ2ctppoZ1VY(LocationActivity.this);
                }
            };
            locationActivity.markAsReadRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    public static /* synthetic */ void $r8$lambda$wQTKJKmlfCwLsLGDJ2ctppoZ1VY(LocationActivity locationActivity) {
        Runnable runnable;
        locationActivity.getLocationController().markLiveLoactionsAsRead(locationActivity.dialogId);
        if (locationActivity.isPaused || (runnable = locationActivity.markAsReadRunnable) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable, 5000L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        LocationActivityAdapter locationActivityAdapter;
        LiveLocation liveLocation;
        LocationActivityAdapter locationActivityAdapter2;
        if (i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i == NotificationCenter.locationPermissionGranted) {
            this.locationDenied = false;
            LocationActivityAdapter locationActivityAdapter3 = this.adapter;
            if (locationActivityAdapter3 != null) {
                locationActivityAdapter3.setMyLocationDenied(false, false);
            }
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.locationPermissionDenied) {
            this.locationDenied = true;
            LocationActivityAdapter locationActivityAdapter4 = this.adapter;
            if (locationActivityAdapter4 != null) {
                locationActivityAdapter4.setMyLocationDenied(true, false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.liveLocationsChanged) {
            LocationActivityAdapter locationActivityAdapter5 = this.adapter;
            if (locationActivityAdapter5 != null) {
                locationActivityAdapter5.notifyDataSetChanged();
            }
            updateShowAllButton();
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.dialogId || this.messageObject == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i3);
                if (messageObject.isLiveLocation()) {
                    addUserMarker(messageObject.messageOwner);
                    z = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.proximityButton.setImageResource(R.drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.proximityCircle;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.proximityCircle = null;
                    }
                }
            }
            if (!z || (locationActivityAdapter2 = this.adapter) == null) {
                return;
            }
            locationActivityAdapter2.setLiveLocations(this.markers);
            return;
        }
        if (i == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.dialogId || this.messageObject == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i4);
                if (messageObject2.isLiveLocation() && (liveLocation = (LiveLocation) this.markersMap.get(getMessageId(messageObject2.messageOwner))) != null) {
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                    if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        liveLocation.object = message;
                        TLRPC.GeoPoint geoPoint = message.media.geo;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        liveLocation.marker.setPosition(latLng);
                        if (this.selectedMarkerId == liveLocation.id) {
                            this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(liveLocation.marker.getPosition()));
                        }
                        IMapsProvider.IMarker iMarker = liveLocation.directionMarker;
                        if (iMarker != null) {
                            iMarker.getPosition();
                            liveLocation.directionMarker.setPosition(latLng);
                            int i5 = messageObject2.messageOwner.media.heading;
                            if (i5 != 0) {
                                liveLocation.directionMarker.setRotation(i5);
                                if (!liveLocation.hasRotation) {
                                    liveLocation.directionMarker.setIcon(R.drawable.map_pin_cone2);
                                    liveLocation.hasRotation = true;
                                }
                            } else if (liveLocation.hasRotation) {
                                liveLocation.directionMarker.setRotation(0);
                                liveLocation.directionMarker.setIcon(R.drawable.map_pin_circle);
                                liveLocation.hasRotation = false;
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (z2 && (locationActivityAdapter = this.adapter) != null) {
                locationActivityAdapter.notifyDataSetChanged();
                ProximitySheet proximitySheet = this.proximitySheet;
                if (proximitySheet != null) {
                    proximitySheet.updateText(true, true);
                }
            }
            if (z2) {
                updateShowAllButton();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null && this.mapsInitialized) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.onResumeCalled = false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean onBackPressed(boolean z) {
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            if (z) {
                proximitySheet.dismiss();
            }
            return false;
        }
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.hasScreenshot) {
            return super.onBackPressed(z);
        }
        if (z) {
            onCheckGlScreenshot();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean finishFragment(boolean z) {
        if (onCheckGlScreenshot()) {
            return false;
        }
        return super.finishFragment(z);
    }

    private boolean onCheckGlScreenshot() {
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.hasScreenshot) {
            return false;
        }
        final GLSurfaceView glSurfaceView = this.mapView.getGlSurfaceView();
        glSurfaceView.queueEvent(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$nQtL0Rul0WQlXcB70kYHhafHnSg(LocationActivity.this, glSurfaceView);
            }
        });
        return true;
    }

    public static /* synthetic */ void $r8$lambda$nQtL0Rul0WQlXcB70kYHhafHnSg(final LocationActivity locationActivity, final GLSurfaceView gLSurfaceView) {
        locationActivity.getClass();
        if (gLSurfaceView.getWidth() == 0 || gLSurfaceView.getHeight() == 0) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getWidth() * gLSurfaceView.getHeight() * 4);
        GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        final Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
        createBitmap.recycle();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$l42SWxMIHiY0ZLfjXtEbbBC77lk(LocationActivity.this, createBitmap2, gLSurfaceView);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$l42SWxMIHiY0ZLfjXtEbbBC77lk(final LocationActivity locationActivity, Bitmap bitmap, final GLSurfaceView gLSurfaceView) {
        locationActivity.getClass();
        ImageView imageView = new ImageView(locationActivity.getContext());
        imageView.setImageBitmap(bitmap);
        final ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
        try {
            viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                LocationActivity.$r8$lambda$KZtwhj5MYY33_lrf_jECnOHikLA(LocationActivity.this, viewGroup, gLSurfaceView);
            }
        }, 100L);
    }

    public static /* synthetic */ void $r8$lambda$KZtwhj5MYY33_lrf_jECnOHikLA(LocationActivity locationActivity, ViewGroup viewGroup, GLSurfaceView gLSurfaceView) {
        locationActivity.getClass();
        try {
            viewGroup.removeView(gLSurfaceView);
        } catch (Exception e) {
            FileLog.e(e);
        }
        locationActivity.hasScreenshot = true;
        locationActivity.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onResume() {
        Activity parentActivity;
        int checkSelfPermission;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null && this.mapsInitialized) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.onResumeCalled = true;
        IMapsProvider.IMap iMap = this.map;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        fixLayoutInternal(true);
        if (disablePermissionCheck()) {
            this.checkPermission = false;
        } else if (this.checkPermission && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.checkPermission = false;
            checkSelfPermission = parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
            if (checkSelfPermission != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        Runnable runnable = this.markAsReadRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(this.markAsReadRunnable, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 30) {
            openShareLiveLocation(false, this.askWithRadius);
        }
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || !this.mapsInitialized) {
            return;
        }
        iMapView.onLowMemory();
    }

    public void setDelegate(LocationActivityDelegate locationActivityDelegate) {
        this.delegate = locationActivityDelegate;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() { // from class: org.telegram.ui.LocationActivity$$ExternalSyntheticLambda21
            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public final void didSetColor() {
                LocationActivity.$r8$lambda$7Bw4GtT8VWeYGKJ8BbJeQrbI-0I(LocationActivity.this);
            }

            @Override // org.telegram.ui.ActionBar.ThemeDescription.ThemeDescriptionDelegate
            public /* synthetic */ void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.-CC.$default$onAnimationProgress(this, f);
            }
        };
        for (int i = 0; i < this.undoView.length; i++) {
            UndoView undoView = this.undoView[i];
            int i2 = ThemeDescription.FLAG_BACKGROUNDFILTER;
            int i3 = Theme.key_undo_background;
            arrayList.add(new ThemeDescription(undoView, i2, null, null, null, null, i3));
            int i4 = Theme.key_undo_cancelColor;
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
            int i5 = Theme.key_undo_infoColor;
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i3));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i3));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i5));
        }
        View view = this.fragmentView;
        int i6 = ThemeDescription.FLAG_BACKGROUND;
        int i7 = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(view, i6, null, null, null, themeDescriptionDelegate, i7));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i7));
        ActionBar actionBar = this.actionBar;
        int i8 = ThemeDescription.FLAG_AB_ITEMSCOLOR;
        int i9 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(actionBar, i8, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_chat_messagePanelHint));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ImageView imageView = this.emptyImageView;
        int i10 = ThemeDescription.FLAG_IMAGECOLOR;
        int i11 = Theme.key_dialogEmptyImage;
        arrayList.add(new ThemeDescription(imageView, i10, null, null, null, null, i11));
        TextView textView = this.emptyTitleTextView;
        int i12 = ThemeDescription.FLAG_TEXTCOLOR;
        int i13 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, i12, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.shadow, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        ImageView imageView2 = this.locationButton;
        int i14 = ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i15 = Theme.key_location_actionIcon;
        arrayList.add(new ThemeDescription(imageView2, i14, null, null, null, null, i15));
        ImageView imageView3 = this.locationButton;
        int i16 = ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i17 = Theme.key_location_actionActiveIcon;
        arrayList.add(new ThemeDescription(imageView3, i16, null, null, null, null, i17));
        ImageView imageView4 = this.locationButton;
        int i18 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i19 = Theme.key_location_actionBackground;
        arrayList.add(new ThemeDescription(imageView4, i18, null, null, null, null, i19));
        ImageView imageView5 = this.locationButton;
        int i20 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i21 = Theme.key_location_actionPressedBackground;
        arrayList.add(new ThemeDescription(imageView5, i20, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 0, null, null, null, themeDescriptionDelegate, i15));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(this.proximityButton, 0, null, null, null, themeDescriptionDelegate, i15));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i17));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_liveLocationProgress));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_placeLocationBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialog_liveLocationProgress));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationBackground));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationBackground));
        int i22 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SendLocationCell.class}, new String[]{"accurateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationDirectionCell.class}, new String[]{"buttonTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        int i23 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.searchListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"distanceTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{LocationPoweredCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        return arrayList;
    }

    public static /* synthetic */ void $r8$lambda$7Bw4GtT8VWeYGKJ8BbJeQrbI-0I(LocationActivity locationActivity) {
        locationActivity.mapTypeButton.setIconColor(locationActivity.getThemedColor(Theme.key_location_actionIcon));
        locationActivity.mapTypeButton.redrawPopup(locationActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        locationActivity.mapTypeButton.setPopupItemsColor(locationActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        locationActivity.mapTypeButton.setPopupItemsColor(locationActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        locationActivity.shadowDrawable.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        locationActivity.shadow.invalidate();
        if (locationActivity.map != null) {
            int mapThemeResId = locationActivity.getMapThemeResId();
            if (mapThemeResId != 0) {
                if (locationActivity.currentMapStyleDark) {
                    return;
                }
                locationActivity.currentMapStyleDark = true;
                locationActivity.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, mapThemeResId));
                IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                if (iCircle != null) {
                    iCircle.setStrokeColor(-1);
                    locationActivity.proximityCircle.setFillColor(553648127);
                    return;
                }
                return;
            }
            if (locationActivity.currentMapStyleDark) {
                locationActivity.currentMapStyleDark = false;
                locationActivity.map.setMapStyle(null);
                IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                if (iCircle2 != null) {
                    iCircle2.setStrokeColor(-16777216);
                    locationActivity.proximityCircle.setFillColor(TLObject.FLAG_29);
                }
            }
        }
    }

    public String getAddressName() {
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            return locationActivityAdapter.getAddressName();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.BaseFragment
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.699999988079071d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        private boolean first;
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void onStopNestedScroll(View view) {
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z) {
                LocationActivity.this.fixLayoutInternal(this.first);
                this.first = false;
            } else {
                LocationActivity.this.updateClipView(true);
            }
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == ((BaseFragment) LocationActivity.this).actionBar && ((BaseFragment) LocationActivity.this).parentLayout != null) {
                ((BaseFragment) LocationActivity.this).parentLayout.drawHeaderShadow(canvas, ((BaseFragment) LocationActivity.this).actionBar.getMeasuredHeight());
            }
            return drawChild;
        }

        public NestedFrameLayout(Context context) {
            super(context);
            this.first = true;
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override // androidx.core.view.NestedScrollingParent3
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == LocationActivity.this.listView && LocationActivity.this.sharedMediaLayout != null && LocationActivity.this.sharedMediaLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                    int top = LocationActivity.this.sharedMediaLayout.getTop();
                    if (currentListView == null || top != 0) {
                        return;
                    }
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.LocationActivity$NestedFrameLayout$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationActivity.NestedFrameLayout.$r8$lambda$wWAqDK5JPF1P8mj4zaS1H82Apok(LocationActivity.NestedFrameLayout.this);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$wWAqDK5JPF1P8mj4zaS1H82Apok(NestedFrameLayout nestedFrameLayout) {
            nestedFrameLayout.getClass();
            try {
                RecyclerListView currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            RecyclerListView currentListView;
            if (view == LocationActivity.this.listView && LocationActivity.this.sharedMediaLayout != null && LocationActivity.this.sharedMediaLayout.isAttachedToWindow()) {
                boolean isSearchFieldVisible = ((BaseFragment) LocationActivity.this).actionBar.isSearchFieldVisible();
                int top = LocationActivity.this.sharedMediaLayout.getTop();
                boolean z = false;
                if (i2 >= 0) {
                    if (isSearchFieldVisible) {
                        RecyclerListView currentListView2 = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                            return;
                        }
                        currentListView2.scrollBy(0, i4);
                        return;
                    }
                    return;
                }
                if (top <= 0 && (currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView()) != null) {
                    int findFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                    if (findFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                        int top2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView.getPaddingTop();
                        if (top2 != paddingTop || findFirstVisibleItemPosition != 0) {
                            iArr[1] = findFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView.scrollBy(0, i2);
                            z = true;
                        }
                    }
                }
                if (isSearchFieldVisible) {
                    if (!z && top < 0) {
                        iArr[1] = i2 - Math.max(top, i2);
                    } else {
                        iArr[1] = i2;
                    }
                }
            }
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return LocationActivity.this.sharedMediaLayout != null && i == 2;
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override // androidx.core.view.NestedScrollingParent2
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }

        @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
        protected void drawList(Canvas canvas, boolean z, ArrayList arrayList) {
            super.drawList(canvas, z, arrayList);
            if (LocationActivity.this.sharedMediaLayout != null) {
                canvas.save();
                canvas.translate(0.0f, LocationActivity.this.listView.getY());
                LocationActivity.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
                canvas.restore();
            }
        }
    }
}
