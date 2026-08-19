package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* loaded from: classes5.dex */
public class GroupedPhotosListView extends View implements GestureDetector.OnGestureListener {
    private boolean animateAllLine;
    private boolean animateBackground;
    private int animateToDX;
    private int animateToDXStart;
    private int animateToItem;
    private boolean animateToItemFast;
    private boolean animationsEnabled;
    private Paint backgroundPaint;
    private long currentGroupId;
    private int currentImage;
    private float currentItemProgress;
    private ArrayList currentObjects;
    public ArrayList currentPhotos;
    private GroupedPhotosListViewDelegate delegate;
    private float drawAlpha;
    private int drawDx;
    private GestureDetector gestureDetector;
    private boolean hasPhotos;
    private ValueAnimator hideAnimator;
    private boolean ignoreChanges;
    private ArrayList imagesToDraw;
    private int itemHeight;
    private int itemSpacing;
    private int itemWidth;
    private int itemY;
    private long lastUpdateTime;
    private float moveLineProgress;
    private boolean moving;
    private int nextImage;
    private float nextItemProgress;
    private int nextPhotoScrolling;
    private android.widget.Scroller scroll;
    private boolean scrolling;
    private ValueAnimator showAnimator;
    private boolean stopedScrolling;
    private ArrayList unusedReceivers;

    public interface GroupedPhotosListViewDelegate {
        boolean forceAll();

        long getAvatarsDialogId();

        int getCurrentAccount();

        int getCurrentIndex();

        ArrayList getImagesArr();

        ArrayList getImagesArrLocations();

        List getPageBlockArr();

        Object getParentObject();

        int getSlideshowMessageId();

        void onShowAnimationStart();

        void onStopScrolling();

        void setCurrentIndex(int i);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    public GroupedPhotosListView(Context context, int i) {
        super(context);
        this.backgroundPaint = new Paint();
        this.unusedReceivers = new ArrayList();
        this.imagesToDraw = new ArrayList();
        this.currentPhotos = new ArrayList();
        this.currentObjects = new ArrayList();
        this.currentItemProgress = 1.0f;
        this.nextItemProgress = 0.0f;
        this.animateToItem = -1;
        this.animationsEnabled = true;
        this.nextPhotoScrolling = -1;
        this.animateBackground = true;
        this.gestureDetector = new GestureDetector(context, this);
        this.scroll = new android.widget.Scroller(context);
        this.itemWidth = AndroidUtilities.dp(42.0f);
        this.itemHeight = AndroidUtilities.dp(56.0f);
        this.itemSpacing = AndroidUtilities.dp(1.0f);
        this.itemY = i;
        this.backgroundPaint.setColor(2130706432);
    }

