package org.scilab.forge.jlatexmath;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes3.dex */
class PredefMacroInfo extends MacroInfo {
    private int id;

    public PredefMacroInfo(int i, int i2, int i3) {
        super(i2, i3);
        this.id = i;
    }

    public PredefMacroInfo(int i, int i2) {
        super(i2);
        this.id = i;
    }

    @Override // org.scilab.forge.jlatexmath.MacroInfo
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.id, teXParser, strArr);
    }

    private static final Object invokeID(int i, TeXParser teXParser, String[] strArr) {
        try {
            switch (i) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 30:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 31:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case 58:
                    return PredefMacros.T_macro(teXParser, strArr);
                case 59:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case 60:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case 61:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case 76:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case 77:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case 78:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case 79:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case 81:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case 82:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case 83:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case 84:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case 85:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case 86:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case 87:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case 88:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case 89:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case 90:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case 91:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case 92:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case 93:
                case 94:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case 95:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case 97:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case 98:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case 99:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case 100:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case 102:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case 103:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case 104:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case 105:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case 106:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case 107:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case 108:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case 109:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case 110:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case 111:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case 112:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case 113:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case 114:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case 115:
                    return PredefMacros.left_macro(teXParser, strArr);
                case 116:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case 117:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case 118:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case 119:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case 120:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case 121:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case 122:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case 123:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case 124:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case 125:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case 126:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case NotificationCenter.needDeleteBusinessLink /* 127 */:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case NotificationCenter.messageTranslating /* 129 */:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case NotificationCenter.dialogIsTranslatable /* 130 */:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case NotificationCenter.dialogTranslate /* 131 */:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case NotificationCenter.didGenerateFingerprintKeyPair /* 132 */:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case NotificationCenter.walletPendingTransactionsChanged /* 133 */:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case NotificationCenter.walletSyncProgressChanged /* 134 */:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case NotificationCenter.httpFileDidLoad /* 135 */:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case NotificationCenter.httpFileDidFailedLoad /* 136 */:
                case NotificationCenter.didUpdateConnectionState /* 137 */:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case NotificationCenter.fileUploaded /* 138 */:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case NotificationCenter.fileUploadFailed /* 139 */:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case NotificationCenter.fileUploadProgressChanged /* 140 */:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case NotificationCenter.fileLoadProgressChanged /* 141 */:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case NotificationCenter.fileLoaded /* 142 */:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case NotificationCenter.fileLoadFailed /* 143 */:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case NotificationCenter.filePreparingStarted /* 144 */:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case NotificationCenter.fileNewChunkAvailable /* 145 */:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case NotificationCenter.filePreparingFailed /* 146 */:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case NotificationCenter.dialogsUnreadCounterChanged /* 147 */:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case NotificationCenter.messagePlayingProgressDidChanged /* 148 */:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case NotificationCenter.messagePlayingDidReset /* 149 */:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case 150:
                    return PredefMacros.big_macro(teXParser, strArr);
                case NotificationCenter.messagePlayingDidStart /* 151 */:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case NotificationCenter.messagePlayingDidSeek /* 152 */:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case NotificationCenter.messagePlayingGoingToStop /* 153 */:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case NotificationCenter.recordProgressChanged /* 154 */:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case NotificationCenter.recordStarted /* 155 */:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case NotificationCenter.recordStartError /* 156 */:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case NotificationCenter.recordStopped /* 157 */:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case NotificationCenter.recordPaused /* 158 */:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case NotificationCenter.recordResumed /* 159 */:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case NotificationCenter.screenshotTook /* 160 */:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case NotificationCenter.albumsDidLoad /* 161 */:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case NotificationCenter.audioDidSent /* 162 */:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case NotificationCenter.audioRecordTooShort /* 163 */:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case NotificationCenter.audioRouteChanged /* 164 */:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case NotificationCenter.didStartedCall /* 165 */:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case NotificationCenter.groupCallUpdated /* 166 */:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case NotificationCenter.storyGroupCallUpdated /* 167 */:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case NotificationCenter.groupCallSpeakingUsersUpdated /* 168 */:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case NotificationCenter.groupCallScreencastStateChanged /* 169 */:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case NotificationCenter.activeGroupCallsUpdated /* 170 */:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case NotificationCenter.applyGroupCallVisibleParticipants /* 171 */:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case NotificationCenter.groupCallTypingsUpdated /* 172 */:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case 173:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case NotificationCenter.closeInCallActivity /* 174 */:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case NotificationCenter.groupCallVisibilityChanged /* 175 */:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case NotificationCenter.liveStoryUpdated /* 176 */:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case NotificationCenter.liveStoryMessageUpdate /* 177 */:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case NotificationCenter.appDidLogout /* 178 */:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case NotificationCenter.configLoaded /* 179 */:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case NotificationCenter.needDeleteDialog /* 180 */:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case NotificationCenter.newEmojiSuggestionsAvailable /* 181 */:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case NotificationCenter.themeUploadedToServer /* 182 */:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case NotificationCenter.themeUploadError /* 183 */:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case NotificationCenter.dialogFiltersUpdated /* 184 */:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case NotificationCenter.filterSettingsUpdated /* 185 */:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case NotificationCenter.suggestedFiltersLoaded /* 186 */:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case NotificationCenter.updateBotMenuButton /* 187 */:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case NotificationCenter.giftsToUserSent /* 188 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case NotificationCenter.didStartedMultiGiftsSelector /* 189 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case NotificationCenter.boostedChannelByUser /* 190 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case NotificationCenter.boostByChannelCreated /* 191 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case NotificationCenter.didUpdatePremiumGiftStickers /* 192 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case NotificationCenter.didUpdateTonGiftStickers /* 193 */:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case NotificationCenter.didUpdatePremiumGiftFieldIcon /* 194 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case NotificationCenter.storiesEnabledUpdate /* 195 */:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case NotificationCenter.storiesBlocklistUpdate /* 196 */:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case NotificationCenter.storiesLimitUpdate /* 197 */:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case NotificationCenter.storiesSendAsUpdate /* 198 */:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case NotificationCenter.unconfirmedAuthUpdate /* 199 */:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case NotificationCenter.dialogPhotosUpdate /* 200 */:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case NotificationCenter.channelRecommendationsLoaded /* 201 */:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case NotificationCenter.savedMessagesDialogsUpdate /* 202 */:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case NotificationCenter.userIsPremiumBlockedUpadted /* 204 */:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case NotificationCenter.storyAlbumsCollectionsUpdate /* 205 */:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case NotificationCenter.savedMessagesForwarded /* 206 */:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case NotificationCenter.emojiKeywordsLoaded /* 207 */:
                case NotificationCenter.smsJobStatusUpdate /* 208 */:
                case NotificationCenter.storyQualityUpdate /* 209 */:
                case NotificationCenter.openBoostForUsersDialog /* 210 */:
                case NotificationCenter.groupRestrictionsUnlockedByBoosts /* 211 */:
                case NotificationCenter.chatWasBoostedByUser /* 212 */:
                case NotificationCenter.groupPackUpdated /* 213 */:
                case NotificationCenter.timezonesUpdated /* 214 */:
                case NotificationCenter.customStickerCreated /* 215 */:
                case NotificationCenter.premiumFloodWaitReceived /* 216 */:
                    return PredefMacros.size_macros(teXParser, strArr);
                case NotificationCenter.availableEffectsUpdate /* 217 */:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case NotificationCenter.starOptionsLoaded /* 218 */:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case NotificationCenter.starGiftOptionsLoaded /* 219 */:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case NotificationCenter.starGiveawayOptionsLoaded /* 220 */:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case NotificationCenter.starBalanceUpdated /* 221 */:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case NotificationCenter.starTransactionsLoaded /* 222 */:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case NotificationCenter.starSubscriptionsLoaded /* 223 */:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case NotificationCenter.factCheckLoaded /* 224 */:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case 225:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case NotificationCenter.botStarsTransactionsLoaded /* 226 */:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case NotificationCenter.channelStarsUpdated /* 227 */:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case NotificationCenter.webViewResolved /* 228 */:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case NotificationCenter.updateAllMessages /* 229 */:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case NotificationCenter.starGiftsLoaded /* 230 */:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case NotificationCenter.starUserGiftsLoaded /* 231 */:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case NotificationCenter.starUserGiftCollectionsLoaded /* 232 */:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case NotificationCenter.starGiftSoldOut /* 233 */:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case NotificationCenter.updateStories /* 234 */:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case NotificationCenter.botDownloadsUpdate /* 235 */:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case NotificationCenter.channelSuggestedBotsUpdate /* 236 */:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case NotificationCenter.channelConnectedBotsUpdate /* 237 */:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case NotificationCenter.adminedChannelsLoaded /* 238 */:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case NotificationCenter.messagesFeeUpdated /* 239 */:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case NotificationCenter.commonChatsLoaded /* 240 */:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case NotificationCenter.appConfigUpdated /* 241 */:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case NotificationCenter.activeAuctionsUpdated /* 242 */:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case NotificationCenter.conferenceEmojiUpdated /* 243 */:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case NotificationCenter.contentSettingsLoaded /* 244 */:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case NotificationCenter.musicListLoaded /* 245 */:
                    return PredefMacros.char_macro(teXParser, strArr);
                case NotificationCenter.musicIdsLoaded /* 246 */:
                case NotificationCenter.profileMusicUpdated /* 247 */:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case NotificationCenter.updatedChatRanks /* 248 */:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case NotificationCenter.joinedGroup /* 249 */:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case 250:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case NotificationCenter.pushMessagesUpdated /* 251 */:
                case NotificationCenter.wallpapersDidLoad /* 252 */:
                case NotificationCenter.wallpapersNeedReload /* 253 */:
                case NotificationCenter.didReceiveSmsCode /* 254 */:
                case NotificationCenter.didReceiveCall /* 255 */:
                case 256:
                case NotificationCenter.invalidateMotionBackground /* 257 */:
                case NotificationCenter.closeOtherAppActivities /* 258 */:
                case NotificationCenter.cameraInitied /* 259 */:
                case NotificationCenter.didReplacedPhotoInMemCache /* 260 */:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case NotificationCenter.didSetNewTheme /* 261 */:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case NotificationCenter.themeListUpdated /* 262 */:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case NotificationCenter.didApplyNewTheme /* 263 */:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case NotificationCenter.themeAccentListUpdated /* 264 */:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case NotificationCenter.needCheckSystemBarColors /* 265 */:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case NotificationCenter.needShareTheme /* 266 */:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case NotificationCenter.needSetDayNightTheme /* 267 */:
                    return PredefMacros.int_macro(teXParser, strArr);
                case NotificationCenter.goingToPreviewTheme /* 268 */:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case NotificationCenter.locationPermissionGranted /* 269 */:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case NotificationCenter.locationPermissionDenied /* 270 */:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case NotificationCenter.reloadInterface /* 271 */:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case NotificationCenter.suggestedLangpack /* 272 */:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case NotificationCenter.didSetNewWallpapper /* 273 */:
                    return PredefMacros.above_macro(teXParser, strArr);
                case NotificationCenter.proxySettingsChanged /* 274 */:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case NotificationCenter.proxyCheckDone /* 275 */:
                    return PredefMacros.st_macro(teXParser, strArr);
                case NotificationCenter.proxyChangedByRotation /* 276 */:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case NotificationCenter.liveLocationsChanged /* 277 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case NotificationCenter.newLocationAvailable /* 278 */:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case NotificationCenter.liveLocationsCacheChanged /* 279 */:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case NotificationCenter.notificationsCountUpdated /* 280 */:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case NotificationCenter.playerDidStartPlaying /* 281 */:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case NotificationCenter.closeSearchByActiveAction /* 282 */:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case NotificationCenter.messagePlayingSpeedChanged /* 283 */:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e.getMessage());
        }
    }
}
