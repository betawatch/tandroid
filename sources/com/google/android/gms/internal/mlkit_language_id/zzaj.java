package com.google.android.gms.internal.mlkit_language_id;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public enum zzaj implements zzet {
    zzd(0),
    zze(1),
    zzf(2),
    zzg(3),
    zzh(11),
    zzi(12),
    zzj(13),
    zzk(21),
    zzl(22),
    zzm(23),
    zzn(NotificationCenter.filePreparingStarted),
    zzo(NotificationCenter.fileNewChunkAvailable),
    zzp(NotificationCenter.filePreparingFailed),
    zzq(NotificationCenter.dialogsUnreadCounterChanged),
    zzr(NotificationCenter.recordProgressChanged),
    zzs(NotificationCenter.recordStarted),
    zzt(NotificationCenter.recordStartError),
    zzu(NotificationCenter.recordStopped),
    zza(NotificationCenter.audioRouteChanged),
    zzb(NotificationCenter.didStartedCall),
    zzc(NotificationCenter.groupCallSpeakingUsersUpdated),
    zzv(NotificationCenter.groupCallUpdated),
    zzw(NotificationCenter.groupCallVisibilityChanged),
    zzx(NotificationCenter.appDidLogout),
    zzy(NotificationCenter.configLoaded),
    zzz(NotificationCenter.needDeleteDialog),
    zzaa(NotificationCenter.newEmojiSuggestionsAvailable),
    zzab(NotificationCenter.didReceiveSmsCode),
    zzac(NotificationCenter.didReceiveCall),
    zzad(NotificationCenter.emojiLoaded),
    zzae(NotificationCenter.invalidateMotionBackground),
    zzaf(NotificationCenter.closeOtherAppActivities),
    zzag(NotificationCenter.storiesLimitUpdate),
    zzah(NotificationCenter.storiesSendAsUpdate),
    zzai(NotificationCenter.unconfirmedAuthUpdate),
    zzaj(NotificationCenter.dialogPhotosUpdate),
    zzak(NotificationCenter.uploadStoryProgress),
    zzal(NotificationCenter.uploadStoryEnd),
    zzam(NotificationCenter.customTypefacesLoaded),
    zzan(NotificationCenter.stealthModeChanged),
    zzao(NotificationCenter.onReceivedChannelDifference),
    zzap(321),
    zzaq(322),
    zzar(323),
    zzas(324),
    zzat(331),
    zzau(332),
    zzav(333),
    zzaw(334),
    zzax(341),
    zzay(342),
    zzaz(343),
    zzba(344),
    zzbb(351),
    zzbc(352),
    zzbd(353),
    zzbe(354),
    zzbf(31),
    zzbg(32),
    zzbh(33),
    zzbi(41),
    zzbj(42),
    zzbk(43),
    zzbl(51),
    zzbm(52),
    zzbn(53),
    zzbo(61),
    zzbp(62),
    zzbq(63),
    zzbr(71),
    zzbs(72),
    zzbt(73),
    zzbu(81),
    zzbv(82),
    zzbw(83),
    zzbx(91),
    zzby(92),
    zzbz(93),
    zzca(111),
    zzcb(112),
    zzcc(113),
    zzcd(121),
    zzce(122),
    zzcf(123),
    zzcg(NotificationCenter.walletSyncProgressChanged),
    zzch(NotificationCenter.httpFileDidLoad),
    zzci(NotificationCenter.httpFileDidFailedLoad),
    zzcj(102),
    zzck(103),
    zzcl(104),
    zzcm(105),
    zzcn(NotificationCenter.updateBotMenuButton),
    zzco(NotificationCenter.giftsToUserSent),
    zzcp(NotificationCenter.didStartedMultiGiftsSelector),
    zzcq(NotificationCenter.boostedChannelByUser),
    zzcr(100),
    zzcs(101),
    zzct(NotificationCenter.themeAccentListUpdated),
    zzcu(NotificationCenter.needCheckSystemBarColors),
    zzcv(NotificationCenter.didSetNewWallpapper),
    zzcw(NotificationCenter.savedMessagesForwarded),
    zzcx(NotificationCenter.emojiKeywordsLoaded),
    zzcy(NotificationCenter.smsJobStatusUpdate),
    zzcz(203),
    zzda(NotificationCenter.openBoostForUsersDialog),
    zzdb(NotificationCenter.groupRestrictionsUnlockedByBoosts),
    zzdc(NotificationCenter.chatWasBoostedByUser),
    zzdd(NotificationCenter.groupPackUpdated),
    zzde(NotificationCenter.timezonesUpdated),
    zzdf(NotificationCenter.customStickerCreated),
    zzdg(NotificationCenter.premiumFloodWaitReceived),
    zzdh(NotificationCenter.screenStateChanged),
    zzdi(NotificationCenter.didClearDatabase),
    zzdj(NotificationCenter.emojiPreviewThemesChanged),
    zzdk(NotificationCenter.currentUserPremiumStatusChanged),
    zzdl(NotificationCenter.premiumPromoUpdated),
    zzdm(NotificationCenter.premiumStatusChangedGlobal),
    zzdn(NotificationCenter.activityPermissionsGranted),
    zzdo(NotificationCenter.topicsDidLoaded),
    zzdp(361),
    zzdq(371);

    private static final zzes zzdr = new zzes() { // from class: com.google.android.gms.internal.mlkit_language_id.zzam
    };
    private final int zzds;

    zzaj(int i) {
        this.zzds = i;
    }

    public static zzev zzb() {
        return zzal.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzaj.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzds + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.mlkit_language_id.zzet
    public final int zza() {
        return this.zzds;
    }
}