    public void clear() {
        this.currentPhotos.clear();
        this.currentObjects.clear();
        this.imagesToDraw.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018f  */
    /* JADX WARN: Type inference failed for: r13v10, types: [org.telegram.messenger.MessageObject] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [int] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fillList() {
        ArrayList arrayList;
        ?? r15;
        long j;
        boolean z;
        Object obj;
        int i;
        int i2;
        Object obj2;
        boolean z2;
        Object obj3;
        boolean z3;
        boolean z4;
        Object obj4;
        if (this.ignoreChanges) {
            this.ignoreChanges = false;
            return;
        }
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList imagesArr = this.delegate.getImagesArr();
        List pageBlockArr = this.delegate.getPageBlockArr();
        int slideshowMessageId = this.delegate.getSlideshowMessageId();
        this.delegate.getCurrentAccount();
        this.hasPhotos = false;
        if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
            if (currentIndex >= imagesArrLocations.size()) {
                currentIndex = imagesArrLocations.size() - 1;
            }
            Object obj5 = (ImageLocation) imagesArrLocations.get(currentIndex);
            i = imagesArrLocations.size();
            this.hasPhotos = true;
            arrayList = imagesArrLocations;
            z = false;
            z4 = false;
            j = 0;
            obj4 = obj5;
        } else {
            if (imagesArr != null && !imagesArr.isEmpty()) {
                if (currentIndex >= imagesArr.size()) {
                    currentIndex = imagesArr.size() - 1;
                }
                ?? r13 = (MessageObject) imagesArr.get(currentIndex);
                long groupIdForUse = r13.getGroupIdForUse();
                j = 0;
                if (groupIdForUse != this.currentGroupId) {
                    this.currentGroupId = groupIdForUse;
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = imagesArr.size() > 1 && this.delegate.forceAll();
                if (this.currentGroupId != 0 || z5) {
                    this.hasPhotos = true;
                    int min = Math.min(currentIndex + 10, imagesArr.size());
                    int i3 = 0;
                    for (int i4 = currentIndex; i4 < min; i4++) {
                        MessageObject messageObject = (MessageObject) imagesArr.get(i4);
                        if (slideshowMessageId == 0 && !z5) {
                            if (messageObject.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                        }
                        i3++;
                    }
                    int max = Math.max(currentIndex - 10, 0);
                    int i5 = currentIndex - 1;
                    i = i3;
                    while (true) {
                        if (i5 < max) {
                            arrayList = imagesArrLocations;
                            z3 = false;
                            break;
                        }
                        MessageObject messageObject2 = (MessageObject) imagesArr.get(i5);
                        if (slideshowMessageId == 0 && !z5) {
                            long groupIdForUse2 = messageObject2.getGroupIdForUse();
                            arrayList = imagesArrLocations;
                            z3 = false;
                            if (groupIdForUse2 != this.currentGroupId) {
                                break;
                            }
                        } else {
                            arrayList = imagesArrLocations;
                        }
                        i++;
                        i5--;
                        imagesArrLocations = arrayList;
                    }
                    obj3 = r13;
                    r15 = z3;
                } else {
                    arrayList = imagesArrLocations;
                    i = 0;
                    z4 = false;
                    obj4 = r13;
                }
            } else {
                arrayList = imagesArrLocations;
                r15 = 0;
                r15 = 0;
                j = 0;
                if (pageBlockArr == null || pageBlockArr.isEmpty()) {
                    currentIndex = currentIndex;
                    z = false;
                    obj = null;
                } else {
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) pageBlockArr.get(currentIndex);
                    long j2 = pageBlock.groupId;
                    if (j2 != this.currentGroupId) {
                        this.currentGroupId = j2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.currentGroupId != 0) {
                        this.hasPhotos = true;
                        int size = pageBlockArr.size();
                        int i6 = currentIndex;
                        int i7 = 0;
                        Object obj6 = pageBlock;
                        while (true) {
                            if (i6 >= size) {
                                i2 = currentIndex;
                                obj2 = obj6;
                                break;
                            }
                            i2 = currentIndex;
                            obj2 = obj6;
                            if (((TL_iv.PageBlock) pageBlockArr.get(i6)).groupId != this.currentGroupId) {
                                break;
                            }
                            i7++;
                            i6++;
                            obj6 = obj2;
                            currentIndex = i2;
                        }
                        int i8 = i2 - 1;
                        while (true) {
                            if (i8 < 0) {
                                z2 = z;
                                break;
                            }
                            z2 = z;
                            if (((TL_iv.PageBlock) pageBlockArr.get(i8)).groupId != this.currentGroupId) {
                                break;
                            }
                            i7++;
                            i8--;
                            z = z2;
                        }
                        z = z2;
                        obj3 = obj2;
                        currentIndex = i2;
                        i = i7;
                    } else {
                        obj = pageBlock;
                    }
                }
                i = 0;
                obj3 = obj;
            }
            if (obj3 != null) {
                return;
            }
            if (this.animationsEnabled) {
                if (!this.hasPhotos) {
                    ValueAnimator valueAnimator = this.showAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.showAnimator = null;
                    }
                    if (this.drawAlpha > 0.0f && this.currentPhotos.size() > 1) {
                        if (this.hideAnimator == null) {
                            float[] fArr = new float[2];
                            fArr[r15] = this.drawAlpha;
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            this.hideAnimator = ofFloat;
                            ofFloat.setDuration((long) (this.drawAlpha * 200.0f));
                            this.hideAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.GroupedPhotosListView.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator) {
                                    if (GroupedPhotosListView.this.hideAnimator == animator) {
                                        GroupedPhotosListView.this.hideAnimator = null;
                                        GroupedPhotosListView.this.fillList();
                                    }
                                }
                            });
                            this.hideAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.GroupedPhotosListView$$ExternalSyntheticLambda0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    GroupedPhotosListView.$r8$lambda$KepaK_8oXCcSf_cbb0QgwVgL6ns(GroupedPhotosListView.this, valueAnimator2);
                                }
                            });
                            this.hideAnimator.start();
                            return;
                        }
                        return;
                    }
                } else {
                    ValueAnimator valueAnimator2 = this.hideAnimator;
                    if (valueAnimator2 != null) {
                        this.hideAnimator = null;
                        valueAnimator2.cancel();
                    }
                    float f = this.drawAlpha;
                    if (f < 1.0f && this.showAnimator == null) {
                        float[] fArr2 = new float[2];
                        fArr2[r15] = f;
                        fArr2[1] = 1.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
                        this.showAnimator = ofFloat2;
                        ofFloat2.setDuration((long) ((1.0f - this.drawAlpha) * 200.0f));
                        this.showAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.GroupedPhotosListView.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animator) {
                                if (GroupedPhotosListView.this.delegate != null) {
                                    GroupedPhotosListView.this.delegate.onShowAnimationStart();
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (GroupedPhotosListView.this.showAnimator == animator) {
                                    GroupedPhotosListView.this.showAnimator = null;
                                }
                            }
                        });
                        this.showAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.GroupedPhotosListView$$ExternalSyntheticLambda1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                GroupedPhotosListView.$r8$lambda$OIrEb7L_MZwr_NKa3XEvCI9sUdo(GroupedPhotosListView.this, valueAnimator3);
                            }
                        });
                    }
                }
            }
            if (!z) {
                if (i == this.currentPhotos.size() && this.currentObjects.contains(obj3)) {
                    int indexOf = this.currentObjects.indexOf(obj3);
                    int i9 = this.currentImage;
                    if (i9 != indexOf && indexOf != -1) {
                        boolean z6 = this.animateAllLine;
                        if (!z6 && !this.moving && (indexOf == i9 - 1 || indexOf == i9 + 1)) {
                            this.animateToItemFast = true;
                            z6 = true;
                        }
                        if (z6) {
                            this.animateToItem = indexOf;
                            this.nextImage = indexOf;
                            this.animateToDX = (i9 - indexOf) * (this.itemWidth + this.itemSpacing);
                            this.moving = true;
                            this.animateAllLine = r15;
                            this.lastUpdateTime = System.currentTimeMillis();
                            invalidate();
                            r15 = 0;
                        } else {
                            fillImages(true, (i9 - indexOf) * (this.itemWidth + this.itemSpacing));
                            this.currentImage = indexOf;
                            r15 = 0;
                            this.moving = false;
                        }
                        this.drawDx = r15;
                    }
                } else {
                    z = true;
                }
            }
            if (z) {
                int size2 = this.currentPhotos.size();
                this.animateAllLine = r15;
                this.currentPhotos.clear();
                this.currentObjects.clear();
                if (arrayList != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = arrayList;
                    this.currentObjects.addAll(arrayList2);
                    this.currentPhotos.addAll(arrayList2);
                    this.currentImage = currentIndex;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                } else if (imagesArr != null && !imagesArr.isEmpty()) {
                    boolean z7 = this.delegate.forceAll() && imagesArr.size() > 1;
                    if (this.currentGroupId != j || z7 || slideshowMessageId != 0) {
                        int min2 = Math.min(currentIndex + 10, imagesArr.size());
                        for (int i10 = currentIndex; i10 < min2; i10++) {
                            MessageObject messageObject3 = (MessageObject) imagesArr.get(i10);
                            if (slideshowMessageId == 0 && !z7 && messageObject3.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            this.currentObjects.add(messageObject3);
                            this.currentPhotos.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 56, true), messageObject3.photoThumbsObject));
                        }
                        this.currentImage = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                        int max2 = Math.max(currentIndex - 10, 0);
                        for (int i11 = currentIndex - 1; i11 >= max2; i11--) {
                            MessageObject messageObject4 = (MessageObject) imagesArr.get(i11);
                            if (slideshowMessageId == 0 && !z7 && messageObject4.getGroupIdForUse() != this.currentGroupId) {
                                break;
                            }
                            this.currentObjects.add(0, messageObject4);
                            this.currentPhotos.add(0, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                            this.currentImage++;
                        }
                    }
                } else if (pageBlockArr != null && !pageBlockArr.isEmpty() && this.currentGroupId != j) {
                    int size3 = pageBlockArr.size();
                    for (int i12 = currentIndex; i12 < size3; i12++) {
                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) pageBlockArr.get(i12);
                        if (pageBlock2.groupId != this.currentGroupId) {
                            break;
                        }
                        this.currentObjects.add(pageBlock2);
                        this.currentPhotos.add(ImageLocation.getForObject(pageBlock2.thumb, pageBlock2.thumbObject));
                    }
                    this.currentImage = 0;
                    this.animateToItem = -1;
                    this.animateToItemFast = false;
                    for (int i13 = currentIndex - 1; i13 >= 0; i13--) {
                        TL_iv.PageBlock pageBlock3 = (TL_iv.PageBlock) pageBlockArr.get(i13);
                        if (pageBlock3.groupId != this.currentGroupId) {
                            break;
                        }
                        this.currentObjects.add(0, pageBlock3);
                        this.currentPhotos.add(0, ImageLocation.getForObject(pageBlock3.thumb, pageBlock3.thumbObject));
                        this.currentImage++;
                    }
                }
                if (this.currentPhotos.size() == 1) {
                    this.currentPhotos.clear();
                    this.currentObjects.clear();
                }
                if (this.currentPhotos.size() != size2) {
                    requestLayout();
                }
                fillImages(false, 0);
                return;
            }
            return;
        }
        obj3 = obj4;
        r15 = z4;
        if (obj3 != null) {
        }
    }

    public static /* synthetic */ void $r8$lambda$KepaK_8oXCcSf_cbb0QgwVgL6ns(GroupedPhotosListView groupedPhotosListView, ValueAnimator valueAnimator) {
        groupedPhotosListView.getClass();
        groupedPhotosListView.drawAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupedPhotosListView.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$OIrEb7L_MZwr_NKa3XEvCI9sUdo(GroupedPhotosListView groupedPhotosListView, ValueAnimator valueAnimator) {
        groupedPhotosListView.getClass();
        groupedPhotosListView.drawAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        groupedPhotosListView.invalidate();
    }

    public int getCount() {
        return this.currentPhotos.size();
    }

    public int getIndex() {
        return this.currentImage;
    }

    public void setMoveProgress(float f) {
        if (this.scrolling || this.animateToItem >= 0) {
            return;
        }
        if (f > 0.0f) {
            this.nextImage = this.currentImage - 1;
        } else {
            this.nextImage = this.currentImage + 1;
        }
        int i = this.nextImage;
        if (i >= 0 && i < this.currentPhotos.size()) {
            this.currentItemProgress = 1.0f - Math.abs(f);
        } else {
            this.currentItemProgress = 1.0f;
        }
        this.nextItemProgress = 1.0f - this.currentItemProgress;
        this.moving = f != 0.0f;
        invalidate();
        if (this.currentPhotos.isEmpty()) {
            return;
        }
        if (f >= 0.0f || this.currentImage != this.currentPhotos.size() - 1) {
            if (f <= 0.0f || this.currentImage != 0) {
                int i2 = (int) (f * (this.itemWidth + this.itemSpacing));
                this.drawDx = i2;
                fillImages(true, i2);
            }
        }
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        if (this.unusedReceivers.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            imageReceiver = (ImageReceiver) this.unusedReceivers.get(0);
            this.unusedReceivers.remove(0);
        }
        this.imagesToDraw.add(imageReceiver);
        imageReceiver.setCurrentAccount(this.delegate.getCurrentAccount());
        return imageReceiver;
    }

    private void fillImages(boolean z, int i) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        if (!z && !this.imagesToDraw.isEmpty()) {
            this.unusedReceivers.addAll(this.imagesToDraw);
            this.imagesToDraw.clear();
            this.moving = false;
            this.moveLineProgress = 1.0f;
            this.currentItemProgress = 1.0f;
            this.nextItemProgress = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() == 0 || this.currentPhotos.isEmpty()) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (this.itemWidth / 2);
        if (z) {
            int size = this.imagesToDraw.size();
            int i4 = 0;
            i2 = TLObject.FLAG_31;
            i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (i4 < size) {
                ImageReceiver imageReceiver = (ImageReceiver) this.imagesToDraw.get(i4);
                int param = imageReceiver.getParam();
                int i5 = param - this.currentImage;
                int i6 = this.itemWidth;
                int i7 = (i5 * (this.itemSpacing + i6)) + measuredWidth2 + i;
                if (i7 > measuredWidth || i7 + i6 < 0) {
                    this.unusedReceivers.add(imageReceiver);
                    this.imagesToDraw.remove(i4);
                    size--;
                    i4--;
                }
                i3 = Math.min(i3, param - 1);
                i2 = Math.max(i2, param + 1);
                i4++;
            }
        } else {
            i2 = this.currentImage;
            i3 = i2 - 1;
        }
        if (i2 != Integer.MIN_VALUE) {
            int size2 = this.currentPhotos.size();
            while (i2 < size2) {
                int i8 = ((i2 - this.currentImage) * (this.itemWidth + this.itemSpacing)) + measuredWidth2 + i;
                if (i8 >= measuredWidth) {
                    break;
                }
                ImageLocation imageLocation = (ImageLocation) this.currentPhotos.get(i2);
                ImageReceiver freeReceiver = getFreeReceiver();
                freeReceiver.setImageCoords(i8, this.itemY, this.itemWidth, this.itemHeight);
                if (this.currentObjects.get(0) instanceof MessageObject) {
                    obj2 = this.currentObjects.get(i2);
                } else if (this.currentObjects.get(0) instanceof TL_iv.PageBlock) {
                    obj2 = this.delegate.getParentObject();
                } else {
                    obj2 = "avatar_" + this.delegate.getAvatarsDialogId();
                }
                freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj2, 1);
                freeReceiver.setParam(i2);
                i2++;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            while (i3 >= 0) {
                int i9 = i3 - this.currentImage;
                int i10 = this.itemWidth;
                int i11 = (i9 * (this.itemSpacing + i10)) + measuredWidth2 + i + i10;
                if (i11 <= 0) {
                    break;
                }
                ImageLocation imageLocation2 = (ImageLocation) this.currentPhotos.get(i3);
                ImageReceiver freeReceiver2 = getFreeReceiver();
                freeReceiver2.setImageCoords(i11, this.itemY, this.itemWidth, this.itemHeight);
                if (this.currentObjects.get(0) instanceof MessageObject) {
                    obj = this.currentObjects.get(i3);
                } else if (this.currentObjects.get(0) instanceof TL_iv.PageBlock) {
                    obj = this.delegate.getParentObject();
                } else {
                    obj = "avatar_" + this.delegate.getAvatarsDialogId();
                }
                freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, obj, 1);
                freeReceiver2.setParam(i3);
                i3--;
            }
        }
        ValueAnimator valueAnimator = this.showAnimator;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        this.showAnimator.start();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (!this.scroll.isFinished()) {
            this.scroll.abortAnimation();
        }
        this.animateToItem = -1;
        this.animateToItemFast = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList imagesArr = this.delegate.getImagesArr();
        List pageBlockArr = this.delegate.getPageBlockArr();
        stopScrolling();
        int size = this.imagesToDraw.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) this.imagesToDraw.get(i);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param < 0 || param >= this.currentObjects.size()) {
                    return true;
                }
                if (imagesArr != null && !imagesArr.isEmpty()) {
                    int indexOf = imagesArr.indexOf((MessageObject) this.currentObjects.get(param));
                    if (currentIndex == indexOf) {
                        return true;
                    }
                    this.moveLineProgress = 1.0f;
                    this.animateAllLine = true;
                    this.delegate.setCurrentIndex(indexOf);
                } else if (pageBlockArr != null && !pageBlockArr.isEmpty()) {
                    int indexOf2 = pageBlockArr.indexOf((TL_iv.PageBlock) this.currentObjects.get(param));
                    if (currentIndex == indexOf2) {
                        return true;
                    }
                    this.moveLineProgress = 1.0f;
                    this.animateAllLine = true;
                    this.delegate.setCurrentIndex(indexOf2);
                } else if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
                    int indexOf3 = imagesArrLocations.indexOf((ImageLocation) this.currentObjects.get(param));
                    if (currentIndex == indexOf3) {
                        return true;
                    }
                    this.moveLineProgress = 1.0f;
                    this.animateAllLine = true;
                    this.delegate.setCurrentIndex(indexOf3);
                }
            } else {
                i++;
            }
        }
        return false;
    }

    private void updateAfterScroll() {
        int i;
        int i2;
        int i3;
        int i4 = this.drawDx;
        int abs = Math.abs(i4);
        int i5 = this.itemWidth;
        int i6 = this.itemSpacing;
        int i7 = (i5 / 2) + i6;
        int i8 = -1;
        if (abs > i7) {
            if (i4 > 0) {
                i2 = i4 - i7;
                i3 = 1;
            } else {
                i2 = i4 + i7;
                i3 = -1;
            }
            i = i3 + (i2 / (i5 + (i6 * 2)));
        } else {
            i = 0;
        }
        this.nextPhotoScrolling = this.currentImage - i;
        int currentIndex = this.delegate.getCurrentIndex();
        ArrayList imagesArrLocations = this.delegate.getImagesArrLocations();
        ArrayList imagesArr = this.delegate.getImagesArr();
        List pageBlockArr = this.delegate.getPageBlockArr();
        int i9 = this.nextPhotoScrolling;
        if (currentIndex != i9 && i9 >= 0 && i9 < this.currentPhotos.size()) {
            Object obj = this.currentObjects.get(this.nextPhotoScrolling);
            if (imagesArr != null && !imagesArr.isEmpty()) {
                i8 = imagesArr.indexOf((MessageObject) obj);
            } else if (pageBlockArr != null && !pageBlockArr.isEmpty()) {
                i8 = pageBlockArr.indexOf((TL_iv.PageBlock) obj);
            } else if (imagesArrLocations != null && !imagesArrLocations.isEmpty()) {
                i8 = imagesArrLocations.indexOf((ImageLocation) obj);
            }
            if (i8 >= 0) {
                this.ignoreChanges = true;
                this.delegate.setCurrentIndex(i8);
            }
        }
        if (!this.scrolling) {
            this.scrolling = true;
            this.stopedScrolling = false;
        }
        fillImages(true, this.drawDx);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.drawDx = (int) (this.drawDx - f);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i = this.drawDx;
        if (i < minScrollX) {
            this.drawDx = minScrollX;
        } else if (i > maxScrollX) {
            this.drawDx = maxScrollX;
        }
        updateAfterScroll();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.scroll.abortAnimation();
        if (this.currentPhotos.size() < 10) {
            return false;
        }
        this.scroll.fling(this.drawDx, 0, Math.round(f), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    private void stopScrolling() {
        this.scrolling = false;
        if (!this.scroll.isFinished()) {
            this.scroll.abortAnimation();
        }
        int i = this.nextPhotoScrolling;
        if (i >= 0 && i < this.currentObjects.size()) {
            this.stopedScrolling = true;
            this.animateToItemFast = false;
            int i2 = this.nextPhotoScrolling;
            this.animateToItem = i2;
            this.nextImage = i2;
            this.animateToDX = (this.currentImage - i2) * (this.itemWidth + this.itemSpacing);
            this.animateToDXStart = this.drawDx;
            this.moveLineProgress = 1.0f;
            this.nextPhotoScrolling = -1;
            GroupedPhotosListViewDelegate groupedPhotosListViewDelegate = this.delegate;
            if (groupedPhotosListViewDelegate != null) {
                groupedPhotosListViewDelegate.onStopScrolling();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.currentPhotos.isEmpty() && getAlpha() == 1.0f) {
            r1 = this.gestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.scrolling && motionEvent.getAction() == 1 && this.scroll.isFinished()) {
                stopScrolling();
            }
        }
        return r1;
    }

    private int getMinScrollX() {
        return (-((this.currentPhotos.size() - this.currentImage) - 1)) * (this.itemWidth + (this.itemSpacing * 2));
    }

    private int getMaxScrollX() {
        return this.currentImage * (this.itemWidth + (this.itemSpacing * 2));
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fillImages(false, 0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        if (this.hasPhotos || !this.imagesToDraw.isEmpty()) {
            float f = this.drawAlpha;
            if (!this.animateBackground) {
                f = this.hasPhotos ? 1.0f : 0.0f;
            }
            this.backgroundPaint.setAlpha((int) (f * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
            if (this.imagesToDraw.isEmpty()) {
                return;
            }
            int size = this.imagesToDraw.size();
            int i3 = this.drawDx;
            int i4 = (int) (this.itemWidth * 2.0f);
            int dp = AndroidUtilities.dp(8.0f);
            ImageLocation imageLocation = (ImageLocation) this.currentPhotos.get(this.currentImage);
            if (imageLocation != null && (photoSize2 = imageLocation.photoSize) != null) {
                i = Math.max(this.itemWidth, (int) (photoSize2.w * (this.itemHeight / photoSize2.h)));
            } else {
                i = this.itemHeight;
            }
            int min = Math.min(i4, i);
            float f2 = dp * 2;
            float f3 = this.currentItemProgress;
            int i5 = (int) (f2 * f3);
            int i6 = this.itemWidth + ((int) ((min - r11) * f3)) + i5;
            int i7 = this.nextImage;
            if (i7 >= 0 && i7 < this.currentPhotos.size()) {
                ImageLocation imageLocation2 = (ImageLocation) this.currentPhotos.get(this.nextImage);
                if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                    i2 = Math.max(this.itemWidth, (int) (photoSize.w * (this.itemHeight / photoSize.h)));
                } else {
                    i2 = this.itemHeight;
                }
            } else {
                i2 = this.itemWidth;
            }
            int min2 = Math.min(i4, i2);
            float f4 = this.nextItemProgress;
            int i8 = (int) (f2 * f4);
            float f5 = i3;
            int i9 = (int) (f5 + ((((min2 + i8) - r12) / 2) * f4 * (this.nextImage > this.currentImage ? -1 : 1)));
            int i10 = this.itemWidth + ((int) ((min2 - r12) * f4)) + i8;
            int measuredWidth = (getMeasuredWidth() - i6) / 2;
            for (int i11 = 0; i11 < size; i11++) {
                ImageReceiver imageReceiver = (ImageReceiver) this.imagesToDraw.get(i11);
                int param = imageReceiver.getParam();
                int i12 = this.currentImage;
                if (param == i12) {
                    imageReceiver.setImageX(measuredWidth + i9 + (i5 / 2));
                    imageReceiver.setImageWidth(i6 - i5);
                } else {
                    int i13 = this.nextImage;
                    if (i13 < i12) {
                        if (param >= i12) {
                            imageReceiver.setImageX(measuredWidth + i6 + this.itemSpacing + (((imageReceiver.getParam() - this.currentImage) - 1) * (this.itemWidth + this.itemSpacing)) + i9);
                        } else if (param <= i13) {
                            int param2 = (imageReceiver.getParam() - this.currentImage) + 1;
                            int i14 = this.itemWidth;
                            int i15 = this.itemSpacing;
                            imageReceiver.setImageX((((param2 * (i14 + i15)) + measuredWidth) - (i15 + i10)) + i9);
                        } else {
                            imageReceiver.setImageX(((imageReceiver.getParam() - this.currentImage) * (this.itemWidth + this.itemSpacing)) + measuredWidth + i9);
                        }
                    } else if (param < i12) {
                        imageReceiver.setImageX(((imageReceiver.getParam() - this.currentImage) * (this.itemWidth + this.itemSpacing)) + measuredWidth + i9);
                    } else if (param <= i13) {
                        imageReceiver.setImageX(measuredWidth + i6 + this.itemSpacing + (((imageReceiver.getParam() - this.currentImage) - 1) * (this.itemWidth + this.itemSpacing)) + i9);
                    } else {
                        int i16 = measuredWidth + i6 + this.itemSpacing;
                        int param3 = (imageReceiver.getParam() - this.currentImage) - 2;
                        int i17 = this.itemWidth;
                        int i18 = this.itemSpacing;
                        imageReceiver.setImageX(i16 + (param3 * (i17 + i18)) + i18 + i10 + i9);
                    }
                    if (param == this.nextImage) {
                        imageReceiver.setImageWidth(i10 - i8);
                        imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i8 / 2)));
                    } else {
                        imageReceiver.setImageWidth(this.itemWidth);
                    }
                }
                imageReceiver.setAlpha(this.drawAlpha);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                imageReceiver.draw(canvas);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = currentTimeMillis;
            int i19 = this.animateToItem;
            if (i19 >= 0) {
                float f6 = this.moveLineProgress;
                if (f6 > 0.0f) {
                    float f7 = j;
                    float f8 = f6 - (f7 / (this.animateToItemFast ? 100.0f : 200.0f));
                    this.moveLineProgress = f8;
                    if (i19 == this.currentImage) {
                        float f9 = this.currentItemProgress;
                        if (f9 < 1.0f) {
                            float f10 = f9 + (f7 / 200.0f);
                            this.currentItemProgress = f10;
                            if (f10 > 1.0f) {
                                this.currentItemProgress = 1.0f;
                            }
                        }
                        this.drawDx = this.animateToDXStart + ((int) Math.ceil(this.currentItemProgress * (this.animateToDX - r1)));
                    } else {
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
                        this.nextItemProgress = cubicBezierInterpolator.getInterpolation(1.0f - f8);
                        if (this.stopedScrolling) {
                            float f11 = this.currentItemProgress;
                            if (f11 > 0.0f) {
                                float f12 = f11 - (f7 / 200.0f);
                                this.currentItemProgress = f12;
                                if (f12 < 0.0f) {
                                    this.currentItemProgress = 0.0f;
                                }
                            }
                            this.drawDx = this.animateToDXStart + ((int) Math.ceil(r6 * (this.animateToDX - r1)));
                        } else {
                            this.currentItemProgress = cubicBezierInterpolator.getInterpolation(this.moveLineProgress);
                            this.drawDx = (int) Math.ceil(this.nextItemProgress * this.animateToDX);
                        }
                    }
                    if (this.moveLineProgress <= 0.0f) {
                        this.currentImage = this.animateToItem;
                        this.moveLineProgress = 1.0f;
                        this.currentItemProgress = 1.0f;
                        this.nextItemProgress = 0.0f;
                        this.moving = false;
                        this.stopedScrolling = false;
                        this.drawDx = 0;
                        this.animateToItem = -1;
                        this.animateToItemFast = false;
                    }
                }
                fillImages(true, this.drawDx);
                invalidate();
            }
            if (this.scrolling) {
                float f13 = this.currentItemProgress;
                if (f13 > 0.0f) {
                    float f14 = f13 - (j / 200.0f);
                    this.currentItemProgress = f14;
                    if (f14 < 0.0f) {
                        this.currentItemProgress = 0.0f;
                    }
                    invalidate();
                }
            }
            if (this.scroll.isFinished()) {
                return;
            }
            if (this.scroll.computeScrollOffset()) {
                this.drawDx = this.scroll.getCurrX();
                updateAfterScroll();
                invalidate();
            }
            if (this.scroll.isFinished()) {
                stopScrolling();
            }
        }
    }

    public void setDelegate(GroupedPhotosListViewDelegate groupedPhotosListViewDelegate) {
        this.delegate = groupedPhotosListViewDelegate;
    }

    public boolean hasPhotos() {
        if (!this.hasPhotos || this.hideAnimator != null) {
            return false;
        }
        if (this.drawAlpha > 0.0f || !this.animateBackground) {
            return true;
        }
        ValueAnimator valueAnimator = this.showAnimator;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public void setAnimationsEnabled(boolean z) {
        if (this.animationsEnabled != z) {
            this.animationsEnabled = z;
            if (z) {
                return;
            }
            ValueAnimator valueAnimator = this.showAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.showAnimator = null;
            }
            ValueAnimator valueAnimator2 = this.hideAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.hideAnimator = null;
            }
            this.drawAlpha = 0.0f;
            invalidate();
        }
    }

    public void setAnimateBackground(boolean z) {
        this.animateBackground = z;
    }

    public void reset() {
        this.hasPhotos = false;
        if (this.animationsEnabled) {
            this.drawAlpha = 0.0f;
        }
    }
}
